package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/openglpractice/logic/Character;", "Lcom/example/openglpractice/logic/Interactable;", "Lcom/example/openglpractice/logic/Animatable;", "data", "Lcom/example/openglpractice/model/CharacterData;", "(Lcom/example/openglpractice/model/CharacterData;)V", "getData", "()Lcom/example/openglpractice/model/CharacterData;", "move", "", "from", "Lcom/example/openglpractice/model/Vector;", "to", "app_debug"})
public abstract class Character implements com.example.openglpractice.logic.Interactable, com.example.openglpractice.logic.Animatable {
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.CharacterData<?> data = null;
    
    public final void move(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector from, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector to) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.CharacterData<?> getData() {
        return null;
    }
    
    public Character(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.CharacterData<?> data) {
        super();
    }
}