package com.example.openglpractice.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\fJ\u0012\u0010\'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020%H\u0014J\b\u0010+\u001a\u00020%H\u0014J\b\u0010,\u001a\u00020%H\u0002J\u000e\u0010-\u001a\u00020%2\u0006\u0010&\u001a\u00020\fJ\b\u0010.\u001a\u00020%H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 \u00a8\u0006/"}, d2 = {"Lcom/example/openglpractice/view/GameActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/openglpractice/screen/GameScreen;", "()V", "gamePresenter", "Lcom/example/openglpractice/presenter/GamePresenter;", "getGamePresenter", "()Lcom/example/openglpractice/presenter/GamePresenter;", "setGamePresenter", "(Lcom/example/openglpractice/presenter/GamePresenter;)V", "ibSelectArrow", "", "Landroid/widget/ImageButton;", "getIbSelectArrow", "()[Landroid/widget/ImageButton;", "setIbSelectArrow", "([Landroid/widget/ImageButton;)V", "[Landroid/widget/ImageButton;", "ibSelectTraps", "getIbSelectTraps", "setIbSelectTraps", "render", "Lcom/example/openglpractice/view/opengl/LessonFourRenderer;", "getRender", "()Lcom/example/openglpractice/view/opengl/LessonFourRenderer;", "setRender", "(Lcom/example/openglpractice/view/opengl/LessonFourRenderer;)V", "x", "", "getX", "()F", "setX", "(F)V", "y", "getY", "setY", "arrowSelectOnClick", "", "v", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "resetTrapBackgound", "trapSelectOnClick", "updateScreen", "app_debug"})
public final class GameActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.openglpractice.screen.GameScreen {
    @javax.inject.Inject()
    public com.example.openglpractice.presenter.GamePresenter gamePresenter;
    public android.widget.ImageButton[] ibSelectTraps;
    public android.widget.ImageButton[] ibSelectArrow;
    private float x = 0.0F;
    private float y = 0.0F;
    public com.example.openglpractice.view.opengl.LessonFourRenderer render;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.presenter.GamePresenter getGamePresenter() {
        return null;
    }
    
    public final void setGamePresenter(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.presenter.GamePresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageButton[] getIbSelectTraps() {
        return null;
    }
    
    public final void setIbSelectTraps(@org.jetbrains.annotations.NotNull()
    android.widget.ImageButton[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageButton[] getIbSelectArrow() {
        return null;
    }
    
    public final void setIbSelectArrow(@org.jetbrains.annotations.NotNull()
    android.widget.ImageButton[] p0) {
    }
    
    public final float getX() {
        return 0.0F;
    }
    
    public final void setX(float p0) {
    }
    
    public final float getY() {
        return 0.0F;
    }
    
    public final void setY(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.view.opengl.LessonFourRenderer getRender() {
        return null;
    }
    
    public final void setRender(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.view.opengl.LessonFourRenderer p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public final void trapSelectOnClick(@org.jetbrains.annotations.NotNull()
    android.widget.ImageButton v) {
    }
    
    public final void arrowSelectOnClick(@org.jetbrains.annotations.NotNull()
    android.widget.ImageButton v) {
    }
    
    private final void resetTrapBackgound() {
    }
    
    @java.lang.Override()
    public void updateScreen() {
    }
    
    public GameActivity() {
        super();
    }
}