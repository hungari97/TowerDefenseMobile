package com.example.openglpractice.model

interface IFeatureEnum {
    val textureArray: Array<FloatArray>
    val isWalking:Boolean

    fun calculateAnimationArray(type:Int,rest:Boolean):Array<FloatArray>

}