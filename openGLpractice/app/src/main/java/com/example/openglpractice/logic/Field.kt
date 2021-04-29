package com.example.openglpractice.logic

import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.model.FieldData
import com.example.openglpractice.utility.Vector

class Field(idGen:Long,row:Int,coloum:Int,type:Int): IInteractable {
    override val data: FieldData = FieldData(
        idGen,
        1,
        0,
        Vector(coloum,row),
        Vector(1, 1),
        this,
        type
    )

    override fun specialAttack() {
        TODO("Not yet implemented")
    }

    override fun hit(thing: IInteractable) {
        TODO("Not yet implemented")
    }

    override fun death() {
        TODO("Not yet implemented")
    }

}