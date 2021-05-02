package com.example.openglpractice.view.opengl.layer

import android.opengl.GLES20
import android.opengl.Matrix
import android.renderscript.Matrix4f
import com.example.openglpractice.R
import com.example.openglpractice.logic.character.ACharacter
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.view.opengl.Renderer
import com.example.openglpractice.view.opengl.TileType
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import kotlin.math.abs

class CharacterLayer(override val render: Renderer) : IDrawableLayer {
    private var columnCount: Int = 14
        set(value) {
            field = value
            rectengleCount = value * rowCount
            positionArray = FloatArray(value * rowCount * 2 * 3 * 3)
            textureCoordArray = FloatArray(value * rowCount * 2 * 6)
            initialize()
        }
    private var rowCount: Int = 8
        set(value) {
            field = value
            rectengleCount = columnCount * value
            positionArray = FloatArray(value * columnCount * 2 * 3 * 3)
            textureCoordArray = FloatArray(value * columnCount * 2 * 6)
            initialize()
        }

    override var rectengleCount: Int = columnCount * rowCount
        private set
    var matrix: Array<Array<ACharacter<*>?>> = render.presenter.logicCharacterMatrix()[0]
    override var positionArray = FloatArray(rectengleCount * 2 * 3 * render.mPositionDataSize)
    override var textureCoordArray =
        FloatArray(rectengleCount * 2 * 3 * render.mTextureCoordinateDataSize)

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
    override var mModelMatrix = Matrix4f( FloatArray(16))
        private set
    override var mMVPMatrix = Matrix4f(FloatArray(16))
        private set

    override fun initialize() {
        for (column in 0 until columnCount) {
            for (row in 0 until rowCount) {
                positionArray[row * 18 * columnCount + column * 18] = (column.toFloat() / 2)
                positionArray[row * 18 * columnCount + column * 18 + 1] = (row.toFloat() / 2 + 0.5f)
                positionArray[row * 18 * columnCount + column * 18 + 2] = 0.0f

                positionArray[row * 18 * columnCount + column * 18 + 3] = (column.toFloat() / 2)
                positionArray[row * 18 * columnCount + column * 18 + 4] = (row.toFloat() / 2)
                positionArray[row * 18 * columnCount + column * 18 + 5] = 0.0f

                positionArray[row * 18 * columnCount + column * 18 + 6] =
                    (column.toFloat() / 2 + 0.5f)
                positionArray[row * 18 * columnCount + column * 18 + 7] = (row.toFloat() / 2 + 0.5f)
                positionArray[row * 18 * columnCount + column * 18 + 8] = 0.0f

                positionArray[row * 18 * columnCount + column * 18 + 9] = column.toFloat() / 2
                positionArray[row * 18 * columnCount + column * 18 + 10] = (row.toFloat() / 2)
                positionArray[row * 18 * columnCount + column * 18 + 11] = 0.0f

                positionArray[row * 18 * columnCount + column * 18 + 12] =
                    (column.toFloat() / 2 + 0.5f)
                positionArray[row * 18 * columnCount + column * 18 + 13] = (row.toFloat() / 2)
                positionArray[row * 18 * columnCount + column * 18 + 14] = 0.0f

                positionArray[row * 18 * columnCount + column * 18 + 15] =
                    (column.toFloat() / 2 + 0.5f)
                positionArray[row * 18 * columnCount + column * 18 + 16] =
                    (row.toFloat() / 2 + 0.5f)
                positionArray[row * 18 * columnCount + column * 18 + 17] = 0.0f

            }
        }

        //The points texture position initialise
        var rectangleStartIndex = 0
        for (row in matrix.indices) {
            for (cell in matrix[row].indices) {
                matrix[row][cell]?.let {
                    cellTextureWithRotation(row, cell, it).forEachIndexed { _, trapFloat ->
                        textureCoordArray[rectangleStartIndex] = trapFloat
                        rectangleStartIndex++
                    }
                } ?: TileType.CHARACTER_NOTHING.textureIndexes.forEachIndexed { _, trapFloat ->
                    textureCoordArray[rectangleStartIndex] = trapFloat
                    rectangleStartIndex++
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
        row: Int,
        cell: Int,
        it: ACharacter<*>,
    ): FloatArray {
        val sor: Int
        val oszlop: Int
        val temp: FloatArray
        if (it.data.rotation == EDirection.LEFT || it.data.rotation == EDirection.RIGHT) {
            sor = abs(it.data.hitBoxPosition.y - row)
            oszlop = abs(it.data.hitBoxPosition.x - cell)
            temp =
                it.data.animationState.textureArray[it.data.animationProgress * it.data.hitBoxSize.x * it.data.hitBoxSize.y
                        + sor * it.data.hitBoxSize.x + oszlop]

        } else {
            sor = abs(it.data.hitBoxPosition.y - row)
            oszlop = abs(it.data.hitBoxPosition.x - cell)
            temp =
                it.data.animationState.textureArray[it.data.animationProgress * it.data.hitBoxSize.x * it.data.hitBoxSize.y + sor * it.data.hitBoxSize.y + oszlop]
        }

        when (it.data.rotation) {
            EDirection.LEFT -> {
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

            EDirection.UP -> {
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

            EDirection.RIGHT -> {
                return temp
            }

            EDirection.DOWN -> {
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