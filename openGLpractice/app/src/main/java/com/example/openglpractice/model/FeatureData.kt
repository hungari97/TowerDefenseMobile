package com.example.openglpractice.model

import com.example.openglpractice.logic.Interactable

data class FeatureData(
    override val id: Long,
    override val health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector,
    override val hitBoxSize: Vector,
    override val animationState: FeatureAnimateState,
    override val currentAnimationProgress: Int,
    override val functionality: Interactable

) : AFeatureData<FeatureData.FeatureAnimateState>() {
    enum class FeatureAnimateState
}