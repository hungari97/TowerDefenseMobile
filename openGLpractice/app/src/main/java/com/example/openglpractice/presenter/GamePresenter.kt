package com.example.openglpractice.presenter

import android.graphics.drawable.Icon
import com.example.openglpractice.logic.AFeature
import com.example.openglpractice.logic.Field
import com.example.openglpractice.model.Vector
import com.example.openglpractice.model.interactor.BuildInteractor
import com.example.openglpractice.screen.GameScreen

class GamePresenter(private val buildInteractor: BuildInteractor) : Presenter<GameScreen>() {
    override fun attachScreen(screen: GameScreen) {
        this.screen = screen
    }

    override fun detachScreen() {
        this.screen = null
    }

    fun getSelectedTrapList(): Array<Int> {
        return buildInteractor.getSelectedTrapList()
    }

    fun trapHasBeenSelected(trap: Int) {
        buildInteractor.buildTrapSelect(trap)
    }

    fun buildTouch(position: Vector) {
        buildInteractor.buildTouchPosition(position)
    }

    fun buildInitialise():Array<Array<Field>>{
        buildInteractor.buildInitialiseManager()
        return buildInteractor.logicFieldMatrix()
    }

    fun logicFieldMatrix():Array<Array<Field>>{
        return buildInteractor.logicFieldMatrix()
    }

    fun buildFeatureMatrix():Array<Array<AFeature<*>?>>{
        return buildInteractor.logicFeatureMatrix()
    }

}