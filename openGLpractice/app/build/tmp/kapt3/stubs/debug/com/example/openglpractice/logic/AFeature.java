package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/openglpractice/logic/AFeature;", "T", "Lcom/example/openglpractice/model/IAnimateEnum;", "Lcom/example/openglpractice/logic/Interactable;", "Lcom/example/openglpractice/logic/Animatable;", "()V", "data", "Lcom/example/openglpractice/model/AFeatureData;", "getData", "()Lcom/example/openglpractice/model/AFeatureData;", "triggerd", "", "getTriggerd", "()Z", "setTriggerd", "(Z)V", "hit", "", "thing", "nextAnimationState", "triggered", "app_debug"})
public abstract class AFeature<T extends com.example.openglpractice.model.IAnimateEnum> implements com.example.openglpractice.logic.Interactable, com.example.openglpractice.logic.Animatable {
    private boolean triggerd = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract com.example.openglpractice.model.AFeatureData<T> getData();
    
    protected final boolean getTriggerd() {
        return false;
    }
    
    protected final void setTriggerd(boolean p0) {
    }
    
    @java.lang.Override()
    public void hit(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Interactable thing) {
    }
    
    @java.lang.Override()
    public void nextAnimationState() {
    }
    
    public void triggered() {
    }
    
    public AFeature() {
        super();
    }
}