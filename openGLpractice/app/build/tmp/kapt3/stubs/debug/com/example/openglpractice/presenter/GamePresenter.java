package com.example.openglpractice.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000b0\n0\n\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\n\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0011\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\n\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\n\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/openglpractice/presenter/GamePresenter;", "Lcom/example/openglpractice/presenter/Presenter;", "Lcom/example/openglpractice/screen/GameScreen;", "buildInteractor", "Lcom/example/openglpractice/model/interactor/BuildInteractor;", "(Lcom/example/openglpractice/model/interactor/BuildInteractor;)V", "attachScreen", "", "screen", "buildFeatureMatrix", "", "Lcom/example/openglpractice/logic/AFeature;", "()[[Lcom/example/openglpractice/logic/AFeature;", "buildInitialise", "Lcom/example/openglpractice/logic/Field;", "()[[Lcom/example/openglpractice/logic/Field;", "buildTouch", "position", "Lcom/example/openglpractice/model/Vector;", "detachScreen", "getSelectedTrapList", "", "()[Ljava/lang/Integer;", "logicFieldMatrix", "trapHasBeenSelected", "trap", "app_debug"})
public final class GamePresenter extends com.example.openglpractice.presenter.Presenter<com.example.openglpractice.screen.GameScreen> {
    private final com.example.openglpractice.model.interactor.BuildInteractor buildInteractor = null;
    
    @java.lang.Override()
    public void attachScreen(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.screen.GameScreen screen) {
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
    public final com.example.openglpractice.logic.Field[][] buildInitialise() {
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
    
    public GamePresenter(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.interactor.BuildInteractor buildInteractor) {
        super();
    }
}