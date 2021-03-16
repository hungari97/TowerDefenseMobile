package com.example.openglpractice.model.interactor

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun buildInteractor() = BuildInteractor()
}