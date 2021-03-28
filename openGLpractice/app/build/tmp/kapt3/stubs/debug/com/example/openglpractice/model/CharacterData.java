package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/example/openglpractice/model/CharacterData;", "T", "Lcom/example/openglpractice/model/IFeatureEnum;", "Lcom/example/openglpractice/model/InteractableData;", "Lcom/example/openglpractice/model/AnimatableData;", "()V", "goal", "Lcom/example/openglpractice/model/Vector;", "getGoal", "()Lcom/example/openglpractice/model/Vector;", "hitBoxPosition", "getHitBoxPosition", "setHitBoxPosition", "(Lcom/example/openglpractice/model/Vector;)V", "path", "", "getPath", "()[Lcom/example/openglpractice/model/Vector;", "setPath", "([Lcom/example/openglpractice/model/Vector;)V", "app_debug"})
public abstract class CharacterData<T extends com.example.openglpractice.model.IFeatureEnum> implements com.example.openglpractice.model.InteractableData, com.example.openglpractice.model.AnimatableData<T> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.openglpractice.model.Vector getGoal();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.openglpractice.model.Vector[] getPath();
    
    public abstract void setPath(@org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector[] p0);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract com.example.openglpractice.model.Vector getHitBoxPosition();
    
    public abstract void setHitBoxPosition(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector p0);
    
    public CharacterData() {
        super();
    }
}