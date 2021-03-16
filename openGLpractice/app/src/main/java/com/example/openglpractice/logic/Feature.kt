package com.example.openglpractice.logic

import com.example.openglpractice.model.AFeatureData
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
        functionality = this
    )

    override fun positionToMatrixPosition(position: Vector): Boolean {
        TODO("Not yet implemented")
    }
}