package com.example.openglpractice.model

import com.example.openglpractice.logic.AFeature

abstract class AFeatureData<T:IAnimateEnum> : InteractableData, AnimatableData<T> {
    abstract override val functionality: AFeature<T>?
    abstract override val animationState: IAnimateEnum
}

