package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/openglpractice/logic/Hero;", "Lcom/example/openglpractice/logic/Character;", "Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "id", "", "(J)V", "()V", "data", "Lcom/example/openglpractice/model/HeroData;", "getData", "()Lcom/example/openglpractice/model/HeroData;", "setData", "(Lcom/example/openglpractice/model/HeroData;)V", "calcMove", "", "from", "Lcom/example/openglpractice/model/Vector;", "to", "changeAnimateState", "type", "", "death", "hit", "thing", "Lcom/example/openglpractice/logic/Interactable;", "moveToThick", "nextAnimationState", "onThick", "app_debug"})
public final class Hero extends com.example.openglpractice.logic.Character<com.example.openglpractice.model.HeroData.HeroAnimateState> {
    public com.example.openglpractice.model.HeroData data;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.HeroData getData() {
        return null;
    }
    
    public void setData(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.HeroData p0) {
    }
    
    @java.lang.Override()
    public void hit(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Interactable thing) {
    }
    
    @java.lang.Override()
    public void death() {
    }
    
    @java.lang.Override()
    public void calcMove(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector from, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector to) {
    }
    
    @java.lang.Override()
    public void moveToThick() {
    }
    
    @java.lang.Override()
    public void onThick() {
    }
    
    @java.lang.Override()
    public void nextAnimationState() {
    }
    
    @java.lang.Override()
    public void changeAnimateState(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public Hero() {
        super();
    }
    
    public Hero(long id) {
        super();
    }
}