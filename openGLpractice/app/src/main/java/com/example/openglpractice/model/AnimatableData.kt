package com.example.openglpractice.model

interface AnimatableData<T:IAnimateEnum> {
    val animationState:IAnimateEnum
    var rotation:Byte
    var currentAnimationProgress:Int

    
}