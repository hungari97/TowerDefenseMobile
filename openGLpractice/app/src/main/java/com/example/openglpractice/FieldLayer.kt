package com.example.openglpractice

import android.opengl.GLES20
import android.opengl.Matrix
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer

class FieldLayer(override val render: LessonFourRenderer, val move: Float) : DrawableLayer {
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
        if (move == 1.0f)
            textureCoordArray = calculateTextureCoords(
                textureCoordArray,
                TileType.WALL.textureIndexes
            )
        else
            textureCoordArray = calculateTextureCoords(
                textureCoordArray,
                TileType.ENEMY.textureIndexes
            )

        // Initialize field the buffers.
        mPositions =
            ByteBuffer.allocateDirect(positionArray.size * render.mBytesPerFloat)
                .order(ByteOrder.nativeOrder()).asFloatBuffer()
        mPositions.put(positionArray).position(0)
        mTextureCoordinates =
            ByteBuffer.allocateDirect(textureCoordArray.size * render.mBytesPerFloat)
                .order(ByteOrder.nativeOrder()).asFloatBuffer()
        mTextureCoordinates.put(textureCoordArray).position(0)
    }

    override fun draw() {
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
        Matrix.translateM(mModelMatrix, 0, move, 0.0f, -1.0f+move*-0.001f)

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

    var columnCount: Int = 14
        set(value) {
            field = value
            positionArray = FloatArray(value * rowCount * 2 * 3 * 3)
            textureCoordArray = FloatArray(value * rowCount * 2 * 6)
            initialize()
        }
    var rowCount: Int = 8
        set(value) {
            field = value
            positionArray = FloatArray(value * columnCount * 2 * 3 * 3)
            textureCoordArray = FloatArray(value * columnCount * 2 * 6)
            initialize()
        }
    override val rectengleCount: Int
        get() = columnCount * rowCount

    override var positionArray: FloatArray = FloatArray(rectengleCount * 2 * 3 * 3)
        private set
    override var textureCoordArray: FloatArray = FloatArray(rectengleCount * 2 * 6)
        private set

    override lateinit var mPositions: FloatBuffer
        private set
    override lateinit var mTextureCoordinates: FloatBuffer
        private set

    override var mModelMatrix: FloatArray = FloatArray(16)
        private set
    override var mMVPMatrix: FloatArray = FloatArray(16)
        private set

    override var mPositionHandle: Int = 0
        private set
    override var mTextureCoordinateHandle: Int = 0
        private set
    override var mMVPMatrixHandle: Int = 0
        private set


}