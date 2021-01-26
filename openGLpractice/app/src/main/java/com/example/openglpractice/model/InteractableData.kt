package com.example.openglpractice.model

import com.example.openglpractice.logic.Interactable

interface InteractableData {
    val id:Long
    val health:Int
    val damage:Int
    val hitBoxPosition:Vector
    val hitBoxSize:Vector
    val functionality:Interactable?
}
