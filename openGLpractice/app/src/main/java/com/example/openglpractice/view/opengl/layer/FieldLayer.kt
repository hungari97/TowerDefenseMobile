package com.example.openglpractice.view.opengl.layer

import android.opengl.GLES20
import android.renderscript.Matrix4f
import com.example.openglpractice.R
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.view.opengl.Renderer
import com.example.openglpractice.view.opengl.TileType
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer

class FieldLayer(override val render: Renderer) :
    IDrawableLayer {

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

    override var mModelMatrix: Matrix4f = Matrix4f(FloatArray(16))
        private set
    override var mMVPMatrix: Matrix4f = Matrix4f(FloatArray(16))
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
    private fun loadGridToPositionArray(){
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
    }
    private fun loadFloatArraysToBuffers(){
        // Initialize field the buffers.
        mPositions = ByteBuffer.allocateDirect(positionArray.size * render.mBytesPerFloat)
            .order(ByteOrder.nativeOrder()).asFloatBuffer()
        mPositions.put(positionArray).position(0)
        mTextureCoordinates =
            ByteBuffer.allocateDirect(textureCoordArray.size * render.mBytesPerFloat)
                .order(ByteOrder.nativeOrder()).asFloatBuffer()
        mTextureCoordinates.put(textureCoordArray).position(0)
    }
    private val directionLetters= arrayOf('L','U','R','D')
    private val directions= EDirection.values().map { it.vector }
    override fun initialize() {
        loadGridToPositionArray()

        var directionString = StringBuilder("")
        var temp: FloatArray
        var rectangleStartIndex = 0
        for (row in render.fieldMatrix.indices) {
            for (cell in render.fieldMatrix[row].indices) {
                directionString = directionString.clear()
                for(index in 0 until 4){
                    if (cell - directions[index].x !in render.fieldMatrix[row].indices ||
                        row + directions[index].y !in render.fieldMatrix.indices) {
                        directionString.append('X')
                    } else {
                        if (render.fieldMatrix[row + directions[index].y][cell - directions[index].x].data.type == render.fieldMatrix[row][cell].data.type) {
                            directionString.append(directionLetters[index])
                        } else {
                            directionString.append('X')
                        }
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

        loadFloatArraysToBuffers()
    }

    fun typeToTexture(type: Int, direction: String): FloatArray {
        val directionNames = arrayOf(
            "LURD",
            "XURD",
            "LXRD",
            "LUXD",
            "LURX",
            "XXRD",
            "XUXD",
            "XURX",
            "LXXD",
            "LXRX",
            "LUXX",
            "LXXX",
            "XUXX",
            "XXRX",
            "XXXD",
            "XXXX")
        val directionIndex = directionNames.indexOf(direction)
        if (directionIndex == -1) throw Exception("Nem jó a textura meghatározás")
        return TileType.values()[type * 16 + directionIndex].textureIndexes
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

        mModelMatrix.loadIdentity()
        mModelMatrix.translate(0.0f, 0.0f, -1.0f)

        mMVPMatrix.loadIdentity()
        mMVPMatrix.multiply(render.mProjectionMatrix)
        mMVPMatrix.multiply(render.mViewMatrix)
        mMVPMatrix.multiply(mModelMatrix)

        // Pass in the combined matrix.
        GLES20.glUniformMatrix4fv(mMVPMatrixHandle, 1, false, mMVPMatrix.array, 0)

        // Draw 
        GLES20.glDrawArrays(
            GLES20.GL_TRIANGLES,
            0,
            positionArray.size / render.mPositionDataSize
        )
    }

    override fun updateMatrix() {

    }


}