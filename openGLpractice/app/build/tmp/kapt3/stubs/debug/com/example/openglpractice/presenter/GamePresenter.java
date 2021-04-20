package com.example.openglpractice.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ#\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\r0\r0\r\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00110\r0\r\u00a2\u0006\u0002\u0010\u0012J+\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\r2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\r0\r\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0007H\u0016J\u0006\u0010\u001e\u001a\u00020\u0007J\u0011\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0010\u0018J\u0017\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\r\u00a2\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u001cJ\u000e\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/openglpractice/presenter/GamePresenter;", "Lcom/example/openglpractice/presenter/Presenter;", "Lcom/example/openglpractice/screen/GameScreen;", "buildInteractor", "Lcom/example/openglpractice/model/interactor/BuildInteractor;", "(Lcom/example/openglpractice/model/interactor/BuildInteractor;)V", "attachScreen", "", "_screen", "buildArrowSelected", "arrow", "", "buildCharacterMatrix", "", "Lcom/example/openglpractice/logic/Character;", "()[[[Lcom/example/openglpractice/logic/Character;", "buildFeatureMatrix", "Lcom/example/openglpractice/logic/AFeature;", "()[[Lcom/example/openglpractice/logic/AFeature;", "buildInitialise", "Lcom/example/openglpractice/logic/Field;", "field", "([[Ljava/lang/Integer;)[[Lcom/example/openglpractice/logic/Field;", "buildSelectedTraps", "()[Ljava/lang/Integer;", "buildStartWave", "buildTouch", "position", "Lcom/example/openglpractice/model/Vector;", "detachScreen", "gameHeroAttack", "getSelectedTrapList", "logicFieldMatrix", "()[[Lcom/example/openglpractice/logic/Field;", "logicUpdateScreen", "playHeroGoalPosition", "to", "trapHasBeenSelected", "trap", "app_debug"})
public final class GamePresenter extends com.example.openglpractice.presenter.Presenter<com.example.openglpractice.screen.GameScreen> {
    private final com.example.openglpractice.model.interactor.BuildInteractor buildInteractor = null;
    
    @java.lang.Override()
    public void attachScreen(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.screen.GameScreen _screen) {
    }
    
    @java.lang.Override()
    public void detachScreen() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Integer[] getSelectedTrapList() {
        return null;
    }
    
    public final void trapHasBeenSelected(int trap) {
    }
    
    public final void buildTouch(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Field[][] buildInitialise(@org.jetbrains.annotations.NotNull()
    java.lang.Integer[][] field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Field[][] logicFieldMatrix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.AFeature<?>[][] buildFeatureMatrix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Integer[] buildSelectedTraps() {
        return null;
    }
    
    public final void buildArrowSelected(int arrow) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Character<?>[][][] buildCharacterMatrix() {
        return null;
    }
    
    public final void logicUpdateScreen() {
    }
    
    public final void playHeroGoalPosition(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector to) {
    }
    
    public final void buildStartWave() {
    }
    
    public final void gameHeroAttack() {
    }
    
    public GamePresenter(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.interactor.BuildInteractor buildInteractor) {
        super();
    }
}