package com.example.openglpractice.model.interactor

import com.example.openglpractice.screen.GameScreen
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun buildInteractor() = BuildInteractor()
}