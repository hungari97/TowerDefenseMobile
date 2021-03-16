package com.example.openglpractice.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/openglpractice/presenter/Presenter;", "S", "", "()V", "screen", "getScreen", "()Ljava/lang/Object;", "setScreen", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "attachScreen", "", "detachScreen", "app_debug"})
public abstract class Presenter<S extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private S screen;
    
    @org.jetbrains.annotations.Nullable()
    protected final S getScreen() {
        return null;
    }
    
    protected final void setScreen(@org.jetbrains.annotations.Nullable()
    S p0) {
    }
    
    public void attachScreen(S screen) {
    }
    
    public void detachScreen() {
    }
    
    public Presenter() {
        super();
    }
}