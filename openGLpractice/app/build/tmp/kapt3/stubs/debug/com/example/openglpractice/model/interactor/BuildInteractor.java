package com.example.openglpractice.model.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\u0011\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u00100\u0010\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\u0010\u00a2\u0006\u0002\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/example/openglpractice/model/interactor/BuildInteractor;", "", "()V", "levelManager", "Lcom/example/openglpractice/logic/LevelManager;", "getLevelManager", "()Lcom/example/openglpractice/logic/LevelManager;", "buildInitialiseManager", "", "buildTouchPosition", "position", "Lcom/example/openglpractice/model/Vector;", "buildTrapSelect", "trapIndex", "", "getSelectedTrapList", "", "()[Ljava/lang/Integer;", "logicFeatureMatrix", "Lcom/example/openglpractice/logic/AFeature;", "()[[Lcom/example/openglpractice/logic/AFeature;", "logicFieldMatrix", "Lcom/example/openglpractice/logic/Field;", "()[[Lcom/example/openglpractice/logic/Field;", "app_debug"})
public final class BuildInteractor {
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.logic.LevelManager levelManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.LevelManager getLevelManager() {
        return null;
    }
    
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
    
    @javax.inject.Inject()
    public BuildInteractor() {
        super();
    }
}