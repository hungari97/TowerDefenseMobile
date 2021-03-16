package com.example.openglpractice.logic

import com.example.openglpractice.model.*


abstract class AFeature<T:IFeatureEnum> : Interactable, Animatable {
    abstract override val data: AFeatureData<T>
    override fun hit(thing: Interactable) {
        TODO("Not yet implemented")
    }

    abstract fun positionToMatrixPosition(position:Vector):Boolean


}