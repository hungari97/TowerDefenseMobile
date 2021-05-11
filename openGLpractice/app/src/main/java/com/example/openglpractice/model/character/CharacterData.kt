package com.example.openglpractice.model.character

import com.example.openglpractice.logic.character.ACharacter
import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.model.AnimatableData
import com.example.openglpractice.model.IAnimateEnum
import com.example.openglpractice.model.interaction.InteractableData
import com.example.openglpractice.utility.Vector

abstract class CharacterData: InteractableData, AnimatableData<ICharacterAnimationEnum> {
    abstract var goal: Vector<Int>?
    abstract var path: Array<Vector<Int>>?
    abstract override var hitBoxPosition: Vector<Int>
    abstract override var hitBoxSize: Vector<Int>
    abstract override val functionality: ACharacter?

    abstract override val animationState: ICharacterAnimationEnum

}