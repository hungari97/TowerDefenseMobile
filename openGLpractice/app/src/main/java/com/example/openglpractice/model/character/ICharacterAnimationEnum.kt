package com.example.openglpractice.model.character

import com.example.openglpractice.model.IAnimateEnum
import com.example.openglpractice.utility.Vector

interface ICharacterAnimationEnum: IAnimateEnum {
    val action: EActionType
}