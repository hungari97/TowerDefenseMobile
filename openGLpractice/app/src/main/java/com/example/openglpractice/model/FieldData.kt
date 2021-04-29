package com.example.openglpractice.model

import com.example.openglpractice.logic.Field
import com.example.openglpractice.model.interaction.InteractableData
import com.example.openglpractice.utility.Vector

data class FieldData(
    override val id: Long,
    override val health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector<Int>,
    override val hitBoxSize: Vector<Int>,
    override var functionality: Field,
    var type:Int
) : InteractableData {

}