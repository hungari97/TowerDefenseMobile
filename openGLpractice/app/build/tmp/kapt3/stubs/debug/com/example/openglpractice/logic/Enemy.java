package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016R\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005\u00a8\u0006\u0017"}, d2 = {"Lcom/example/openglpractice/logic/Enemy;", "Lcom/example/openglpractice/logic/Character;", "Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;", "_data", "Lcom/example/openglpractice/model/EnemyData;", "(Lcom/example/openglpractice/model/EnemyData;)V", "data", "getData", "()Lcom/example/openglpractice/model/EnemyData;", "setData", "calcMove", "", "from", "Lcom/example/openglpractice/model/Vector;", "to", "changeAnimateState", "type", "", "death", "hit", "thing", "Lcom/example/openglpractice/logic/Interactable;", "onThick", "app_debug"})
public class Enemy extends com.example.openglpractice.logic.Character<com.example.openglpractice.model.EnemyData.EnemyAnimateState> {
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.model.EnemyData data;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.EnemyData getData() {
        return null;
    }
    
    public void setData(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.EnemyData p0) {
    }
    
    @java.lang.Override()
    public void calcMove(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector from, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector to) {
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
    
    @java.lang.Override()
    public void changeAnimateState(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public Enemy(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.EnemyData _data) {
        super();
    }
}