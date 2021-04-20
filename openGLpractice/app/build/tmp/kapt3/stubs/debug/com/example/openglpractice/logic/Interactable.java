package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H&J\b\u0010\n\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lcom/example/openglpractice/logic/Interactable;", "", "data", "Lcom/example/openglpractice/model/InteractableData;", "getData", "()Lcom/example/openglpractice/model/InteractableData;", "death", "", "hit", "thing", "specialAttack", "app_debug"})
public abstract interface Interactable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.openglpractice.model.InteractableData getData();
    
    public abstract void hit(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Interactable thing);
    
    public abstract void death();
    
    public abstract void specialAttack();
}