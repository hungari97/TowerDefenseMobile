package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00020\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000eX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/example/openglpractice/model/AnimatableData;", "T", "Lcom/example/openglpractice/model/IAnimateEnum;", "", "animationState", "getAnimationState", "()Lcom/example/openglpractice/model/IAnimateEnum;", "currentAnimationProgress", "", "getCurrentAnimationProgress", "()I", "setCurrentAnimationProgress", "(I)V", "rotation", "", "getRotation", "()B", "setRotation", "(B)V", "app_debug"})
public abstract interface AnimatableData<T extends com.example.openglpractice.model.IAnimateEnum> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.openglpractice.model.IAnimateEnum getAnimationState();
    
    public abstract byte getRotation();
    
    public abstract void setRotation(byte p0);
    
    public abstract int getCurrentAnimationProgress();
    
    public abstract void setCurrentAnimationProgress(int p0);
}