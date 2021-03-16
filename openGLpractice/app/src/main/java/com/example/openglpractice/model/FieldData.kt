package com.example.openglpractice.model

import com.example.openglpractice.logic.Field

data class FieldData(
    override val id: Long,
    override val health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector,
    override val hitBoxSize: Vector,
    override var functionality: Field,
    var type:Int
) :InteractableData {

}