package com.example.openglpractice.model.feature

import com.example.openglpractice.logic.feature.AFeature
import com.example.openglpractice.model.AnimatableData
import com.example.openglpractice.model.IAnimateEnum
import com.example.openglpractice.model.interaction.InteractableData

abstract class AFeatureData<T: IAnimateEnum> : InteractableData, AnimatableData<T> {
    abstract override val functionality: AFeature<T>?
    abstract override val animationState: IAnimateEnum
}

