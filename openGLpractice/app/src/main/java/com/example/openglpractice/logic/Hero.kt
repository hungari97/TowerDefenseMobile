package com.example.openglpractice.logic

import com.example.openglpractice.model.FieldData
import com.example.openglpractice.model.HeroData
import com.example.openglpractice.model.Vector

class Hero(id: Long, data: HeroData) : Interactable {
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
        setOf(FeatureFactory.TRAP)
    )

    init {
        data.functionality = this
    }

    override fun hit(thing: Interactable) {
        TODO("Not yet implemented")
    }


}