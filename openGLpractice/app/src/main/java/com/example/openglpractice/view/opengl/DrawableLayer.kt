package com.example.openglpractice.view.opengl

import com.example.openglpractice.logic.AFeature
import java.nio.FloatBuffer

interface DrawableLayer {
    val render: LessonFourRenderer
    val positionArray:FloatArray
    val textureCoordArray:FloatArray
    val rectengleCount:Int

     val mPositions: FloatBuffer
//     val mColors: FloatBuffer
//     val mNormals: FloatBuffer
     val mTextureCoordinates: FloatBuffer

    /** This will be used to pass in model position information.  */
     val mPositionHandle :Int
    /** This will be used to pass in model color information.  */
//     val mColorHandle :Int
    /** This will be used to pass in model normal information.  */
//     val mNormalHandle :Int
    /** This will be used to pass in model texture coordinate information.  */
     val mTextureCoordinateHandle :Int
    /** This will be used to pass in the transformation matrix.  */
    val mMVPMatrixHandle:Int
    /** This is a handle to our texture data.  */
    var mTextureDataHandle:Int

    val textureFile:Int



    /** Store the model matrix. This matrix is used to move models from object space (where each model can be thought
     * of being located at the center of the universe) to world space.     */
    val mModelMatrix:FloatArray
    /** Store the projection matrix. This is used to project the scene onto a 2D viewport.  */
    val mMVPMatrix : FloatArray

    fun initialize()
    fun draw()
    fun updateMatrix()

    fun calculateTextureCoords(cubeTextureCoordinateData: FloatArray,texture:FloatArray): FloatArray {
        var temp: FloatArray
        for (i in 0 until (rectengleCount)) {
            temp = texture

            cubeTextureCoordinateData[i * 12] = temp[0]
            cubeTextureCoordinateData[i * 12 + 1] = temp[1]

            cubeTextureCoordinateData[i * 12 + 2] = temp[2]
            cubeTextureCoordinateData[i * 12 + 3] = temp[3]

            cubeTextureCoordinateData[i * 12 + 4] = temp[4]
            cubeTextureCoordinateData[i * 12 + 5] = temp[5]

            cubeTextureCoordinateData[i * 12 + 6] = temp[6]
            cubeTextureCoordinateData[i * 12 + 7] = temp[7]

            cubeTextureCoordinateData[i * 12 + 8] = temp[8]
            cubeTextureCoordinateData[i * 12 + 9] = temp[9]

            cubeTextureCoordinateData[i * 12 + 10] = temp[10]
            cubeTextureCoordinateData[i * 12 + 11] = temp[11]
        }
        return cubeTextureCoordinateData
    }

    fun initializeARectangleWithTextureCoord(rectangle:FloatArray,texture: FloatArray):FloatArray{
        rectangle[0] = texture[0]
        rectangle[1] = texture[1]

        rectangle[2] = texture[2]
        rectangle[3] = texture[3]

        rectangle[4] = texture[4]
        rectangle[5] = texture[5]

        rectangle[6] = texture[6]
        rectangle[7] = texture[7]

        rectangle[8] = texture[8]
        rectangle[9] = texture[9]

        rectangle[10] = texture[10]
        rectangle[11] = texture[11]

        return rectangle
    }
}