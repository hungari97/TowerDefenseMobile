package com.example.openglpractice.view.opengl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0014\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010G\u001a\u0002052\u0006\u0010H\u001a\u0002052\u0006\u0010I\u001a\u0002052\u0006\u0010J\u001a\u00020\"H\u0002J\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020LJ\u0010\u0010N\u001a\u00020L2\u0006\u0010O\u001a\u00020PH\u0016J \u0010Q\u001a\u00020L2\u0006\u0010O\u001a\u00020P2\u0006\u0010R\u001a\u00020\"2\u0006\u0010S\u001a\u00020\"H\u0016J\u001c\u0010T\u001a\u00020L2\b\u0010O\u001a\u0004\u0018\u00010P2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016R4\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\b0\b0\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\b0\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b0\b\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010!\u001a\u00020\"X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u000e\u0010)\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\"X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020\"X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u001a\u00100\u001a\u00020\"X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u00103R\u0014\u00104\u001a\u000205X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\"X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u000e\u0010:\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u00020\"X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010,\"\u0004\b=\u00103R\u0014\u0010>\u001a\u000205X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001b\u0010D\u001a\u00020\u001c8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010 \u001a\u0004\bE\u0010\u001e\u00a8\u0006W"}, d2 = {"Lcom/example/openglpractice/view/opengl/LessonFourRenderer;", "Landroid/opengl/GLSurfaceView$Renderer;", "activityContext", "Landroid/content/Context;", "presenter", "Lcom/example/openglpractice/presenter/GamePresenter;", "(Landroid/content/Context;Lcom/example/openglpractice/presenter/GamePresenter;)V", "characterMatrix", "", "Lcom/example/openglpractice/logic/Character;", "getCharacterMatrix", "()[[[Lcom/example/openglpractice/logic/Character;", "setCharacterMatrix", "([[[Lcom/example/openglpractice/logic/Character;)V", "[[[Lcom/example/openglpractice/logic/Character;", "featureMatrix", "Lcom/example/openglpractice/logic/AFeature;", "getFeatureMatrix", "()[[Lcom/example/openglpractice/logic/AFeature;", "setFeatureMatrix", "([[Lcom/example/openglpractice/logic/AFeature;)V", "[[Lcom/example/openglpractice/logic/AFeature;", "fieldMatrix", "Lcom/example/openglpractice/logic/Field;", "getFieldMatrix", "()[[Lcom/example/openglpractice/logic/Field;", "[[Lcom/example/openglpractice/logic/Field;", "fragmentShader", "", "getFragmentShader", "()Ljava/lang/String;", "fragmentShader$delegate", "Lkotlin/Lazy;", "gameLevelColoumSize", "", "gameLevelRowSize", "layers", "", "Lcom/example/openglpractice/view/opengl/DrawableLayer;", "getLayers", "()Ljava/util/List;", "mActivityContext", "mBytesPerFloat", "getMBytesPerFloat$app_debug", "()I", "mPointProgramHandle", "mPositionDataSize", "getMPositionDataSize$app_debug", "mProgramHandle", "getMProgramHandle$app_debug", "setMProgramHandle$app_debug", "(I)V", "mProjectionMatrix", "", "getMProjectionMatrix$app_debug", "()[F", "mTextureCoordinateDataSize", "getMTextureCoordinateDataSize$app_debug", "mTextureDataHandle", "mTextureUniformHandle", "getMTextureUniformHandle$app_debug", "setMTextureUniformHandle$app_debug", "mViewMatrix", "getMViewMatrix$app_debug", "getPresenter", "()Lcom/example/openglpractice/presenter/GamePresenter;", "setPresenter", "(Lcom/example/openglpractice/presenter/GamePresenter;)V", "vertexShader", "getVertexShader", "vertexShader$delegate", "calculateTextureCoords", "cubeTextureCoordinateData", "texture", "minus", "characterUpdate", "", "featureUpdate", "onDrawFrame", "glUnused", "Ljavax/microedition/khronos/opengles/GL10;", "onSurfaceChanged", "width", "height", "onSurfaceCreated", "config", "Ljavax/microedition/khronos/egl/EGLConfig;", "app_debug"})
public final class LessonFourRenderer implements android.opengl.GLSurfaceView.Renderer {
    private final android.content.Context mActivityContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.logic.Field[][] fieldMatrix = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.logic.AFeature<?>[][] featureMatrix;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.logic.Character<?>[][][] characterMatrix;
    
    /**
     * How many bytes per float.
     */
    private final int mBytesPerFloat = 4;
    
    /**
     * Size of the position data in elements.
     */
    private final int mPositionDataSize = 3;
    
    /**
     * Size of the texture coordinate data in elements.
     */
    private final int mTextureCoordinateDataSize = 2;
    
    /**
     * Store the view matrix. This can be thought of as our camera. This matrix transforms world space to eye space;
     * it positions things relative to our eye.
     */
    @org.jetbrains.annotations.NotNull()
    private final float[] mViewMatrix = null;
    @org.jetbrains.annotations.NotNull()
    private final float[] mProjectionMatrix = null;
    
    /**
     * This will be used to pass in the texture.
     */
    private int mTextureUniformHandle = 0;
    
    /**
     * This is a handle to our cube shading program.
     */
    private int mProgramHandle = 0;
    
    /**
     * This is a handle to our light point program.
     */
    private int mPointProgramHandle = 0;
    
    /**
     * This is a handle to our texture data.
     */
    private int mTextureDataHandle = 0;
    private final int gameLevelColoumSize = 14;
    private final int gameLevelRowSize = 8;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.openglpractice.view.opengl.DrawableLayer> layers = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy vertexShader$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy fragmentShader$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.presenter.GamePresenter presenter;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Field[][] getFieldMatrix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.AFeature<?>[][] getFeatureMatrix() {
        return null;
    }
    
    public final void setFeatureMatrix(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.AFeature<?>[][] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Character<?>[][][] getCharacterMatrix() {
        return null;
    }
    
    public final void setCharacterMatrix(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Character<?>[][][] p0) {
    }
    
    public final int getMBytesPerFloat$app_debug() {
        return 0;
    }
    
    public final int getMPositionDataSize$app_debug() {
        return 0;
    }
    
    public final int getMTextureCoordinateDataSize$app_debug() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final float[] getMViewMatrix$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final float[] getMProjectionMatrix$app_debug() {
        return null;
    }
    
    public final int getMTextureUniformHandle$app_debug() {
        return 0;
    }
    
    public final void setMTextureUniformHandle$app_debug(int p0) {
    }
    
    public final int getMProgramHandle$app_debug() {
        return 0;
    }
    
    public final void setMProgramHandle$app_debug(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.openglpractice.view.opengl.DrawableLayer> getLayers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getVertexShader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getFragmentShader() {
        return null;
    }
    
    @java.lang.Override()
    public void onSurfaceCreated(@org.jetbrains.annotations.Nullable()
    javax.microedition.khronos.opengles.GL10 glUnused, @org.jetbrains.annotations.Nullable()
    javax.microedition.khronos.egl.EGLConfig config) {
    }
    
    @java.lang.Override()
    public void onSurfaceChanged(@org.jetbrains.annotations.NotNull()
    javax.microedition.khronos.opengles.GL10 glUnused, int width, int height) {
    }
    
    @java.lang.Override()
    public void onDrawFrame(@org.jetbrains.annotations.NotNull()
    javax.microedition.khronos.opengles.GL10 glUnused) {
    }
    
    public final void characterUpdate() {
    }
    
    public final void featureUpdate() {
    }
    
    private final float[] calculateTextureCoords(float[] cubeTextureCoordinateData, float[] texture, int minus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.presenter.GamePresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.presenter.GamePresenter p0) {
    }
    
    public LessonFourRenderer(@org.jetbrains.annotations.NotNull()
    android.content.Context activityContext, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.presenter.GamePresenter presenter) {
        super();
    }
}