package com.example.openglpractice.logic

import com.example.openglpractice.model.AFeatureData
import com.example.openglpractice.model.LevelData
import com.example.openglpractice.model.Vector
import java.lang.Exception

object LevelManager {
    lateinit var data: LevelData
    lateinit var collisionManager: CollisionManager
    var selectedTrap: Int = 0//index
    lateinit var hero: Hero


    fun initialise(hero: Hero) {
        collisionManager = CollisionManager()
        this.hero = hero
        data.characterLayer[0] = hero.data


        TODO("felparamétereznni a megfelelő pályára")
    }

    fun selectedFromThePalette(selectedType: FeatureFactory) {
        //benne van -e a kiválasztható csapdák között
        if (!hero.data.trapTypes.contains(selectedType)) {
            throw Exception("Not choosable trap has been selected!")
        }
        selectedTrap = hero.data.trapTypes.indexOf(selectedType)
        //változtatjuk a hátterét a kiválasztottnak (és ha kell az előző kiválasztottnak)
        TODO("changeBackgroundColor(selectedTrap)")


    }

    /** */
    fun buildTrap(position: Vector) {
        if(okToPutDown(position))//ok position
        addTrapToData(position)
    }

    private fun okToPutDown(position: Vector): Boolean {
        data.AFeatureLayer.forEach {
            if (it.functionality.positionToMatrixPosition(position))
                return it !is Trap
        }
        return false
    }


    private fun addTrapToData(position: Vector) {

        FeatureFactory.TRAP.createFeature(position)
    }

    fun positionToMatrix(position: Vector): AFeatureData<*>? {
        data.AFeatureLayer.forEach {
            if (position.x.toInt()==it.hitBoxPosition.x.toInt() && position.y.toInt()==it.hitBoxPosition.y.toInt())
                return 
        }
        return null
    }

}