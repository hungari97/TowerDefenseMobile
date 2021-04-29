package com.example.openglpractice.logic.feature

import com.example.openglpractice.logic.IAnimatable
import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.model.*
import com.example.openglpractice.model.feature.AFeatureData

abstract class AFeature<T : IAnimateEnum> : IInteractable, IAnimatable {
    abstract override val data: AFeatureData<T>
    protected var triggerd: Boolean = false
    override fun hit(thing: IInteractable) {}

    override fun nextAnimationState() {
        data.currentAnimationProgress = (data.currentAnimationProgress + 1) % 16
    }

    open fun triggered() {
        triggerd=true
    }
}