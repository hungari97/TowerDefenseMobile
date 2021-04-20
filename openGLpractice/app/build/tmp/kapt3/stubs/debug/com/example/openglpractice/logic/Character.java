package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/openglpractice/logic/Character;", "T", "Lcom/example/openglpractice/model/IAnimateEnum;", "Lcom/example/openglpractice/logic/Interactable;", "Lcom/example/openglpractice/logic/Animatable;", "()V", "attackNext", "", "getAttackNext", "()Z", "setAttackNext", "(Z)V", "data", "Lcom/example/openglpractice/model/CharacterData;", "getData", "()Lcom/example/openglpractice/model/CharacterData;", "attack", "", "calcMove", "from", "Lcom/example/openglpractice/model/Vector;", "to", "changeAnimateState", "type", "", "moveToThick", "nextAnimationState", "onThick", "app_debug"})
public abstract class Character<T extends com.example.openglpractice.model.IAnimateEnum> implements com.example.openglpractice.logic.Interactable, com.example.openglpractice.logic.Animatable {
    private boolean attackNext = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract com.example.openglpractice.model.CharacterData<T> getData();
    
    protected final boolean getAttackNext() {
        return false;
    }
    
    protected final void setAttackNext(boolean p0) {
    }
    
    public void calcMove(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector from, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector to) {
    }
    
    public void moveToThick() {
    }
    
    public void attack() {
    }
    
    public abstract void changeAnimateState(@org.jetbrains.annotations.NotNull()
    java.lang.String type);
    
    @java.lang.Override()
    public void nextAnimationState() {
    }
    
    @java.lang.Override()
    public void onThick() {
    }
    
    public Character() {
        super();
    }
}