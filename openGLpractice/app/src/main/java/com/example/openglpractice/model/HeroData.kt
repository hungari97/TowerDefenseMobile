package com.example.openglpractice.model

import com.example.openglpractice.logic.FeatureFactory
import com.example.openglpractice.logic.Hero

data class HeroData(
    override val id: Long,
    override val health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector,
    override val hitBoxSize: Vector,
    override val animationState: HeroAnimateState,
    override val currentAnimationProgress: Int,
    override var goal: Vector?,
    override var path: Array<Vector>?,
    override var functionality: Hero?,
    var trapTypes:Set<FeatureFactory>

) : CharacterData<HeroData.HeroAnimateState>() {
    enum class HeroAnimateState
}