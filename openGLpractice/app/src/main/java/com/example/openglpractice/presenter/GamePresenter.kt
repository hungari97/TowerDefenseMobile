package com.example.openglpractice.presenter

import com.example.openglpractice.logic.feature.AFeature
import com.example.openglpractice.logic.character.ACharacter
import com.example.openglpractice.logic.Field
import com.example.openglpractice.utility.Vector
import com.example.openglpractice.model.interactor.BuildInteractor
import com.example.openglpractice.screen.GameScreen

class GamePresenter(private val buildInteractor: BuildInteractor) : Presenter<GameScreen>() {
    init {
        buildInteractor.gamePresenter = this
    }

    override fun attachScreen(screen: GameScreen) {
        this.screen = screen
    }

    fun buildTrapHasBeenSelected(trap: Int) {
        buildInteractor.buildTrapSelect(trap)
    }

    fun buildTouch(position: Vector<Int>) {
        buildInteractor.buildTouchPosition(position)
    }

    fun buildInitialise(field: Array<Array<Int>>): Array<Array<Field>> {
        buildInteractor.buildInitialiseManager(field)
        return buildInteractor.logicFieldMatrix()
    }

    fun buildArrowSelected(arrow: Int) {
        buildInteractor.buildArrowSelected(arrow)
    }

    fun buildStartWave() {
        buildInteractor.buildStartWave()
    }

    fun logicGetSelectedTrapList(): Array<Int> {
        return buildInteractor.logicGetSelectedTrapList()
    }

    fun logicFieldMatrix(): Array<Array<Field>> {
        return buildInteractor.logicFieldMatrix()
    }

    fun logicFeatureMatrix(): Array<Array<AFeature<*>?>> {
        return buildInteractor.logicFeatureMatrix()
    }

    fun logicCharacterMatrix(): Array<Array<Array<ACharacter<*>?>>> {
        return buildInteractor.logicGetCharacterMatrix()
    }

    fun gameHeroGoalPosition(to: Vector<Int>) {
        buildInteractor.gameHeroGoalPosition(to)
    }

    fun gameHeroAttack() {
        buildInteractor.gameHeroAttack()
    }



    fun notifyUIAboutGameEnd() {
        screen?.LevelEnded()
    }

}