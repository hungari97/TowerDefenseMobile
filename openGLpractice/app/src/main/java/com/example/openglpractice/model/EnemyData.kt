package com.example.openglpractice.model

import com.example.openglpractice.logic.Interactable

data class EnemyData(
    override val id: Long,
    override val health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector,
    override val hitBoxSize: Vector,
    override val animationState: EnemyAnimateState,
    override val currentAnimationProgress: Int,
    override val goal: Vector?,
    override var path: Array<Vector>?,
    override val functionality: Interactable
): CharacterData<EnemyData.EnemyAnimateState>() {
    enum class EnemyAnimateState
}