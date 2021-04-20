package com.example.openglpractice.logic

import com.example.openglpractice.model.TrapData
import com.example.openglpractice.model.Vector
import kotlin.concurrent.thread

open class Trap() : AFeature<TrapData.TrapAnimationState>() {
    override lateinit var data: TrapData
    var available: Boolean = true
    private var cooldownCounter:Int
    constructor(rawData: TrapData) : this() {
        data = rawData
    }

    init {
        Timer.subscribe(::onThick)
        cooldownCounter=0
    }

    override fun hit(thing: Interactable) {
        data.health -= thing.data.damage
        if (data.health<=0)
            death()
    }

    private fun used() {
        available = false

        val thread = Thread {
            Thread.sleep(data.coolDown)
            //data.animationState = data.animationState.changeToAttack(data.animationState)
            //data.currentAnimationProgress = 0
            available = true
        }
        thread.start()
    }

    override fun nextAnimationState() {
        super.nextAnimationState()
        if (triggerd) {
            if ((data.currentAnimationProgress + 1) % 16 == 0) {
                data.animationState = data.animationState.changeToAttack(data.animationState)
                triggerd = false
            }
        }
    }

    override fun triggered() {
        if (available) {
            LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()]?.let {
                if (it is Enemy) {
                    super.triggered()
                    it.hit(this)
                    data.animationState = data.animationState.changeToAttack(data.animationState)
                    data.currentAnimationProgress = 0
                    used()
                }
            }
            LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()]?.let {
                if (it is Enemy) {
                    super.triggered()
                    it.hit(this)
                    data.animationState =
                        data.animationState.changeToAttack(data.animationState)
                    data.currentAnimationProgress = 0
                    used()
                }
            }
            if (data.hitBoxSize == Vector(2.0, 1.0)) {
                val direction: Vector = when (data.rotation) {
                    0.toByte() -> Vector(-1.0, 0.0)
                    1.toByte() -> Vector(0.0, 1.0)
                    2.toByte() -> Vector(1.0, 0.0)
                    else -> Vector(0.0, -1.0)
                }
                LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt() + direction.y.toInt()][data.hitBoxPosition.x.toInt() + direction.x.toInt()]?.let {
                    if (it is Enemy) {
                        super.triggered()
                        it.hit(this)
                        data.animationState =
                            data.animationState.changeToAttack(data.animationState)
                        data.currentAnimationProgress = 0
                        used()
                    }

                }
                LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt() + direction.y.toInt()][data.hitBoxPosition.x.toInt() + direction.x.toInt()]?.let {
                    if (it is Enemy) {
                        super.triggered()
                        it.hit(this)
                        data.animationState =
                            data.animationState.changeToAttack(data.animationState)
                        data.currentAnimationProgress = 0
                        used()
                    }
                }
            }
        }
    }

    override fun death() {
        Timer.unSubscribe(::onThick)
    }

    override fun specialAttack() {
        TODO("Not yet implemented")
    }

    override fun onThick() {
        nextAnimationState()
        triggered()
    }
}
