package com.example.openglpractice.model

import com.example.openglpractice.logic.Interactable

data class TrapData(
    override val id: Long,
    override var health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector,
    override val hitBoxSize: Vector,
    override val animationState: TrapAnimationState,
    override val currentAnimationProgress: Int,
    override var functionality: Interactable?,
    val coolDown:Long

) : AFeatureData<TrapData.TrapAnimationState>() {
    enum class TrapAnimationState
}