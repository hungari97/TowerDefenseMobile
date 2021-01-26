package com.example.openglpractice.model

data class CollisionSectorData(
    val id:Long,
    val sectorPosition:Vector,
    val sectorSize:Vector,
    val capacity:Int,
    val inventory:Array<InteractableData>
) {

}