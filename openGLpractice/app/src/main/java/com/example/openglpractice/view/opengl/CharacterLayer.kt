package com.example.openglpractice.view.opengl

import android.opengl.GLES20
import android.opengl.Matrix
import com.example.openglpractice.R
import com.example.openglpractice.logic.AFeature
import com.example.openglpractice.logic.Character
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import kotlin.math.abs

class CharacterLayer(override val render: LessonFourRenderer) : DrawableLayer {
    var columnCount: Int = 14
        set(value) {
            field = value
            rectengleCount = value * rowCount
            positionArray = FloatArray(value * rowCount * 2 * 3 * 3)
            textureCoordArray = FloatArray(value * rowCount * 2 * 6)
            initialize()
        }
    var rowCount: Int = 8
        set(value) {
            field = value
            rectengleCount = columnCount * value
            positionArray = FloatArray(value * columnCount * 2 * 3 * 3)
            textureCoordArray = FloatArray(value * columnCount * 2 * 6)
            initialize()
        }

    override var rectengleCount: Int = columnCount * rowCount
        private set
    var matrix: Array<Array<Character<*>?>> = render.presenter.buildCharacterMatrix()[0]
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
        get() = R.drawable.player_texture
    override var mModelMatrix = FloatArray(16)
        private set
    override var mMVPMatrix = FloatArray(16)
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
        for (row in 0 until matrix.size) {
            for (cell in 0 until matrix[row].size) {
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

    fun cellTextureWithRotation(
        row: Int,
        cell: Int,
        it: Character<*>,
    ): FloatArray {
        val sor: Int
        val oszlop: Int
        val temp: FloatArray
        if (it.data.rotation == 0.toByte() || it.data.rotation == 2.toByte()) {
            sor = abs(it.data.hitBoxPosition.y.toInt() - row)
            oszlop = abs(it.data.hitBoxPosition.x.toInt() - cell)
            temp =
                it.data.animationState.textureArray[it.data.currentAnimationProgress * it.data.hitBoxSize.x.toInt() * it.data.hitBoxSize.y.toInt()
                        + sor * it.data.hitBoxSize.x.toInt() + oszlop]

        } else {
            sor = Math.abs(it.data.hitBoxPosition.y.toInt() - row)
            oszlop = Math.abs(it.data.hitBoxPosition.x.toInt() - cell)
            temp =
                it.data.animationState.textureArray[it.data.currentAnimationProgress * it.data.hitBoxSize.x.toInt() * it.data.hitBoxSize.y.toInt() + sor * it.data.hitBoxSize.y.toInt() + oszlop]
        }

        when (it.data.rotation) {
            0.toByte() -> {
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
            1.toByte() -> {
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
            2.toByte() -> {
                return temp
            }
            3.toByte() -> {
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

        return it.data.animationState.textureArray[it.data.currentAnimationProgress * it.data.hitBoxSize.x.toInt() * it.data.hitBoxSize.y.toInt() + sor * it.data.hitBoxSize.x.toInt() + oszlop]
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

        Matrix.setIdentityM(mModelMatrix, 0)
        Matrix.translateM(mModelMatrix, 0, 0.0f, 0.0f, -1.0f)

        // This multiplies the view matrix by the model matrix, and stores the result in the MVP matrix (which currently contains model * view).
        Matrix.multiplyMM(mMVPMatrix, 0, render.mViewMatrix, 0, mModelMatrix, 0)
        // This multiplies the modelview matrix by the projection matrix, and stores the result in the MVP matrix (which now contains model * view * projection).
        Matrix.multiplyMM(mMVPMatrix, 0, render.mProjectionMatrix, 0, mMVPMatrix, 0)

        // Pass in the combined matrix.
        GLES20.glUniformMatrix4fv(mMVPMatrixHandle, 1, false, mMVPMatrix, 0)

        // Draw the cube.
        GLES20.glDrawArrays(
            GLES20.GL_TRIANGLES,
            0,
            positionArray.size / render.mPositionDataSize
        )
    }

    override fun updateMatrix() {
        matrix = render.presenter.buildCharacterMatrix()[0]
        initialize()
    }
}