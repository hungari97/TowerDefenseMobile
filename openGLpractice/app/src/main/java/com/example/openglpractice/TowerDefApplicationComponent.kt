package com.example.openglpractice

import com.example.openglpractice.interactor.InteractorModule
import com.example.openglpractice.view.GameActivity
import com.example.openglpractice.view.LevelEndActivity
import com.example.openglpractice.view.UIModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class, InteractorModule::class])
interface TowerDefApplicationComponent {
    fun inject(gameActivity: GameActivity)
    fun inject(levelEndActivity: LevelEndActivity)
}
