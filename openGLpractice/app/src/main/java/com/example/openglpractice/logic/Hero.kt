package com.example.openglpractice.logic

import com.example.openglpractice.model.HeroData
import com.example.openglpractice.model.Vector

class Hero(id: Long, data: HeroData) : Character<HeroData.HeroAnimateState>() {
    override val data: HeroData = HeroData(
        id,
        5,
        2,
        Vector(0.5, 0.5),
        Vector(1.0, 1.0),
        HeroData.HeroAnimateState.valueOf("0"),
        0,
        null,
        null,
        this,
        0,
        setOf(FeatureFactory.SPIKETRAP,FeatureFactory.FIRETRAP),

    )

    init {
        data.functionality = this
        Timer.subbscribers.plus(onThick())
    }

    override fun hit(thing: Interactable) {
        TODO("Not yet implemented")
    }

    override fun death() {
        TODO("Not yet implemented")
    }

    override fun onThick() {
        TODO("Not yet implemented")
    }


}