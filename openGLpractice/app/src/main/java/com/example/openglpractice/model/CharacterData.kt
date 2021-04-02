package com.example.openglpractice.model

abstract class CharacterData<T : IAnimateEnum> : InteractableData, AnimatableData<T> {
    abstract var goal: Vector?
    abstract var path: Array<Vector>?
    abstract override var hitBoxPosition: Vector
    abstract override var hitBoxSize: Vector

    abstract override val animationState: ICharacterAnimationEnum

}