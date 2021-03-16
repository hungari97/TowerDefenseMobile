package com.example.openglpractice.view.opengl

import android.opengl.GLES20
import android.opengl.Matrix
import com.example.openglpractice.R
import com.example.openglpractice.logic.AFeature
import java.lang.Exception
import java.lang.StringBuilder
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer

class FieldLayer(override val render: LessonFourRenderer) :
    DrawableLayer {
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

        var directionString = StringBuilder("")
        var temp: FloatArray
        var rectangleStartIndex: Int = 0
        for (row in 0 until render.fieldMatrix.size) {
            for (cell in 0 until render.fieldMatrix[row].size) {
                directionString = directionString.clear()
                if (cell == render.fieldMatrix[row].size - 1) {
                    //Left side
                    directionString.append('X')
                } else {
                    if (render.fieldMatrix[row][cell + 1].data.type == render.fieldMatrix[row][cell].data.type) {
                        //L van
                        directionString.append('L')
                    } else {
                        //L nincs
                        directionString.append('X')
                    }
                }
                if (row == render.fieldMatrix.size - 1) {
                    //Top side
                    directionString.append('X')
                } else {
                    if (render.fieldMatrix[row + 1][cell].data.type == render.fieldMatrix[row][cell].data.type) {
                        //U van
                        directionString.append('U')
                    } else {
                        //U nincs
                        directionString.append('X')
                    }
                }
                if (cell == 0) {
                    //Right side
                    directionString.append('X')
                } else {
                    if (render.fieldMatrix[row][cell - 1].data.type == render.fieldMatrix[row][cell].data.type) {
                        //R van
                        directionString.append('R')
                    } else {
                        //R nincs
                        directionString.append('X')
                    }
                }
                if (row == 0) {
                    //Bottom side
                    directionString.append('X')
                } else {
                    if (render.fieldMatrix[row - 1][cell].data.type == render.fieldMatrix[row][cell].data.type) {
                        //D van

                        directionString.append('D')
                    } else {
                        //D nincs
                        directionString.append('X')
                    }
                }
                temp = typeToTexture(
                    render.fieldMatrix[row][cell].data.type,
                    directionString.toString()
                )
                temp.forEach {
                    textureCoordArray[rectangleStartIndex] = it
                    rectangleStartIndex++
                }
            }
        }

        // Initialize field the buffers.
        mPositions = ByteBuffer.allocateDirect(positionArray.size * render.mBytesPerFloat)
            .order(ByteOrder.nativeOrder()).asFloatBuffer()
        mPositions.put(positionArray).position(0)
        mTextureCoordinates =
            ByteBuffer.allocateDirect(textureCoordArray.size * render.mBytesPerFloat)
                .order(ByteOrder.nativeOrder()).asFloatBuffer()
        mTextureCoordinates.put(textureCoordArray).position(0)
    }

    fun typeToTexture(type: Int, direction: String): FloatArray {
        when (type) {
            0 -> when (direction) {
                "LURD" -> return TileType.FLOOR_LURD.textureIndexes
                "XURD" -> return TileType.FLOOR_XURD.textureIndexes
                "LXRD" -> return TileType.FLOOR_LXRD.textureIndexes
                "LUXD" -> return TileType.FLOOR_LUXD.textureIndexes
                "LURX" -> return TileType.FLOOR_LURX.textureIndexes
                "XXRD" -> return TileType.FLOOR_XXRD.textureIndexes
                "XUXD" -> return TileType.FLOOR_XUXD.textureIndexes
                "XURX" -> return TileType.FLOOR_XURX.textureIndexes
                "LXXD" -> return TileType.FLOOR_LXXD.textureIndexes
                "LXRX" -> return TileType.FLOOR_LXRX.textureIndexes
                "LUXX" -> return TileType.FLOOR_LUXX.textureIndexes
                "LXXX" -> return TileType.FLOOR_LXXX.textureIndexes
                "XUXX" -> return TileType.FLOOR_XUXX.textureIndexes
                "XXRX" -> return TileType.FLOOR_XXRX.textureIndexes
                "XXXD" -> return TileType.FLOOR_XXXD.textureIndexes
                "XXXX" -> return TileType.FLOOR_XXXX.textureIndexes
            }
            1 -> when (direction) {
                "LURD" -> return TileType.WALL_LURD.textureIndexes
                "XURD" -> return TileType.WALL_XURD.textureIndexes
                "LXRD" -> return TileType.WALL_LXRD.textureIndexes
                "LUXD" -> return TileType.WALL_LUXD.textureIndexes
                "LURX" -> return TileType.WALL_LURX.textureIndexes
                "XXRD" -> return TileType.WALL_XXRD.textureIndexes
                "XUXD" -> return TileType.WALL_XUXD.textureIndexes
                "XURX" -> return TileType.WALL_XURX.textureIndexes
                "LXXD" -> return TileType.WALL_LXXD.textureIndexes
                "LXRX" -> return TileType.WALL_LXRX.textureIndexes
                "LUXX" -> return TileType.WALL_LUXX.textureIndexes
                "LXXX" -> return TileType.WALL_LXXX.textureIndexes
                "XUXX" -> return TileType.WALL_XUXX.textureIndexes
                "XXRX" -> return TileType.WALL_XXRX.textureIndexes
                "XXXD" -> return TileType.WALL_XXXD.textureIndexes
                "XXXX" -> return TileType.WALL_XXXX.textureIndexes
            }
            2 -> when (direction) {
                "LURD" -> return TileType.PIT_LURD.textureIndexes
                "XURD" -> return TileType.PIT_XURD.textureIndexes
                "LXRD" -> return TileType.PIT_LXRD.textureIndexes
                "LUXD" -> return TileType.PIT_LUXD.textureIndexes
                "LURX" -> return TileType.PIT_LURX.textureIndexes
                "XXRD" -> return TileType.PIT_XXRD.textureIndexes
                "XUXD" -> return TileType.PIT_XUXD.textureIndexes
                "XURX" -> return TileType.PIT_XURX.textureIndexes
                "LXXD" -> return TileType.PIT_LXXD.textureIndexes
                "LXRX" -> return TileType.PIT_LXRX.textureIndexes
                "LUXX" -> return TileType.PIT_LUXX.textureIndexes
                "LXXX" -> return TileType.PIT_LXXX.textureIndexes
                "XUXX" -> return TileType.PIT_XUXX.textureIndexes
                "XXRX" -> return TileType.PIT_XXRX.textureIndexes
                "XXXD" -> return TileType.PIT_XXXD.textureIndexes
                "XXXX" -> return TileType.PIT_XXXX.textureIndexes
            }
            3 -> when (direction) {
                "LURD" -> return TileType.WATER_LURD.textureIndexes
                "XURD" -> return TileType.WATER_XURD.textureIndexes
                "LXRD" -> return TileType.WATER_LXRD.textureIndexes
                "LUXD" -> return TileType.WATER_LUXD.textureIndexes
                "LURX" -> return TileType.WATER_LURX.textureIndexes
                "XXRD" -> return TileType.WATER_XXRD.textureIndexes
                "XUXD" -> return TileType.WATER_XUXD.textureIndexes
                "XURX" -> return TileType.WATER_XURX.textureIndexes
                "LXXD" -> return TileType.WATER_LXXD.textureIndexes
                "LXRX" -> return TileType.WATER_LXRX.textureIndexes
                "LUXX" -> return TileType.WATER_LUXX.textureIndexes
                "LXXX" -> return TileType.WATER_LXXX.textureIndexes
                "XUXX" -> return TileType.WATER_XUXX.textureIndexes
                "XXRX" -> return TileType.WATER_XXRX.textureIndexes
                "XXXD" -> return TileType.WATER_XXXD.textureIndexes
                "XXXX" -> return TileType.WATER_XXXX.textureIndexes
            }
        }

        return throw Exception("Nem jó a textura meghatározás")
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

        // Draw 
        GLES20.glDrawArrays(
            GLES20.GL_TRIANGLES,
            0,
            positionArray.size / render.mPositionDataSize
        )
    }

    override fun updateMatrix() {

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
    override var mTextureDataHandle: Int = 0
    override val textureFile: Int
        get() = R.drawable.fieldtexture


}