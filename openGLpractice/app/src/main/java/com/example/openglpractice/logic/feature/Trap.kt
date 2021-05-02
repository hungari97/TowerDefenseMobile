package com.example.openglpractice.logic.feature

import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.logic.OLevelManager
import com.example.openglpractice.logic.OTimer
import com.example.openglpractice.logic.character.Enemy
import com.example.openglpractice.model.feature.TrapData
import com.example.openglpractice.utility.Vector

open class Trap(override var data: TrapData) : AFeature<TrapData.TrapAnimationState>() {
    var available: Boolean = true
    private var cooldownCounter:Int

    init {
        OTimer.subscribe(::onThick)
        cooldownCounter=0
    }

    override fun hit(thing: IInteractable) {
        data.health -= thing.data.damage
        if (data.health<=0)
            death()
    }

    private fun used() {
        available = false

        val thread = Thread {
            Thread.sleep(data.coolDown)
            available = true
        }
        thread.start()
    }

    override fun nextAnimationState() {
        super.nextAnimationState()
        if (triggerd) {
            if ((data.animationProgress + 1) % 16 == 0) {
                data.animationState = data.animationState.changeToAttack(data.animationState)
                triggerd = false
            }
        }
    }

    override fun triggered() {
        if (available) {
            OLevelManager.characterPositionMatrix[data.hitBoxPosition.y][data.hitBoxPosition.x]?.let {
                if (it is Enemy) {
                    super.triggered()
                    it.hit(this)
                    data.animationState = data.animationState.changeToAttack(data.animationState)
                    data.animationProgress = 0
                    used()
                }
            }
            OLevelManager.characterTargetMatrix[data.hitBoxPosition.y][data.hitBoxPosition.x]?.let {
                if (it is Enemy) {
                    super.triggered()
                    it.hit(this)
                    data.animationState =
                        data.animationState.changeToAttack(data.animationState)
                    data.animationProgress = 0
                    used()
                }
            }
            if (data.hitBoxSize == Vector(2, 1)) {
                val direction = data.rotation.vector
                OLevelManager.characterPositionMatrix[data.hitBoxPosition.y + direction.y][data.hitBoxPosition.x + direction.x]?.let {
                    if (it is Enemy) {
                        super.triggered()
                        it.hit(this)
                        data.animationState =
                            data.animationState.changeToAttack(data.animationState)
                        data.animationProgress = 0
                        used()
                    }

                }
                OLevelManager.characterTargetMatrix[data.hitBoxPosition.y + direction.y][data.hitBoxPosition.x + direction.x]?.let {
                    if (it is Enemy) {
                        super.triggered()
                        it.hit(this)
                        data.animationState =
                            data.animationState.changeToAttack(data.animationState)
                        data.animationProgress = 0
                        used()
                    }
                }
            }
        }
    }

    override fun death() {
        OTimer.unSubscribe(::onThick)
    }

    override fun specialAttack() {}

    override fun onThick() {
        nextAnimationState()
        triggered()
    }
}
