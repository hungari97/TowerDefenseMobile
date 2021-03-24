package com.example.openglpractice.model

interface AnimatableData<T:IFeatureEnum> {
    val animationState:IFeatureEnum
    var rotation:Byte
    var currentAnimationProgress:Int
    
    //TODO("accespoint to animation state")
    
}