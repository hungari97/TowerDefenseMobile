package com.example.openglpractice.model

interface AnimatableData<T:IFeatureEnum> {
    val animationState:IFeatureEnum
    var currentAnimationProgress:Int
    
    //TODO("accespoint to animation state")
    
}