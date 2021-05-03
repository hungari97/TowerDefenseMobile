package com.example.openglpractice.logic.character

import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.model.character.EActionType
import com.example.openglpractice.model.character.HeroData

class Hero(rawData: HeroData) : ACharacter<HeroData.HeroAnimateState>() {
    override var data: HeroData = rawData

    override fun hit(thing: IInteractable) {
        data.health-=thing.data.damage
        if (data.health<=0)
            death()
    }

    override fun changeAnimateState(type: EActionType) {
        data.animationState = HeroData.HeroAnimateState.values().first { it.action == type }
        data.hitBoxSize = data.animationState.frameSize
    }

}