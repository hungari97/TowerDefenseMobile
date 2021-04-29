package com.example.openglpractice.logic.feature

import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.logic.OTimer
import com.example.openglpractice.model.feature.FeatureData

class Feature(override var data: FeatureData) : AFeature<FeatureData.FeatureAnimateState>() {

    init {
        OTimer.subscribe(::onThick)
    }
    override fun death() {
        OTimer.unSubscribe(::onThick)

    }

    override fun hit(thing: IInteractable) {
        data.health-=thing.data.damage
        if(data.health <= 0){
            death()
        }
    }

    override fun onThick() {
        //TODO("Not yet implemented")
    }

    override fun specialAttack() {
        TODO("Not yet implemented")
    }

}