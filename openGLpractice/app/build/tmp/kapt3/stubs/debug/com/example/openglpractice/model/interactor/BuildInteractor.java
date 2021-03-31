package com.example.openglpractice.model.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bJ#\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00120\u00110\u00110\u0011\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0011\u00a2\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00170\u00110\u0011\u00a2\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\u0011\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/openglpractice/model/interactor/BuildInteractor;", "", "()V", "levelManager", "Lcom/example/openglpractice/logic/LevelManager;", "buildArrowSelected", "", "arrow", "", "buildInitialiseManager", "buildStartWave", "buildTouchPosition", "position", "Lcom/example/openglpractice/model/Vector;", "buildTrapSelect", "trapIndex", "getCharacterMatrix", "", "Lcom/example/openglpractice/logic/Character;", "()[[[Lcom/example/openglpractice/logic/Character;", "getSelectedTrapList", "()[Ljava/lang/Integer;", "logicFeatureMatrix", "Lcom/example/openglpractice/logic/AFeature;", "()[[Lcom/example/openglpractice/logic/AFeature;", "logicFieldMatrix", "Lcom/example/openglpractice/logic/Field;", "()[[Lcom/example/openglpractice/logic/Field;", "playHeroGoalPosition", "to", "app_debug"})
public final class BuildInteractor {
    private final com.example.openglpractice.logic.LevelManager levelManager = null;
    
    public final void buildTouchPosition(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector position) {
    }
    
    public final void buildTrapSelect(int trapIndex) {
    }
    
    public final void buildInitialiseManager() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Field[][] logicFieldMatrix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.AFeature<?>[][] logicFeatureMatrix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Integer[] getSelectedTrapList() {
        return null;
    }
    
    public final void buildArrowSelected(int arrow) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Character<?>[][][] getCharacterMatrix() {
        return null;
    }
    
    public final void playHeroGoalPosition(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector to) {
    }
    
    public final void buildStartWave() {
    }
    
    @javax.inject.Inject()
    public BuildInteractor() {
        super();
    }
}