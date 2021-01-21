package com.example.openglpractice.logic

class Trap: Elemental,Interactable,Animated {
    override val element: Int
        get() = TODO("Not yet implemented")
    override val weakness: Int
        get() = TODO("Not yet implemented")
    override val id: Long
        get() = TODO("Not yet implemented")
    override val health: Int
        get() = TODO("Not yet implemented")
    override val damage: Int
        get() = TODO("Not yet implemented")
    override val hitBox: Long
        get() = TODO("Not yet implemented")

    val type:Int
    val position:IntArray
    val cooldown:Int
    val breakable:Boolean
    override val animationState: Enum<String>
        get() = TODO("Not yet implemented")
}