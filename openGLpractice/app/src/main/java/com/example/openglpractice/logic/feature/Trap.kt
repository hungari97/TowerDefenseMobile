package com.example.openglpractice.logic.feature

import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.logic.OLevelManager
import com.example.openglpractice.logic.character.ACharacter
import com.example.openglpractice.logic.character.Enemy
import com.example.openglpractice.model.feature.TrapData
import com.example.openglpractice.utility.*

open class Trap(override var data: TrapData) : AFeature<TrapData.TrapAnimationState>() {
    private var available: Boolean = true

    override fun hit(thing: IInteractable) {
        data.health -= thing.data.damage
        if (data.health <= 0)
            remove()
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
            val targets = mutableListOf<ACharacter<*>>()
            OLevelManager.characterPositionMatrix[data.hitBoxPosition]?.let {
                targets.add(it)
            }
            OLevelManager.characterTargetMatrix[data.hitBoxPosition]?.let {
                targets.add(it)
            }
            if (data.hitBoxSize == Vector(2, 1)) {
                val direction = data.rotation.vector
                OLevelManager.characterPositionMatrix[data.hitBoxPosition + direction]?.let {
                    targets.add(it)
                }
                OLevelManager.characterTargetMatrix[data.hitBoxPosition + direction]?.let {
                    targets.add(it)
                }
            }
            targets.forEach {
                if (it is Enemy)
                    it.hit(this)
            }
            if (targets.any { it is Enemy }) {
                super.triggered()
                data.animationState = data.animationState.changeToAttack(data.animationState)
                data.animationProgress = 0
                used()
            }
        }
    }

    override fun onThick() {
        nextAnimationState()
        triggered()
    }
}
