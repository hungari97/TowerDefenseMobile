package com.example.openglpractice.model

import com.example.openglpractice.logic.AFeature
import com.example.openglpractice.logic.Feature
import com.example.openglpractice.logic.Interactable

data class FeatureData(
    override val id: Long,
    override val health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector,
    override val hitBoxSize: Vector,
    override var animationState: FeatureAnimateState,
    override var currentAnimationProgress: Int,
    override var rotation: Byte,
    override val functionality: Feature

) : AFeatureData<FeatureData.FeatureAnimateState>() {
    enum class FeatureAnimateState:IFeatureEnum
}