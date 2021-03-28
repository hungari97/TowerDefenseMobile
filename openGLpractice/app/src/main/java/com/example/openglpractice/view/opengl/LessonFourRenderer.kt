package com.example.openglpractice.view.opengl

import android.content.Context
import android.opengl.GLES20
import android.opengl.GLSurfaceView
import android.opengl.Matrix
import com.example.openglpractice.R
import com.example.openglpractice.logic.AFeature
import com.example.openglpractice.presenter.GamePresenter
import com.example.openglpractice.view.opengl.TileType.*
import javax.microedition.khronos.opengles.GL10

class LessonFourRenderer(activityContext: Context, var presenter: GamePresenter) :
    GLSurfaceView.Renderer {
    private val mActivityContext: Context = activityContext

    val fieldMatrix = presenter.logicFieldMatrix()
    var featureMatrix = presenter.buildFeatureMatrix()
    var characterMatrix = presenter.buildCharacterMatrix()

    /** How many bytes per float.  */
    internal val mBytesPerFloat = 4

    /** Size of the position data in elements.  */
    internal val mPositionDataSize = 3
    /*       /** Size of the color data in elements.  */
           private val mColorDataSize = 4
           /** Size of the normal data in elements.  */
           private val mNormalDataSize = 3*/
    /** Size of the texture coordinate data in elements.  */
    internal val mTextureCoordinateDataSize = 2

    /** Store the view matrix. This can be thought of as our camera. This matrix transforms world space to eye space;
     * it positions things relative to our eye.     */
    internal val mViewMatrix = FloatArray(16)
    internal val mProjectionMatrix = FloatArray(16)

    /** This will be used to pass in the texture.  */
    internal var mTextureUniformHandle = 0


    /** This is a handle to our cube shading program.  */
    internal var mProgramHandle = 0

    /** This is a handle to our light point program.  */
    private var mPointProgramHandle = 0

    /** This is a handle to our texture data.  */
    private var mTextureDataHandle = 0

    private val gameLevelColoumSize = 14
    private val gameLevelRowSize = 8


    val layers = listOf<DrawableLayer>(

        FieldLayer(this),
        FeatureLayer(this),
        CharacterLayer(this)
    )

    protected val vertexShader: String by lazy {
        mActivityContext.resources.openRawResource(R.raw.per_pixel_vertex_shader).bufferedReader()
            .readLines().joinToString("\n")
    }
    protected val fragmentShader: String by lazy {
        mActivityContext.resources.openRawResource(R.raw.per_pixel_fragment_shader).bufferedReader()
            .readLines().joinToString("\n")
    }

    override fun onSurfaceCreated(
        glUnused: GL10?,
        config: javax.microedition.khronos.egl.EGLConfig?
    ) {
        // Set the background clear color to black.
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f)

        // Use culling to remove back faces.
        GLES20.glDisable(GLES20.GL_CULL_FACE)

        // Enable depth testing
        GLES20.glDisable(GLES20.GL_DEPTH_TEST)

        GLES20.glEnable(GLES20.GL_BLEND)
        GLES20.glBlendFunc(GLES20.GL_SRC_ALPHA, GLES20.GL_ONE_MINUS_SRC_ALPHA)

        val vertexShader = vertexShader
        val fragmentShader = fragmentShader
        val vertexShaderHandle: Int =
            ShaderHelper.compileShader(
                GLES20.GL_VERTEX_SHADER,
                vertexShader
            )
        val fragmentShaderHandle: Int =
            ShaderHelper.compileShader(
                GLES20.GL_FRAGMENT_SHADER,
                fragmentShader
            )
        mProgramHandle =
            ShaderHelper.createAndLinkProgram(
                vertexShaderHandle,
                fragmentShaderHandle,
                arrayOf("a_Position",/* "a_Color", "a_Normal",*/ "a_TexCoordinate")
            )

        // Load the texture
        layers.forEach {
            it.mTextureDataHandle = TextureHelper.loadTexture(mActivityContext, it.textureFile)
        }

        /*mTextureDataHandle =
            TextureHelper.loadTexture(
                mActivityContext,
                R.drawable.fieldtexture
            )*/
    }

    override fun onSurfaceChanged(glUnused: GL10, width: Int, height: Int) {
        // Set the OpenGL viewport to the same size as the surface.
        GLES20.glViewport(0, 0, width, height)

        // Create a new perspective projection matrix. The height will stay the same
        // while the width will vary as per aspect ratio.
        val ratio = width.toFloat() / height
        val left = -ratio
        val bottom = -1.0f
        val top = 1.0f
        val near = 1.0f
        val far = 10.0f
        Matrix.frustumM(mProjectionMatrix, 0, left, ratio, bottom, top, near, far)

        width / 14
        println("width: ${width}")
        println("height: ${height}")

        // Position the eye in front of the origin.
        val eyeX = 2.0f / height * width
        val eyeY = 2.0f
        val eyeZ = 1.0f

        // We are looking toward the distance
        val lookX = 2.0f / height * width
        val lookY = 2.0f
        val lookZ = 0.0f

        // Set our up vector. This is where our head would be pointing were we holding the camera.
        val upX = 0.0f
        val upY = 1.0f
        val upZ = 0.0f

        // Set the view matrix. This matrix can be said to represent the camera position.
        // NOTE: In OpenGL 1, a ModelView matrix is used, which is a combination of a model and
        // view matrix. In OpenGL 2, we can keep track of these matrices separately if we choose.
        Matrix.setLookAtM(mViewMatrix, 0, eyeX, eyeY, eyeZ, lookX, lookY, lookZ, upX, upY, upZ)
    }

    override fun onDrawFrame(glUnused: GL10) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT or GLES20.GL_DEPTH_BUFFER_BIT)

        /*val time = 360.0f / 10000.0f * (SystemClock.uptimeMillis() % 3000L).toInt()
        if (time.toInt() % 360 == 0) {
            if (mFieldTextureCurrentWindow[0] % 6 == 5)
                mFieldTextureCurrentWindow[0] = 0
            else
                mFieldTextureCurrentWindow[0]++
            fieldTextureCoordinateData = calculateTextureCoords(fieldTextureCoordinateData)
            mFieldTextureCoordinates.put(fieldTextureCoordinateData).position(0)
        }*/

        // Set our per-vertex lighting program.
        GLES20.glUseProgram(mProgramHandle)

        mTextureUniformHandle = GLES20.glGetUniformLocation(mProgramHandle, "u_Texture")
        // Set the active texture unit to texture unit 0.
        //GLES20.glActiveTexture(GLES20.GL_TEXTURE0)

        layers.forEach { it.draw() }

    }

    /**Initialize the model data.    */
    init {

        layers.forEach { it.initialize() }

    }

    fun characterUpdate() {
        characterMatrix = presenter.buildCharacterMatrix()
        layers[2].updateMatrix()
    }

    fun featureUpdate() {
        featureMatrix = presenter.buildFeatureMatrix()
        layers[1].updateMatrix()
    }

    private fun calculateTextureCoords(
        cubeTextureCoordinateData: FloatArray,
        texture: FloatArray,
        minus: Int
    ): FloatArray {
        var temp: FloatArray

        for (i in 0 until ((gameLevelColoumSize + minus) * (gameLevelRowSize + minus))) {
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
}
