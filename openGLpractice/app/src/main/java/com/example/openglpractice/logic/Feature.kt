package com.example.openglpractice.logic

import com.example.openglpractice.model.FeatureData
import com.example.openglpractice.model.Vector

class Feature(row: Double,coloum:Double) : AFeature<FeatureData.FeatureAnimateState>() {
    override val data = FeatureData(
        id = 0,
        health = 2,
        damage = 0,
        hitBoxPosition = Vector(row, coloum),
        hitBoxSize = Vector(0.5, 0.5),
        animationState = FeatureData.FeatureAnimateState.valueOf(""),
        currentAnimationProgress = 1,
        functionality = this,
        rotation =0

    )

    init {
        Timer.subbscribers.plus(onThick())
    }
    override fun death() {
        Timer.subbscribers.remove { this.onThick() }

    }

    override fun onThick() {
        TODO("Not yet implemented")
    }

}