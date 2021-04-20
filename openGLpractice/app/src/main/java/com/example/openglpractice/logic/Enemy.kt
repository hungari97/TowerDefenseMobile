package com.example.openglpractice.logic

import com.example.openglpractice.model.EActionType
import com.example.openglpractice.model.EnemyData
import com.example.openglpractice.model.Vector

open class Enemy(_data: EnemyData) : Character<EnemyData.EnemyAnimateState>() {
    override var data: EnemyData = _data

    init {
        Timer.subscribe(::onThick)
    }

    override fun calcMove(from: Vector, to: Vector) {
        super.calcMove(from, to)
        data.path?.let {
            if (data.animationState.action == EActionType.REST) {
                data.currentAnimationProgress = 0
                changeAnimateState("WALK")
                data.hitBoxSize = Vector(2.0, 1.0)
                LevelManager.topCharacterMatrix[data.path!![1].y.toInt()][data.path!![1].x.toInt()] =
                    this
            }
        }
    }

    override fun attack() {
        if (attackNext) {
            super.attack()
        }else
        for (i in 0 until 4) {
            val direction: Vector =
                when (i % 4) {
                    0 -> Vector(0.0, -1.0)
                    1 -> Vector(1.0, 0.0)
                    2 -> Vector(0.0, 1.0)
                    else -> Vector(-1.0, 0.0)
                }
            if (data.hitBoxSize.x.toInt() + direction.x > 0 &&
                data.hitBoxSize.x.toInt() + direction.x < 13 &&
                data.hitBoxSize.y.toInt() + direction.y < 7 &&
                data.hitBoxSize.y.toInt() + direction.y > 0
            ) {
                LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt() + direction.y.toInt()][data.hitBoxPosition.x.toInt() + direction.x.toInt()]?.let {
                    if (it is Hero) {
                        data.rotation = i.toByte()
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

    override fun hit(thing: Interactable) {
        if (thing !is Enemy) {
            data.health -= thing.data.damage
            if (data.health <= 0) {
                death()
            }
        }
    }

    override fun death() {
        Timer.unSubscribe(::onThick)

        LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
            null
        if (data.animationState.action == EActionType.ATTACK || data.animationState.action == EActionType.WALK) {
            val direction: Vector = when (data.rotation) {
                0.toByte() -> Vector(-1.0, 0.0)
                1.toByte() -> Vector(0.0, 1.0)
                2.toByte() -> Vector(1.0, 0.0)
                else -> Vector(0.0, -1.0)
            }
            LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt() + direction.y.toInt()][data.hitBoxPosition.x.toInt() + direction.x.toInt()]?.let {
                LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt() + direction.y.toInt()][data.hitBoxPosition.x.toInt() + direction.x.toInt()] =
                    null
            }
        }
    }

    override fun specialAttack() {
        TODO("Not yet implemented")
    }

    override fun changeAnimateState(type: String) {
        when (type) {
            "REST" -> {
                data.animationState =
                    data.animationState.changeToAction(data.animationState, EActionType.REST)
            }
            "WALK" -> {
                data.animationState =
                    data.animationState.changeToAction(data.animationState, EActionType.WALK)
            }
            "ATTACK" -> {
                data.animationState =
                    data.animationState.changeToAction(data.animationState, EActionType.ATTACK)
            }
        }

    }
}