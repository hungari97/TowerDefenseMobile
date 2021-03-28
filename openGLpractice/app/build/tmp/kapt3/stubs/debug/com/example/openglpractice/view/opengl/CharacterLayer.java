package com.example.openglpractice.view.opengl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00062\n\u0010@\u001a\u0006\u0012\u0002\b\u00030\'J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020BH\u0016J\b\u0010D\u001a\u00020BH\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u001e\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0017\u001a\u00020\u0018X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0018X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u001a\u0010\"\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000bR.\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\'0&0&X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u00100R\u001e\u00101\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R$\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR\u001a\u00108\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0010\"\u0004\b:\u00100R\u0014\u0010;\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b<\u0010\t\u00a8\u0006E"}, d2 = {"Lcom/example/openglpractice/view/opengl/CharacterLayer;", "Lcom/example/openglpractice/view/opengl/DrawableLayer;", "render", "Lcom/example/openglpractice/view/opengl/LessonFourRenderer;", "(Lcom/example/openglpractice/view/opengl/LessonFourRenderer;)V", "value", "", "columnCount", "getColumnCount", "()I", "setColumnCount", "(I)V", "<set-?>", "", "mMVPMatrix", "getMMVPMatrix", "()[F", "mMVPMatrixHandle", "getMMVPMatrixHandle", "mModelMatrix", "getMModelMatrix", "mPositionHandle", "getMPositionHandle", "mPositions", "Ljava/nio/FloatBuffer;", "getMPositions", "()Ljava/nio/FloatBuffer;", "setMPositions", "(Ljava/nio/FloatBuffer;)V", "mTextureCoordinateHandle", "getMTextureCoordinateHandle", "mTextureCoordinates", "getMTextureCoordinates", "setMTextureCoordinates", "mTextureDataHandle", "getMTextureDataHandle", "setMTextureDataHandle", "matrix", "", "Lcom/example/openglpractice/logic/Character;", "getMatrix", "()[[Lcom/example/openglpractice/logic/Character;", "setMatrix", "([[Lcom/example/openglpractice/logic/Character;)V", "[[Lcom/example/openglpractice/logic/Character;", "positionArray", "getPositionArray", "setPositionArray", "([F)V", "rectengleCount", "getRectengleCount", "getRender", "()Lcom/example/openglpractice/view/opengl/LessonFourRenderer;", "rowCount", "getRowCount", "setRowCount", "textureCoordArray", "getTextureCoordArray", "setTextureCoordArray", "textureFile", "getTextureFile", "cellTextureWithRotation", "row", "cell", "it", "draw", "", "initialize", "updateMatrix", "app_debug"})
public final class CharacterLayer implements com.example.openglpractice.view.opengl.DrawableLayer {
    private int columnCount = 14;
    private int rowCount = 8;
    private int rectengleCount;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.logic.Character<?>[][] matrix;
    @org.jetbrains.annotations.NotNull()
    private float[] positionArray;
    @org.jetbrains.annotations.NotNull()
    private float[] textureCoordArray;
    public java.nio.FloatBuffer mPositions;
    public java.nio.FloatBuffer mTextureCoordinates;
    private int mPositionHandle = 0;
    private int mTextureCoordinateHandle = 0;
    private int mMVPMatrixHandle = 0;
    private int mTextureDataHandle = 0;
    @org.jetbrains.annotations.NotNull()
    private float[] mModelMatrix;
    @org.jetbrains.annotations.NotNull()
    private float[] mMVPMatrix;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.view.opengl.LessonFourRenderer render = null;
    
    public final int getColumnCount() {
        return 0;
    }
    
    public final void setColumnCount(int value) {
    }
    
    public final int getRowCount() {
        return 0;
    }
    
    public final void setRowCount(int value) {
    }
    
    @java.lang.Override()
    public int getRectengleCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Character<?>[][] getMatrix() {
        return null;
    }
    
    public final void setMatrix(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Character<?>[][] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public float[] getPositionArray() {
        return null;
    }
    
    public void setPositionArray(@org.jetbrains.annotations.NotNull()
    float[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public float[] getTextureCoordArray() {
        return null;
    }
    
    public void setTextureCoordArray(@org.jetbrains.annotations.NotNull()
    float[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.nio.FloatBuffer getMPositions() {
        return null;
    }
    
    public void setMPositions(@org.jetbrains.annotations.NotNull()
    java.nio.FloatBuffer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.nio.FloatBuffer getMTextureCoordinates() {
        return null;
    }
    
    public void setMTextureCoordinates(@org.jetbrains.annotations.NotNull()
    java.nio.FloatBuffer p0) {
    }
    
    @java.lang.Override()
    public int getMPositionHandle() {
        return 0;
    }
    
    @java.lang.Override()
    public int getMTextureCoordinateHandle() {
        return 0;
    }
    
    @java.lang.Override()
    public int getMMVPMatrixHandle() {
        return 0;
    }
    
    @java.lang.Override()
    public int getMTextureDataHandle() {
        return 0;
    }
    
    @java.lang.Override()
    public void setMTextureDataHandle(int p0) {
    }
    
    @java.lang.Override()
    public int getTextureFile() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public float[] getMModelMatrix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public float[] getMMVPMatrix() {
        return null;
    }
    
    @java.lang.Override()
    public void initialize() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final float[] cellTextureWithRotation(int row, int cell, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Character<?> it) {
        return null;
    }
    
    @java.lang.Override()
    public void draw() {
    }
    
    @java.lang.Override()
    public void updateMatrix() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.view.opengl.LessonFourRenderer getRender() {
        return null;
    }
    
    public CharacterLayer(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.view.opengl.LessonFourRenderer render) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public float[] calculateTextureCoords(@org.jetbrains.annotations.NotNull()
    float[] cubeTextureCoordinateData, @org.jetbrains.annotations.NotNull()
    float[] texture) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public float[] initializeARectangleWithTextureCoord(@org.jetbrains.annotations.NotNull()
    float[] rectangle, @org.jetbrains.annotations.NotNull()
    float[] texture) {
        return null;
    }
}