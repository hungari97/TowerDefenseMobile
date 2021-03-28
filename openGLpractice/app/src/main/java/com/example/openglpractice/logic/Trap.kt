package com.example.openglpractice.logic

import com.example.openglpractice.model.TrapData
import kotlin.concurrent.thread

open class Trap() : AFeature<TrapData.TrapAnimationState>() {
    override lateinit var data: TrapData
    var available: Boolean = true

    constructor(rawData: TrapData) : this() {
        data = rawData
    }

    init {
        Timer.subbscribers.plusAssign(::onThick)
    }

    override fun hit(thing: Interactable) {
        data.health -= thing.data.damage
    }

    fun used() {
        available = false
        val thread = thread {
            Thread.sleep(data.coolDown)
            //data.animationState = data.animationState.changeToAttack(data.animationState)
            //data.currentAnimationProgress = 0
            available = true
        }

    }

    override fun nextAnimationState() {
        super.nextAnimationState()
        if (triggerd) {
            if ((data.currentAnimationProgress + 1) % 16 == 0) {
                data.animationState = data.animationState.changeToAttack(data.animationState)
                triggerd = false
            }
        }
        //println("${data.animationState.name} animation progress ${data.currentAnimationProgress}")
    }

    override fun triggered() {
        super.triggered()
        if (available) {
            data.animationState = data.animationState.changeToAttack(data.animationState)
            data.currentAnimationProgress = 0
            used()
        }
    }

    override fun death() {
        Timer.subbscribers.remove ( ::onThick )
    }

    override fun onThick() {
        nextAnimationState()
    }
}
