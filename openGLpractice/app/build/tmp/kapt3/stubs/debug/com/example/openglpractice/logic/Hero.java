package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/example/openglpractice/logic/Hero;", "Lcom/example/openglpractice/logic/Character;", "Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "id", "", "data", "Lcom/example/openglpractice/model/HeroData;", "(JLcom/example/openglpractice/model/HeroData;)V", "getData", "()Lcom/example/openglpractice/model/HeroData;", "death", "", "hit", "thing", "Lcom/example/openglpractice/logic/Interactable;", "onThick", "app_debug"})
public final class Hero extends com.example.openglpractice.logic.Character<com.example.openglpractice.model.HeroData.HeroAnimateState> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.HeroData data = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.HeroData getData() {
        return null;
    }
    
    @java.lang.Override()
    public void hit(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Interactable thing) {
    }
    
    @java.lang.Override()
    public void death() {
    }
    
    @java.lang.Override()
    public void onThick() {
    }
    
    public Hero(long id, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.HeroData data) {
        super();
    }
}