package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0004X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005\u00a8\u0006\u0019"}, d2 = {"Lcom/example/openglpractice/logic/Trap;", "Lcom/example/openglpractice/logic/AFeature;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "rawData", "Lcom/example/openglpractice/model/TrapData;", "(Lcom/example/openglpractice/model/TrapData;)V", "()V", "available", "", "getAvailable", "()Z", "setAvailable", "(Z)V", "data", "getData", "()Lcom/example/openglpractice/model/TrapData;", "setData", "hit", "", "thing", "Lcom/example/openglpractice/logic/Interactable;", "positionToMatrixPosition", "position", "Lcom/example/openglpractice/model/Vector;", "used", "app_debug"})
public class Trap extends com.example.openglpractice.logic.AFeature<com.example.openglpractice.model.TrapData.TrapAnimationState> {
    public com.example.openglpractice.model.TrapData data;
    private boolean available = true;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.TrapData getData() {
        return null;
    }
    
    public void setData(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.TrapData p0) {
    }
    
    public final boolean getAvailable() {
        return false;
    }
    
    public final void setAvailable(boolean p0) {
    }
    
    @java.lang.Override()
    public void hit(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Interactable thing) {
    }
    
    public final void used() {
    }
    
    @java.lang.Override()
    public boolean positionToMatrixPosition(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector position) {
        return false;
    }
    
    public Trap() {
        super();
    }
    
    public Trap(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.TrapData rawData) {
        super();
    }
}