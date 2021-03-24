package com.example.openglpractice.logic

import com.example.openglpractice.model.AFeatureData
import com.example.openglpractice.model.CharacterData
import com.example.openglpractice.model.IFeatureEnum
import com.example.openglpractice.model.Vector

abstract class Character<T:IFeatureEnum>:Interactable,Animatable {
    abstract override val data: CharacterData<T>

    fun move(from: Vector, to:Vector){

    }
}