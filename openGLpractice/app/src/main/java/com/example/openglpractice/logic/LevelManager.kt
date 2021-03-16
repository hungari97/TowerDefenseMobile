package com.example.openglpractice.logic

import com.example.openglpractice.model.*
import com.example.openglpractice.model.Vector
import kotlin.random.Random

object LevelManager {
    lateinit var data: LevelData
    lateinit var collisionManager: CollisionManager
    var selectedTrap: FeatureFactory? = null//index
    lateinit var hero: Hero
    var featureMatrix: Array<Array<AFeature<*>?>> = arrayOf()
    var fieldMatrix: Array<Array<Field>> = arrayOf()
    var selectedTraps: Set<FeatureFactory> = setOf()

    fun initialise(hero: Hero) {
        collisionManager = CollisionManager()
        featureMatrix = Array(data.AFeatureLayer.size / data.columnNumber) {
            Array<AFeature<*>?>(data.columnNumber) { null }
        }

        this.hero = hero
        data.characterLayer[0] = hero.data

        //buildInteractor.logicInitialiseManager(hero.data.trapTypes.toTypedArray())

        TODO("felparamétereznni a megfelelő pályára")
    }

    fun initialise() {
//hero= Hero(1,5,2, Vector(0.5,0.5),Vector(1.0,1.0),))
        selectedTraps = setOf(FeatureFactory.TRAP)
        data = LevelData(initialiseFieldLayer(), initialiseFeatureLayer(), arrayOf(), 3, 14, 0, 3)

    }

    fun initialiseFieldLayer(): Array<FieldData> {
        fieldMatrix = Array(8) { row ->
            Array(14) { field ->
                Field(
                    (row * 14 + field).toLong(),
                    row,
                    field,
                    Random.nextInt(0, 4)
                )
            }
        }
        var tempArray: MutableList<FieldData> = mutableListOf()
        fieldMatrix.forEach { external ->
            external.forEach { internal ->
                tempArray.add(internal.data)
            }
        }
        return tempArray.toTypedArray()
    }

    fun initialiseFeatureLayer(): Array<AFeatureData<*>?> {
        featureMatrix = Array(8) { row ->
            Array(14) { field ->
                null as AFeature<*>?
            }
        }
        var tempArray: MutableList<AFeatureData<*>?> = mutableListOf()
        featureMatrix.forEach { external ->
            external.forEach { internal ->
                tempArray.add(internal?.data)
            }
        }
        return tempArray.toTypedArray()
    }


    fun selectedFromThePalette(selectedType: Int) {
        selectedTrap = FeatureFactory.TRAP//hero.data.trapTypes.elementAt(selectedType)
        //változtatjuk a hátterét a kiválasztottnak (és ha kell az előző kiválasztottnak)
//        //TODO("changeBackgroundColor(selectedTrap)")
    }

    /** */
    fun buildTrap(position: Vector) {
        if (okToPutDown(position)) {//ok position
            selectedTrap?.let {
                addTrapToData(position)
            }
        }
    }

    private fun okToPutDown(position: Vector): Boolean {
        featureMatrix[position.y.toInt()][position.x.toInt()]?.let {
            activateAnimation(it)
            return false }
        if(fieldMatrix[position.y.toInt()][position.x.toInt()].data.type==1)
            return false
        return true
    }

    private fun activateAnimation(feature: AFeature<*>) {
         
    }


    private fun addTrapToData(position: Vector) {
        println(featureMatrix.size)
        println(featureMatrix[0].size)
        println("x ${position.x} y ${position.y}")

        featureMatrix[position.y.toInt()][position.x.toInt()] =
            selectedTrap?.createFeature(position)

        data.AFeatureLayer[position.y.toInt() * 14 + position.x.toInt()] =
            featureMatrix[position.y.toInt()][position.x.toInt()]?.data
    }

    /* fun positionToMatrix(position: Vector): AFeatureData<*>? {
         data.AFeatureLayer.forEach {
             if (position.x.toInt()==it.hitBoxPosition.x.toInt() && position.y.toInt()==it.hitBoxPosition.y.toInt())
                 return
         }
         return null
     }*/

}