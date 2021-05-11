package com.example.openglpractice.logic.character

import com.example.openglpractice.logic.OLevelManager
import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.model.character.EActionType
import com.example.openglpractice.model.character.EnemyData
import com.example.openglpractice.utility.*
import kotlin.math.abs

class Enemy(_data: EnemyData) : ACharacter() {
    override var data: EnemyData = _data

    override fun hit(thing: IInteractable) {
        if (thing !is Enemy) {
            data.health -= thing.data.damage
            if (data.health <= 0) {
                death()
            }
        }
    }

    override fun nextAnimationState() {
        data.animationProgress = (data.animationProgress + 1) % 16
        when (data.animationState.action) {
            EActionType.REST -> {
                val distance = OLevelManager.data.crystalPosition - data.hitBoxPosition
                if (abs(distance.x) + abs(distance.y) == 1) {
                    data.rotation = EDirection.values().first { it.vector == distance }
                    data.animationProgress = 0
                    changeAnimateState(EActionType.ATTACK)
                } else {
                    val path = calcPathBetween(data.hitBoxPosition,
                        OLevelManager.data.crystalPosition)?.toMutableList()
                    if (path != null && path.size != 2) {
                        path.remove(OLevelManager.data.crystalPosition)
                        data.goal = path.last()
                        data.path = path.toTypedArray()
                        data.animationProgress = 0
                        changeAnimateState(EActionType.WALK)
                    }
                }
            }
            EActionType.WALK -> {
                if (data.path == null) {
                    val distance = OLevelManager.data.crystalPosition - data.hitBoxPosition
                    if (abs(distance.x) + abs(distance.y) == 1) {
                        data.rotation = EDirection.values().first { it.vector == distance }
                        data.animationProgress = 0
                        changeAnimateState(EActionType.ATTACK)
                    } else
                    changeAnimateState(EActionType.REST)
                }
            }
            EActionType.ATTACK -> {
                if (data.animationProgress == 0) {
                    changeAnimateState(EActionType.REST)
                    OLevelManager.characterTargetMatrix[data.hitBoxPosition + data.rotation.vector] =
                        null
                }
            }
        }
    }

    override fun changeAnimateState(type: EActionType) {
        data.animationState = EnemyData.EnemyAnimateState.values().first { it.action == type }
        data.hitBoxSize = data.animationState.frameSize
    }

    override fun onAttack() {
        if (data.animationProgress == 0) {
            val direction = data.rotation.vector
            OLevelManager.characterTargetMatrix[data.hitBoxPosition + direction] = this
            OLevelManager.featureMatrix[data.hitBoxPosition + direction]?.hit(this)
        }
    }
}