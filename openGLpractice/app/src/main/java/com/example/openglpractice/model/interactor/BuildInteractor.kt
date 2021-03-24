package com.example.openglpractice.model.interactor

import com.example.openglpractice.logic.AFeature
import com.example.openglpractice.logic.Character
import com.example.openglpractice.logic.Field
import com.example.openglpractice.model.Vector
import com.example.openglpractice.presenter.GamePresenter
import javax.inject.Inject

class BuildInteractor @Inject constructor() {
    private val levelManager = com.example.openglpractice.logic.LevelManager

    fun buildTouchPosition(position: Vector) {
        levelManager.buildTrap(position)
    }

    fun buildTrapSelect(trapIndex: Int) {
        levelManager.selectedFromThePalette(trapIndex)
    }

    fun buildInitialiseManager() {
        levelManager.initialise()
    }

    fun logicFieldMatrix(): Array<Array<Field>> {
        return levelManager.fieldMatrix
    }

    fun logicFeatureMatrix(): Array<Array<AFeature<*>?>> {
        return levelManager.featureMatrix
    }

    fun getSelectedTrapList(): Array<Int> {
        return Array(levelManager.selectedTraps.size) {
            levelManager.selectedTraps.elementAt(it).iconIndex
        }
    }

    fun buildArrowSelected(arrow: Int) {
        levelManager.selectedRotation=arrow.toByte()
    }

    fun getCharacterMatrix(): Array<Array<Character<*>?>> {
        return levelManager.characterMatrix
    }

}
