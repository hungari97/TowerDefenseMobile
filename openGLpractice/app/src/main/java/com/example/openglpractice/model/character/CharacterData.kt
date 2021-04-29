package com.example.openglpractice.model.character

import com.example.openglpractice.model.AnimatableData
import com.example.openglpractice.model.IAnimateEnum
import com.example.openglpractice.model.interaction.InteractableData
import com.example.openglpractice.utility.Vector

abstract class CharacterData<T : IAnimateEnum> : InteractableData, AnimatableData<T> {
    abstract var goal: Vector<Int>?
    abstract var path: Array<Vector<Int>>?
    abstract override var hitBoxPosition: Vector<Int>
    abstract override var hitBoxSize: Vector<Int>

    abstract override val animationState: ICharacterAnimationEnum

}