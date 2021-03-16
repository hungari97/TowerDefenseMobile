package com.example.openglpractice.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/openglpractice/view/UIModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gamePresenter", "Lcom/example/openglpractice/presenter/GamePresenter;", "buildInteractor", "Lcom/example/openglpractice/model/interactor/BuildInteractor;", "app_debug"})
@dagger.Module()
public final class UIModule {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context context() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.openglpractice.presenter.GamePresenter gamePresenter(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.interactor.BuildInteractor buildInteractor) {
        return null;
    }
    
    public UIModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}