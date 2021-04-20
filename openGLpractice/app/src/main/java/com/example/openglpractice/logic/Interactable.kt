package com.example.openglpractice.logic

import com.example.openglpractice.model.InteractableData

interface Interactable {
    val data: InteractableData

    fun hit(thing:Interactable)

    fun death()
    fun specialAttack()
}