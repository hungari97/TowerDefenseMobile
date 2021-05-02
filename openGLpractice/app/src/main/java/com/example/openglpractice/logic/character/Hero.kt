package com.example.openglpractice.logic.character

import com.example.openglpractice.logic.feature.EFeatureFactory
import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.logic.OTimer
import com.example.openglpractice.model.character.EActionType
import com.example.openglpractice.model.character.HeroData
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.utility.Vector

class Hero() : ACharacter<HeroData.HeroAnimateState>() {
    override lateinit var data: HeroData

    constructor(rawData: HeroData) : this() {
        data = rawData
    }

    constructor(id: Long) : this() {
        data = HeroData(
            id = id,
            health = 5,
            damage = 2,
            hitBoxPosition = Vector(1, 1),
            hitBoxSize = Vector(1, 1),
            animationState = HeroData.HeroAnimateState.valueOf("HEROREST"),
            animationProgress = 0,
            goal = null,
            path = null,
            functionality = this,
            rotation = EDirection.RIGHT,
            trapTypes = setOf(EFeatureFactory.SPIKETRAP, EFeatureFactory.FIRETRAP)
        )
    }

    init {
        OTimer.subscribe(::onThick)
    }

    override fun hit(thing: IInteractable) {
        data.health-=thing.data.damage
        if (data.health<=0)
            death()
    }

    override fun death() {
        OTimer.unSubscribe(::onThick)
    }

    override fun specialAttack() {
        TODO("Not yet implemented")
    }

    override fun calcPathBetween(from: Vector<Int>, to: Vector<Int>) {
        super.calcPathBetween(from, to)
        /*data.path?.let {
            if (data.animationState.name.equals("HEROREST")) {
                data.currentAnimationProgress = 0
                changeAnimateState("WALK")
                data.hitBoxSize = Vector(2.0, 1.0)
                LevelManager.topCharacterMatrix[data.path!![1].y.toInt()][data.path!![1].x.toInt()] =
                    this
            }
        }*/

    }

    override fun nextAnimationState() {
        super.nextAnimationState()

    }

    override fun changeAnimateState(type: EActionType) {
        data.animationState = HeroData.HeroAnimateState.values().first { it.action == type }
        data.hitBoxSize = data.animationState.frameSize
    }

}