package com.example.openglpractice.model

abstract class CharacterData<T : Any> : InteractableData, AnimatableData<T> {
    abstract val goal:Vector?
    abstract var path:Array<Vector>?
}