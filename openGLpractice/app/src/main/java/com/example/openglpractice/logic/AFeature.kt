package com.example.openglpractice.logic

import com.example.openglpractice.model.*


abstract class AFeature<T : IAnimateEnum> : Interactable, Animatable {
    abstract override val data: AFeatureData<T>
    protected var triggerd: Boolean = false
    override fun hit(thing: Interactable) {
        TODO("Not yet implemented")
    }

    override fun nextAnimationState() {
        data.currentAnimationProgress = (data.currentAnimationProgress + 1) % 16
    }

    open fun triggered() {
        triggerd=true
    }
}