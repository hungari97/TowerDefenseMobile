package com.example.openglpractice.model

interface IFeatureEnum {
    val textureIndexes: FloatArray

    fun valueOfCurrentState(state :Int):FloatArray
    fun calculateCurrentState(minR:Int,minC:Int,maxR:Int,maxC:Int):FloatArray
}