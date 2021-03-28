package com.example.openglpractice.model

import com.example.openglpractice.logic.AFeature
import com.example.openglpractice.logic.Interactable

abstract class AFeatureData<T:IFeatureEnum> : InteractableData, AnimatableData<T> {
    abstract override val functionality: AFeature<T>?
    abstract override val animationState: IFeatureEnum

}

