package com.example.openglpractice.logic.interaction

import com.example.openglpractice.model.interaction.InteractableData

interface IInteractable {
    val data: InteractableData

    fun hit(thing: IInteractable)
}