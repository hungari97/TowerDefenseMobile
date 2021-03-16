package com.example.openglpractice.view.opengl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0016J\b\u0010)\u001a\u00020*H&J\b\u0010+\u001a\u00020*H&J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0016J\b\u0010.\u001a\u00020*H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0016\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0012\u0010\u001c\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0012\u0010\u001e\u001a\u00020\u001fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0005R\u0012\u0010$\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\t\u00a8\u0006/"}, d2 = {"Lcom/example/openglpractice/view/opengl/DrawableLayer;", "", "mMVPMatrix", "", "getMMVPMatrix", "()[F", "mMVPMatrixHandle", "", "getMMVPMatrixHandle", "()I", "mModelMatrix", "getMModelMatrix", "mPositionHandle", "getMPositionHandle", "mPositions", "Ljava/nio/FloatBuffer;", "getMPositions", "()Ljava/nio/FloatBuffer;", "mTextureCoordinateHandle", "getMTextureCoordinateHandle", "mTextureCoordinates", "getMTextureCoordinates", "mTextureDataHandle", "getMTextureDataHandle", "setMTextureDataHandle", "(I)V", "positionArray", "getPositionArray", "rectengleCount", "getRectengleCount", "render", "Lcom/example/openglpractice/view/opengl/LessonFourRenderer;", "getRender", "()Lcom/example/openglpractice/view/opengl/LessonFourRenderer;", "textureCoordArray", "getTextureCoordArray", "textureFile", "getTextureFile", "calculateTextureCoords", "cubeTextureCoordinateData", "texture", "draw", "", "initialize", "initializeARectangleWithTextureCoord", "rectangle", "updateMatrix", "app_debug"})
public abstract interface DrawableLayer {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.openglpractice.view.opengl.LessonFourRenderer getRender();
    
    @org.jetbrains.annotations.NotNull()
    public abstract float[] getPositionArray();
    
    @org.jetbrains.annotations.NotNull()
    public abstract float[] getTextureCoordArray();
    
    public abstract int getRectengleCount();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.nio.FloatBuffer getMPositions();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.nio.FloatBuffer getMTextureCoordinates();
    
    /**
     * This will be used to pass in model position information.
     */
    public abstract int getMPositionHandle();
    
    /**
     * This will be used to pass in model texture coordinate information.
     */
    public abstract int getMTextureCoordinateHandle();
    
    /**
     * This will be used to pass in the transformation matrix.
     */
    public abstract int getMMVPMatrixHandle();
    
    /**
     * This is a handle to our texture data.
     */
    public abstract int getMTextureDataHandle();
    
    /**
     * This is a handle to our texture data.
     */
    public abstract void setMTextureDataHandle(int p0);
    
    public abstract int getTextureFile();
    
    /**
     * Store the model matrix. This matrix is used to move models from object space (where each model can be thought
     * of being located at the center of the universe) to world space.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract float[] getMModelMatrix();
    
    /**
     * Store the projection matrix. This is used to project the scene onto a 2D viewport.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract float[] getMMVPMatrix();
    
    public abstract void initialize();
    
    public abstract void draw();
    
    public abstract void updateMatrix();
    
    @org.jetbrains.annotations.NotNull()
    public abstract float[] calculateTextureCoords(@org.jetbrains.annotations.NotNull()
    float[] cubeTextureCoordinateData, @org.jetbrains.annotations.NotNull()
    float[] texture);
    
    @org.jetbrains.annotations.NotNull()
    public abstract float[] initializeARectangleWithTextureCoord(@org.jetbrains.annotations.NotNull()
    float[] rectangle, @org.jetbrains.annotations.NotNull()
    float[] texture);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static float[] calculateTextureCoords(@org.jetbrains.annotations.NotNull()
        com.example.openglpractice.view.opengl.DrawableLayer $this, @org.jetbrains.annotations.NotNull()
        float[] cubeTextureCoordinateData, @org.jetbrains.annotations.NotNull()
        float[] texture) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static float[] initializeARectangleWithTextureCoord(@org.jetbrains.annotations.NotNull()
        com.example.openglpractice.view.opengl.DrawableLayer $this, @org.jetbrains.annotations.NotNull()
        float[] rectangle, @org.jetbrains.annotations.NotNull()
        float[] texture) {
            return null;
        }
    }
}