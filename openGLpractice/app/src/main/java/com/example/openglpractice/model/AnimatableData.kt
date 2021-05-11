package com.example.openglpractice.model

import com.example.openglpractice.utility.EDirection

interface AnimatableData<T:IAnimateEnum> {
    val animationState:T
    var rotation: EDirection
    var animationProgress:Int
}