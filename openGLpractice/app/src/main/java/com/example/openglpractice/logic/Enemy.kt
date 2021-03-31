package com.example.openglpractice.logic

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
            if (data.animationState.ordinal ==
                data.animationState.changeToAction(data.animationState, "REST").ordinal
            )
                data.currentAnimationProgress = 0
            changeAnimateState("WALK")
            data.hitBoxSize = Vector(2.0, 1.0)
            LevelManager.topCharacterMatrix[data.path!![1].y.toInt()][data.path!![1].x.toInt()] =
                this

        }
    }

    override fun moveToThick() {
        val before = data.hitBoxPosition
        super.moveToThick()
        if (data.path.isNullOrEmpty()) {
            //ha végzett a menetellel menjen vissza várakozásba
            if (data.animationState.ordinal ==
                data.animationState.changeToAction(data.animationState, "WALK").ordinal) {
                data.goal = null
                LevelManager.lowCharacterMatrix[before.y.toInt()][before.x.toInt()] = null
                LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
                    this
                data.hitBoxSize = Vector(1.0, 1.0)
                changeAnimateState("REST")
            }
            //ha nincs útja és van célja akk számítson egyet
            data.goal?.let { calcMove(data.hitBoxPosition, it) }
        }
        data.path?.let { path ->
            if (data.currentAnimationProgress == 0) {
                if (data.goal!!.x.toInt() != path.last().x.toInt() || data.goal!!.y.toInt() != path.last().y.toInt()){

                    calcMove(data.hitBoxPosition, data.goal!!)
                    LevelManager.lowCharacterMatrix[before.y.toInt()][before.x.toInt()] = null
                    LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =null
                    LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
                        this
                    LevelManager.topCharacterMatrix[data.path!![1].y.toInt()][data.path!![1].x.toInt()] =
                        this
                }else {
                    if (data.hitBoxPosition.x.toInt() - path[1].x.toInt() == -1)
                        data.rotation = 2
                    else
                        if (data.hitBoxPosition.x.toInt() - path[1].x.toInt() == 1)
                            data.rotation = 0
                        else
                            if (data.hitBoxPosition.y.toInt() - path[1].y.toInt() == -1)
                                data.rotation = 1
                            else
                                if (data.hitBoxPosition.y.toInt() - path[1].y.toInt() == 1)
                                    data.rotation = 3

                    LevelManager.lowCharacterMatrix[before.y.toInt()][before.x.toInt()] = null
                    LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
                        this
                    LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
                        null
                    LevelManager.topCharacterMatrix[path[1].y.toInt()][path.get(1).x.toInt()] =
                        this
                }

            }
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
        super.changeAnimateState(type)
        when (type) {
            "REST" -> {
                data.animationState =
                    data.animationState.changeToAction(data.animationState, "REST")
            }
            "WALK" -> {
                data.animationState =
                    data.animationState.changeToAction(data.animationState, "WALK")
            }
            "ATTACK" -> {
                data.animationState =
                    data.animationState.changeToAction(data.animationState, "ATTACK")
            }
        }

    }
}