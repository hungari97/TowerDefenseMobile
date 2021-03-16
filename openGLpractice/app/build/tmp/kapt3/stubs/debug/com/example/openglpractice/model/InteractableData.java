package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/example/openglpractice/model/InteractableData;", "", "damage", "", "getDamage", "()I", "functionality", "Lcom/example/openglpractice/logic/Interactable;", "getFunctionality", "()Lcom/example/openglpractice/logic/Interactable;", "health", "getHealth", "hitBoxPosition", "Lcom/example/openglpractice/model/Vector;", "getHitBoxPosition", "()Lcom/example/openglpractice/model/Vector;", "hitBoxSize", "getHitBoxSize", "id", "", "getId", "()J", "app_debug"})
public abstract interface InteractableData {
    
    public abstract long getId();
    
    public abstract int getHealth();
    
    public abstract int getDamage();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.openglpractice.model.Vector getHitBoxPosition();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.openglpractice.model.Vector getHitBoxSize();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.openglpractice.logic.Interactable getFunctionality();
}