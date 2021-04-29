package com.example.openglpractice.model.interaction

import com.example.openglpractice.utility.Vector

data class CollisionSectorData(
    val id:Long,
    val sectorPosition: Vector<Int>,
    val sectorSize: Vector<Int>,
    val capacity:Int,
    val inventory:Array<InteractableData>
) {

}