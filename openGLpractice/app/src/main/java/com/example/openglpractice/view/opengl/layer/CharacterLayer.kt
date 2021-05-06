package com.example.openglpractice.view.opengl.layer

import android.opengl.GLES20
import android.opengl.Matrix
import android.renderscript.Matrix4f
import com.example.openglpractice.R
import com.example.openglpractice.logic.OLevelManager
import com.example.openglpractice.logic.character.ACharacter
import com.example.openglpractice.utility.EDirection.*
import com.example.openglpractice.utility.Vector
import com.example.openglpractice.utility.div
import com.example.openglpractice.view.opengl.Renderer
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer

class CharacterLayer(override val render: Renderer) : IDrawableLayer {
    override var rectengleCount: Int = 0
    var matrix: Array<Array<ACharacter<*>?>> = render.presenter.logicCharacterMatrix()[0]
    override var positionArray = FloatArray(rectengleCount * 3 * 6) { 0.0f }
    override var textureCoordArray = FloatArray(rectengleCount * 2 * 6) { 0.0f }

    override lateinit var mPositions: FloatBuffer
    override lateinit var mTextureCoordinates: FloatBuffer

    override var mPositionHandle: Int = 0
        private set
    override var mTextureCoordinateHandle: Int = 0
        private set
    override var mMVPMatrixHandle: Int = 0
        private set
    override var mTextureDataHandle: Int = 0

    override val textureFile: Int
        get() = R.drawable.character_texture
    override var mModelMatrix = Matrix4f(FloatArray(16))
        private set
    override var mMVPMatrix = Matrix4f(FloatArray(16))
        private set

    override fun initialize() {
        val characters = OLevelManager.characterPositionMatrix.reduce { left, right ->
            val newArray = Array(left.size + right.size) {
                if (it < left.size)
                    left[it]
                else
                    right[it - left.size]
            }
            newArray
        }.filterNotNull().toSet().map { it.data }
        rectengleCount = characters.size
        positionArray = FloatArray(rectengleCount * 3 * 6) { 0.0f }
        textureCoordArray = FloatArray(rectengleCount * 2 * 6) { 0.0f }
        characters.forEachIndexed { index, characterData ->
            val size: Vector<Float>
            val position: Vector<Float>
            when (characterData.rotation) {
                UP -> {
                    size = Vector(characterData.hitBoxSize.y, characterData.hitBoxSize.x) / 2.0f
                    position = characterData.hitBoxPosition.copy() / 2.0f
                }
                LEFT -> {
                    size = characterData.hitBoxSize.copy() / 2.0f
                    position = characterData.hitBoxPosition
                        .copy(x = characterData.hitBoxPosition.x + 1 - (size.x * 2).toInt()) / 2.0f
                }
                DOWN -> {
                    size = Vector(characterData.hitBoxSize.y, characterData.hitBoxSize.x) / 2.0f
                    position = characterData.hitBoxPosition
                        .copy(
                            x = characterData.hitBoxPosition.x + 1 - (size.x * 2).toInt(),
                            y = characterData.hitBoxPosition.y + 1 - (size.y * 2).toInt()
                        ) / 2.0f
                }
                RIGHT -> {
                    size = characterData.hitBoxSize.copy() / 2.0f
                    position = characterData.hitBoxPosition
                        .copy(y = characterData.hitBoxPosition.y + 1 - (size.y * 2).toInt()) / 2.0f
                }
            }
            val left = position.x
            val up = position.y + size.y
            val right = position.x + size.x
            val down = position.y

            positionArray[index * 18] = left
            positionArray[index * 18 + 1] = up

            positionArray[index * 18 + 3] = left
            positionArray[index * 18 + 4] = down

            positionArray[index * 18 + 6] = right
            positionArray[index * 18 + 7] = up

            positionArray[index * 18 + 9] = left
            positionArray[index * 18 + 10] = down

            positionArray[index * 18 + 12] = right
            positionArray[index * 18 + 13] = down

            positionArray[index * 18 + 15] = right
            positionArray[index * 18 + 16] = up

            (0..5).forEach {
                positionArray[index * 18 + 2 + it * 3] = 0.0f
            }
        }

        //The points texture position initialise
        characters.forEachIndexed { characterIndex, characterData ->
            characterData.functionality?.let { character ->
                cellTextureWithRotation(character)
                    .forEachIndexed { index, trapFloat ->
                        textureCoordArray[characterIndex * 2 * 6 + index] = trapFloat
                    }

            }
        }

        // Initialize feature the buffers.
        mPositions =
            ByteBuffer.allocateDirect(positionArray.size * render.mBytesPerFloat)
                .order(ByteOrder.nativeOrder()).asFloatBuffer()
        mPositions.put(positionArray).position(0)
        mTextureCoordinates =
            ByteBuffer.allocateDirect(textureCoordArray.size * render.mBytesPerFloat)
                .order(ByteOrder.nativeOrder()).asFloatBuffer()
        mTextureCoordinates.put(textureCoordArray).position(0)
    }

    private fun cellTextureWithRotation(
        it: ACharacter<*>,
    ): FloatArray {
        val temp: FloatArray = it.data.animationState.textureArray[it.data.animationProgress]

        when (it.data.rotation) {
            LEFT -> {
                return floatArrayOf(
                    temp[8],
                    temp[9],
                    temp[4],
                    temp[5],
                    temp[2],
                    temp[3],
                    temp[4],
                    temp[5],
                    temp[0],
                    temp[1],
                    temp[2],
                    temp[3]
                )
            }

            UP -> {
                return floatArrayOf(
                    temp[4],
                    temp[5],
                    temp[0],
                    temp[1],
                    temp[8],
                    temp[9],
                    temp[0],
                    temp[1],
                    temp[2],
                    temp[3],
                    temp[8],
                    temp[9]
                )
            }

            RIGHT -> {
                return temp
            }

            DOWN -> {
                return floatArrayOf(
                    temp[2],
                    temp[3],
                    temp[8],
                    temp[9],
                    temp[0],
                    temp[1],
                    temp[8],
                    temp[9],
                    temp[4],
                    temp[5],
                    temp[0],
                    temp[1]
                )
            }

        }
    }

    override fun draw() {
        // Set the active texture unit to texture unit 0.
        GLES20.glActiveTexture(GLES20.GL_TEXTURE0)

        // Bind the texture to this unit.
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, mTextureDataHandle)

        // Tell the texture uniform sampler to use this texture in the shader by binding to texture unit 0.
        GLES20.glUniform1i(render.mTextureUniformHandle, 0)

        // Set program handles for cube drawing.
        mMVPMatrixHandle = GLES20.glGetUniformLocation(render.mProgramHandle, "u_MVPMatrix")
        mPositionHandle = GLES20.glGetAttribLocation(render.mProgramHandle, "a_Position")
        mTextureCoordinateHandle =
            GLES20.glGetAttribLocation(render.mProgramHandle, "a_TexCoordinate")

        // Pass in the position information
        mPositions.position(0)
        GLES20.glVertexAttribPointer(
            mPositionHandle, render.mPositionDataSize, GLES20.GL_FLOAT, false,
            0, mPositions
        )
        GLES20.glEnableVertexAttribArray(mPositionHandle)

        // Pass in the texture coordinate information
        mTextureCoordinates.position(0)
        GLES20.glVertexAttribPointer(
            mTextureCoordinateHandle,
            render.mTextureCoordinateDataSize,
            GLES20.GL_FLOAT,
            false,
            0,
            mTextureCoordinates
        )
        GLES20.glEnableVertexAttribArray(mTextureCoordinateHandle)
        Matrix.setIdentityM(mModelMatrix.array, 0)
        Matrix.translateM(mModelMatrix.array, 0, 0.0f, 0.0f, -1.0f)

        mMVPMatrix.loadIdentity()
        mMVPMatrix.multiply(render.mProjectionMatrix)
        mMVPMatrix.multiply(render.mViewMatrix)
        mMVPMatrix.multiply(mModelMatrix)

        // Pass in the combined matrix.
        GLES20.glUniformMatrix4fv(mMVPMatrixHandle, 1, false, mMVPMatrix.array, 0)

        // Draw the cube.
        GLES20.glDrawArrays(
            GLES20.GL_TRIANGLES,
            0,
            positionArray.size / render.mPositionDataSize
        )
    }

    override fun updateMatrix() {
        matrix = render.presenter.logicCharacterMatrix()[0]
        initialize()
    }
}