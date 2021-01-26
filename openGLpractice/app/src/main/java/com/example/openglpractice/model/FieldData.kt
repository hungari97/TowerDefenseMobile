package com.example.openglpractice.model

import com.example.openglpractice.logic.Interactable

data class FieldData(
    override val id: Long,
    override val health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector,
    override val hitBoxSize: Vector,
    override val functionality: Interactable
) :InteractableData {

}