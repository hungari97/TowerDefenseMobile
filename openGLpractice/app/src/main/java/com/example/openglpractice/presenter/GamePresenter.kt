package com.example.openglpractice.presenter

import com.example.openglpractice.logic.AFeature
import com.example.openglpractice.logic.Character
import com.example.openglpractice.logic.Field
import com.example.openglpractice.model.Vector
import com.example.openglpractice.model.interactor.BuildInteractor
import com.example.openglpractice.screen.GameScreen

class GamePresenter(private val buildInteractor: BuildInteractor) : Presenter<GameScreen>() {
    override fun attachScreen(_screen: GameScreen) {
        this.screen = _screen
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

    fun buildSelectedTraps():Array<Int>{
        return buildInteractor.getSelectedTrapList()
    }

    fun buildArrowSelected(arrow: Int) {
        buildInteractor.buildArrowSelected(arrow)
    }

    fun buildCharacterMatrix():Array<Array<Array<Character<*>?>>>{
        return buildInteractor.getCharacterMatrix()
    }

    fun logicUpdateScreen() {
        screen?.updateScreen()
    }

    fun playHeroGoalPosition(to:Vector){
        buildInteractor.playHeroGoalPosition(to)
    }

    fun buildStartWave() {
        buildInteractor.buildStartWave()
    }

}