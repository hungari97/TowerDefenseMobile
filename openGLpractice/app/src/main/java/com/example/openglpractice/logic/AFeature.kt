package com.example.openglpractice.logic

import com.example.openglpractice.model.AFeatureData
import com.example.openglpractice.model.FeatureData
import com.example.openglpractice.model.TrapData
import com.example.openglpractice.model.Vector


abstract class AFeature<T:Any> : Interactable, Animatable {
    abstract override val data: AFeatureData<T>
    override fun hit(thing: Interactable) {
        TODO("Not yet implemented")
    }

    abstract fun positionToMatrixPosition(position:Vector):Boolean


}