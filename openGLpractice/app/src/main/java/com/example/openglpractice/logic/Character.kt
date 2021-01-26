package com.example.openglpractice.logic

import com.example.openglpractice.model.CharacterData
import com.example.openglpractice.model.Vector

abstract class Character(override val data: CharacterData<*>):Interactable,Animatable {
    fun move(from: Vector, to:Vector){}
}