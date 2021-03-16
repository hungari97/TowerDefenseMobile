package com.example.openglpractice.logic

import com.example.openglpractice.model.FieldData
import com.example.openglpractice.model.Vector

class Field(idGen:Long,row:Int,coloum:Int,type:Int):Interactable {
    override val data: FieldData = FieldData(
        idGen,
        1,
        0,
        Vector(0.5 * row, coloum * 0.5),
        Vector(0.5, 0.5),
        this,
        type
    )


    override fun hit(thing: Interactable) {
        TODO("Not yet implemented")
    }

}