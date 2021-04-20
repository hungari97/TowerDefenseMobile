package com.example.openglpractice.logic

import com.example.openglpractice.model.HeroData
import com.example.openglpractice.model.Vector

class Hero() : Character<HeroData.HeroAnimateState>() {
    override lateinit var data: HeroData

    constructor(rawData: HeroData) : this() {
        data = rawData
    }

    constructor(id: Long) : this() {
        data = HeroData(
            id = id,
            health = 5,
            damage = 2,
            hitBoxPosition = Vector(0.5, 0.5),
            hitBoxSize = Vector(1.0, 1.0),
            animationState = HeroData.HeroAnimateState.valueOf("HEROREST"),
            currentAnimationProgress = 0,
            goal = null,
            path = null,
            functionality = this,
            rotation = 2,
            trapTypes = setOf(FeatureFactory.SPIKETRAP, FeatureFactory.FIRETRAP)
        )
    }

    init {
        Timer.subscribe(::onThick)
    }

    override fun hit(thing: Interactable) {
        data.health-=thing.data.damage
        if (data.health<=0)
            death()
    }

    override fun death() {
        Timer.unSubscribe(::onThick)
    }

    override fun specialAttack() {
        TODO("Not yet implemented")
    }

    override fun calcMove(from: Vector, to: Vector) {
        super.calcMove(from, to)
        data.path?.let {
            if (data.animationState.name.equals("HEROREST")) {
                data.currentAnimationProgress = 0
                changeAnimateState("WALK")
                data.hitBoxSize = Vector(2.0, 1.0)
                LevelManager.topCharacterMatrix[data.path!![1].y.toInt()][data.path!![1].x.toInt()] =
                    this
            }
        }
    }

    override fun nextAnimationState() {
        super.nextAnimationState()

    }

    override fun changeAnimateState(type: String) {
        when (type) {
            "REST" -> {
                data.animationState = HeroData.HeroAnimateState.HEROREST
            }
            "WALK" -> {
                data.animationState = HeroData.HeroAnimateState.HEROWALK
            }
            "ATTACK" -> {
                data.animationState = HeroData.HeroAnimateState.HEROATTACK
            }
        }

    }

}