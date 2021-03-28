package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/openglpractice/model/AFeatureData;", "T", "Lcom/example/openglpractice/model/IFeatureEnum;", "Lcom/example/openglpractice/model/InteractableData;", "Lcom/example/openglpractice/model/AnimatableData;", "()V", "animationState", "getAnimationState", "()Lcom/example/openglpractice/model/IFeatureEnum;", "functionality", "Lcom/example/openglpractice/logic/AFeature;", "getFunctionality", "()Lcom/example/openglpractice/logic/AFeature;", "app_debug"})
public abstract class AFeatureData<T extends com.example.openglpractice.model.IFeatureEnum> implements com.example.openglpractice.model.InteractableData, com.example.openglpractice.model.AnimatableData<T> {
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public abstract com.example.openglpractice.logic.AFeature<T> getFunctionality();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract com.example.openglpractice.model.IFeatureEnum getAnimationState();
    
    public AFeatureData() {
        super();
    }
}