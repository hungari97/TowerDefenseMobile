package com.example.openglpractice.logic

import com.example.openglpractice.model.EActionType
import com.example.openglpractice.model.EnemyData
import com.example.openglpractice.model.Vector

open class Enemy(_data: EnemyData) : Character<EnemyData.EnemyAnimateState>() {
    override var data: EnemyData = _data

    init {
        Timer.subbscribers.plusAssign(::onThick)
    }

    override fun calcMove(from: Vector, to: Vector) {
        super.calcMove(from, to)
        data.path?.let {
            if (data.animationState.action == EActionType.REST){
                data.currentAnimationProgress = 0
            changeAnimateState("WALK")
            data.hitBoxSize = Vector(2.0, 1.0)
            LevelManager.topCharacterMatrix[data.path!![1].y.toInt()][data.path!![1].x.toInt()] =
                this}

        }
    }


    override fun hit(thing: Interactable) {
        TODO("Not yet implemented")
    }

    override fun death() {
        Timer.subbscribers.remove(::onThick)
        LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
            null
    }

    override fun onThick() {
        nextAnimationState()
        moveToThick()
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