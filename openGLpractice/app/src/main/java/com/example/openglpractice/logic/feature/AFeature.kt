package com.example.openglpractice.logic.feature

import com.example.openglpractice.logic.IAnimatable
import com.example.openglpractice.logic.OLevelManager
import com.example.openglpractice.logic.OTimer
import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.model.*
import com.example.openglpractice.model.feature.AFeatureData
import com.example.openglpractice.utility.*

abstract class AFeature<T : IAnimateEnum> : IInteractable, IAnimatable {
    abstract override val data: AFeatureData<T>
    protected var triggerd: Boolean = false

    init {
        OTimer.subscribe(::onThick)
    }

    override fun hit(thing: IInteractable) {}

    override fun nextAnimationState() {
        data.animationProgress = (data.animationProgress + 1) % 16
    }

    open fun triggered() {
        triggerd = true
    }

    fun remove() {
        OTimer.unSubscribe(::onThick)
        if (OLevelManager.featureMatrix[data.hitBoxPosition] == this)
            OLevelManager.featureMatrix[data.hitBoxPosition] = null
    }
}