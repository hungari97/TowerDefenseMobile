package com.example.openglpractice.model.interactor

import com.example.openglpractice.logic.feature.AFeature
import com.example.openglpractice.logic.character.ACharacter
import com.example.openglpractice.logic.Field
import com.example.openglpractice.logic.OLevelManager
import com.example.openglpractice.presenter.GamePresenter
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.utility.Vector
import javax.inject.Inject

class BuildInteractor @Inject constructor() {
    private val levelManager = OLevelManager

    lateinit var gamePresenter: GamePresenter

    init {
        OLevelManager.interactor = this
    }

    fun buildTouchPosition(position: Vector<Int>) {
        levelManager.buildTrap(position)
    }

    fun buildTrapSelect(trapIndex: Int) {
        levelManager.selectedFromThePalette(trapIndex)
    }

    fun buildInitialiseManager(field: Array<Array<Int>>) {
        levelManager.initialise(field)
    }

    fun buildArrowSelected(arrow: Int) {
        levelManager.selectedRotation = EDirection.values()[arrow]
    }

    fun buildStartWave() {
        OLevelManager.buildMode = false
    }

    fun logicFeatureMatrix(): Array<Array<AFeature<*>?>> {
        return levelManager.featureMatrix
    }

    fun logicGetSelectedTrapList(): Array<Int> {
        return Array(levelManager.selectedTraps.size) {
            levelManager.selectedTraps.elementAt(it).iconIndex
        }
    }

    fun logicFieldMatrix(): Array<Array<Field>> {
        return levelManager.fieldMatrix
    }

    fun logicGetCharacterMatrix(): Array<Array<Array<ACharacter<*>?>>> {
        return arrayOf(levelManager.characterPositionMatrix, levelManager.characterTargetMatrix)
    }

    fun gameHeroGoalPosition(to: Vector<Int>) {
        levelManager.positionToHero(to)
    }

    fun gameHeroAttack() {
        OLevelManager.hero.requestAttack()
    }

    fun gameNotifyUIAboutGameEnd() {
        gamePresenter.notifyUIAboutGameEnd()
    }

    fun logicTrapCount(index: Int): Int = OLevelManager.getTrapCount(index)

    fun buildRemoveTouch(vector: Vector<Int>) = OLevelManager.removeTrapFromData(vector)
    fun gameNotifyUIAboutTrapLimitChange() = gamePresenter.notifyUIAboutTrapLimitChange()

    fun gameNotifyUIAboutBuildModeUpdate(value:Boolean) = gamePresenter.notifyUIAboutBuildModeUpdate(value)
}
