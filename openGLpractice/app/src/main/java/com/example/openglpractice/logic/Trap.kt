package com.example.openglpractice.logic

import com.example.openglpractice.model.TrapData
import com.example.openglpractice.model.Vector

open class Trap() : AFeature<TrapData.TrapAnimationState>() {
    override lateinit var data: TrapData
    var available:Boolean=true

    constructor(rawData:TrapData) : this() {
        data=rawData
    }

    init {
        data.functionality=this
    }

    override fun hit(thing: Interactable) {
        data.health-=thing.data.damage
    }

    fun used(){
        available=false
        var thread=Thread().run(){
            Thread.sleep(data.coolDown)
            available=true
        }
    }

    override fun positionToMatrixPosition(position: Vector):Boolean {
        return (position.x.toInt()==data.hitBoxPosition.x.toInt() && position.y.toInt()==data.hitBoxPosition.y.toInt())
    }


}
