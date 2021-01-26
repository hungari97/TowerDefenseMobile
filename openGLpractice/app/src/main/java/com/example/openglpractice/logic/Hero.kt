package com.example.openglpractice.logic

import com.example.openglpractice.model.HeroData

class Hero(override var data:HeroData):Interactable {

    init {
        data.functionality=this
    }
    override fun hit(thing: Interactable) {
        TODO("Not yet implemented")
    }


}