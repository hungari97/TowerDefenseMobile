package com.example.openglpractice.model

interface IFeatureEnum {
    val textureArray: Array<FloatArray>

    fun calculateAnimationArray(type:Int,rest:Boolean):Array<FloatArray>

}