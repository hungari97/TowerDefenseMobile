package com.example.openglpractice.model.interactor

import android.content.Context
import com.example.openglpractice.logic.AFeature
import com.example.openglpractice.logic.Character
import com.example.openglpractice.logic.Field
import com.example.openglpractice.logic.LevelManager
import com.example.openglpractice.model.Vector
import javax.inject.Inject

class BuildInteractor @Inject constructor() {
    private val levelManager = com.example.openglpractice.logic.LevelManager

    fun buildTouchPosition(position: Vector) {
        levelManager.buildTrap(position)
    }

    fun buildTrapSelect(trapIndex: Int) {
        levelManager.selectedFromThePalette(trapIndex)
    }

    fun buildInitialiseManager(field:Array<Array<Int>>) {
        levelManager.initialise(field)
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

    fun getCharacterMatrix(): Array<Array<Array<Character<*>?>>> {
        return arrayOf(levelManager.lowCharacterMatrix,levelManager.topCharacterMatrix)
    }

    fun playHeroGoalPosition(to:Vector){
        levelManager.positionToHero(to)
    }

    fun buildStartWave() {
        LevelManager.buildMode=false
    }

    fun endWave(){
        LevelManager.buildMode=true
    }

    fun gameHeroAttack() {
        LevelManager.hero.attack()
    }

}
