package com.example.openglpractice.model

import com.example.openglpractice.utility.EDirection

interface AnimatableData<T:IAnimateEnum> {
    val animationState:IAnimateEnum
    var rotation: EDirection
    var animationProgress:Int
}