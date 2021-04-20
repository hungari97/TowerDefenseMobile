package com.example.openglpractice.logic

import com.example.openglpractice.model.FeatureData
import com.example.openglpractice.model.Vector

class Feature() : AFeature<FeatureData.AnimateAnimateState>() {
    override lateinit var data:FeatureData

    constructor(row: Double,coloum:Double) : this() {
        this.data = FeatureData(
            id = 0,
            health = 2,
            damage = 0,
            hitBoxPosition = Vector(row, coloum),
            hitBoxSize = Vector(1.0, 1.0),
            animationState = FeatureData.AnimateAnimateState.valueOf("CRYSTAL"),
            currentAnimationProgress = 1,
            functionality = this,
            rotation =0 )
    }
    constructor(rawdata:FeatureData) : this() {
        data=rawdata
    }



    init {
        Timer.subscribe(::onThick)
    }
    override fun death() {
        Timer.unSubscribe(::onThick)

    }

    override fun onThick() {
        //TODO("Not yet implemented")
    }

    override fun specialAttack() {
        TODO("Not yet implemented")
    }

}