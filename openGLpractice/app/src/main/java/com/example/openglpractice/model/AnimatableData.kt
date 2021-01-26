package com.example.openglpractice.model

interface AnimatableData<T:Any> {
    val animationState:T
    val currentAnimationProgress:Int
    
    //TODO("accespoint to animation state")
    
}