package com.example.openglpractice.model.interaction

import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.utility.Vector

interface InteractableData {
    val id:Long
    val health:Int
    val damage:Int
    val hitBoxPosition: Vector<Int>
    val hitBoxSize: Vector<Int>
    val functionality: IInteractable?
}
