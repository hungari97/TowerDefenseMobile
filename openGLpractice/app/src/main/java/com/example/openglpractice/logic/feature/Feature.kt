package com.example.openglpractice.logic.feature

import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.logic.OTimer
import com.example.openglpractice.model.feature.FeatureData

class Feature(override var data: FeatureData) : AFeature<FeatureData.FeatureAnimateState>() {


    override fun hit(thing: IInteractable) {
        data.health-=thing.data.damage
        if(data.health <= 0){
            remove()
        }
    }

    override fun onThick() {
        //TODO("Not yet implemented")
    }

}