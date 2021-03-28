package com.example.openglpractice.logic

import com.example.openglpractice.model.FeatureData
import com.example.openglpractice.model.Vector

class Feature() : AFeature<FeatureData.FeatureAnimateState>() {
    override lateinit var data:FeatureData

    constructor(row: Double,coloum:Double) : this() {
        this.data = FeatureData(
            id = 0,
            health = 2,
            damage = 0,
            hitBoxPosition = Vector(row, coloum),
            hitBoxSize = Vector(1.0, 1.0),
            animationState = FeatureData.FeatureAnimateState.valueOf("CRYSTAL"),
            currentAnimationProgress = 1,
            functionality = this,
            rotation =0 )
    }
    constructor(rawdata:FeatureData) : this() {
        data=rawdata
    }



    init {
        Timer.subbscribers.plusAssign(::onThick)
    }
    override fun death() {
        Timer.subbscribers.remove (::onThick )

    }

    override fun onThick() {
        //TODO("Not yet implemented")
    }

}