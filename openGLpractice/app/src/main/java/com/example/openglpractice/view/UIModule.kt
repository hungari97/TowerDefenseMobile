package com.example.openglpractice.view

import android.content.Context
import com.example.openglpractice.logic.LevelManager
import com.example.openglpractice.model.interactor.BuildInteractor
import com.example.openglpractice.presenter.GamePresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UIModule(private val context: Context) {

    fun context()=context

    @Provides
    @Singleton
    fun gamePresenter(buildInteractor: BuildInteractor)= GamePresenter(buildInteractor)

}