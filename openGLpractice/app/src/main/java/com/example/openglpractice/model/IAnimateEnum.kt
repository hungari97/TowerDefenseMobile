package com.example.openglpractice.model

interface IAnimateEnum {
    val textureArray: Array<FloatArray>
    //val isWalking:Boolean

    fun calculateAnimationArray(type:Int,rest:Boolean):Array<FloatArray>

}