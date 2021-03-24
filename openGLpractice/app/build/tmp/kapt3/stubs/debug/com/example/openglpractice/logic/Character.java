package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/example/openglpractice/logic/Character;", "T", "Lcom/example/openglpractice/model/IFeatureEnum;", "Lcom/example/openglpractice/logic/Interactable;", "Lcom/example/openglpractice/logic/Animatable;", "()V", "data", "Lcom/example/openglpractice/model/CharacterData;", "getData", "()Lcom/example/openglpractice/model/CharacterData;", "move", "", "from", "Lcom/example/openglpractice/model/Vector;", "to", "app_debug"})
public abstract class Character<T extends com.example.openglpractice.model.IFeatureEnum> implements com.example.openglpractice.logic.Interactable, com.example.openglpractice.logic.Animatable {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract com.example.openglpractice.model.CharacterData<T> getData();
    
    public final void move(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector from, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector to) {
    }
    
    public Character() {
        super();
    }
}