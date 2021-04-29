package com.example.openglpractice.logic.character

import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.logic.OLevelManager
import com.example.openglpractice.logic.OTimer
import com.example.openglpractice.model.character.EActionType
import com.example.openglpractice.model.character.EnemyData
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.utility.Vector

open class Enemy(_data: EnemyData) : ACharacter<EnemyData.EnemyAnimateState>() {
    override var data: EnemyData = _data

    init {
        OTimer.subscribe(::onThick)
    }

    override fun calcMove(from: Vector<Int>, to: Vector<Int>) {
        super.calcMove(from, to)
       /* data.path?.let {
            if (data.animationState.action == EActionType.REST) {
                data.currentAnimationProgress = 0
                changeAnimateState("WALK")
                data.hitBoxSize = Vector(2.0, 1.0)
                LevelManager.topCharacterMatrix[data.path!![1].y][data.path!![1].x] =
                    this
            }
        }*/
    }

    override fun attack() {
        if (attackNext) {
            super.attack()
        }else
        for (i in 0 until 4) {
            val direction = EDirection.values()[i].vector
            if (data.hitBoxSize.x + direction.x in 1..12 &&
                data.hitBoxSize.y + direction.y in 1..6
            ) {
                OLevelManager.lowCharacterMatrix[data.hitBoxPosition.y + direction.y][data.hitBoxPosition.x + direction.x]?.let {
                    if (it is Hero) {
                        data.rotation = EDirection.values()[i]
                        attackNext = true
                    }
                }
            }
        }
    }

    override fun moveToThick() {
       // attack()
        super.moveToThick()
    }

    override fun hit(thing: IInteractable) {
        if (thing !is Enemy) {
            data.health -= thing.data.damage
            if (data.health <= 0) {
                death()
            }
        }
    }

    override fun death() {
        OTimer.unSubscribe(::onThick)

        OLevelManager.lowCharacterMatrix[data.hitBoxPosition.y][data.hitBoxPosition.x] =
            null
        if (data.animationState.action == EActionType.ATTACK || data.animationState.action == EActionType.WALK) {
            val direction = data.rotation.vector
            OLevelManager.topCharacterMatrix[data.hitBoxPosition.y + direction.y][data.hitBoxPosition.x + direction.x]?.let {
                OLevelManager.topCharacterMatrix[data.hitBoxPosition.y + direction.y][data.hitBoxPosition.x + direction.x] =
                    null
            }
        }
    }

    override fun specialAttack() {
        TODO("Not yet implemented")
    }

    override fun changeAnimateState(type: EActionType) {
        data.animationState = EnemyData.EnemyAnimateState.values().first { it.action == type }
        data.hitBoxSize = data.animationState.frameSize
    }
}