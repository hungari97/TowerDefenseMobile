package com.example.openglpractice.screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/example/openglpractice/screen/GameScreen;", "", "drawTrap", "", "trap", "Lcom/example/openglpractice/logic/Trap;", "initialise", "selectTrap", "index", "", "app_debug"})
public abstract interface GameScreen {
    
    public abstract void selectTrap(int index);
    
    public abstract void drawTrap(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Trap trap);
    
    public abstract void initialise();
}