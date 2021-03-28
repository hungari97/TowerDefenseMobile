package com.example.openglpractice.model

abstract class CharacterData<T : IFeatureEnum> : InteractableData, AnimatableData<T> {
    abstract val goal:Vector?
    abstract var path:Array<Vector>?
    abstract override var hitBoxPosition: Vector
}