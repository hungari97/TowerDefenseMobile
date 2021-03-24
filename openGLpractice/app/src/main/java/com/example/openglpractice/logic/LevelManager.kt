package com.example.openglpractice.logic

import com.example.openglpractice.model.*
import com.example.openglpractice.model.Vector

object LevelManager {
    var selectedRotation: Byte =0.toByte()
    lateinit var data: LevelData
    lateinit var collisionManager: CollisionManager
    var selectedTrap: FeatureFactory? = null//index
    lateinit var hero: Hero
    var featureMatrix: Array<Array<AFeature<*>?>> = arrayOf()
    var fieldMatrix: Array<Array<Field>> = arrayOf()
    var characterMatrix: Array<Array<Character<*>?>> = arrayOf()
    var selectedTraps: Set<FeatureFactory> = setOf()
    private var idGen: Long = 0
    private var buildPhase:Boolean=true

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
        idGen = 0
//hero= Hero(1,5,2, Vector(0.5,0.5),Vector(1.0,1.0),))
        selectedTraps = setOf(FeatureFactory.SPIKETRAP, FeatureFactory.FIRETRAP)
        data = LevelData(initialiseFieldLayer(), initialiseFeatureLayer(), initialiseCharacterLayer(), 3, 14, 0, 3)

    }

    fun initialiseFieldLayer(): Array<FieldData> {
        fieldMatrix = Array(8) { row ->
            Array(14) { field ->
                Field(
                    (row * 14 + field).toLong(),
                    row,
                    field,
                    0
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

    fun initialiseCharacterLayer():Array<CharacterData<*>?>{
        characterMatrix= Array(8){ external ->
            Array(14){internal->
                null as Character<*>?
            }
        }
        var tempArray: MutableList<CharacterData<*>?> = mutableListOf()
        characterMatrix.forEach { external ->
            external.forEach { internal ->
                tempArray.add(internal?.data)
            }
        }
        return tempArray.toTypedArray()
    }

    fun selectedFromThePalette(selectedType: Int) {
        if(selectedType==5){
            Timer.startThread()
        }else if (selectedType==4){
            Timer.killTimer()
        }else
        if (selectedTrap == null) {
            selectedTrap = selectedTraps.elementAt(selectedType)
        } else {
            selectedTrap?.let {
                if (it.ordinal == selectedTraps.elementAt(selectedType).ordinal) {
                    selectedTrap = null
                } else
                    selectedTrap = selectedTraps.elementAt(selectedType)
            }
        }

        //hero.data.trapTypes.elementAt(selectedType)
    }

    fun idGenerate(type: FeatureFactory): Long {
        return type.ordinal * 100 + idGen++
    }

    /** */
    fun buildTrap(position: Vector) {
        /*featureMatrix.forEachIndexed { rindex, row ->
            row.forEachIndexed { index, it ->
                if (rindex == it?.data?.hitBoxPosition?.y?.toInt() && index == it?.data?.hitBoxPosition?.x?.toInt())
                    it?.nextAnimationState()
            }
        }*/
        if (okToPutDown(position)) {//ok position
            selectedTrap?.let {
                addTrapToData(position)
            }
        }
    }

    private fun okToPutDown(position: Vector): Boolean {
        featureMatrix[position.y.toInt()][position.x.toInt()]?.let {
            activateAnimation(it)
            return false
        }
        //in field types 1-wall 2-pit 3-water can not be build
        if (arrayOf(
                1,
                2,
                3
            ).contains(fieldMatrix[position.y.toInt()][position.x.toInt()].data.type)
        )
            return false
        selectedTrap?.let {
            val test=it.createFeature(position,0, selectedRotation).data
            when (test.rotation) {
                0.toByte() -> {
                    featureMatrix[position.y.toInt()+test.hitBoxSize.y.toInt()][position.x.toInt()-test.hitBoxSize.x.toInt()]?.let { return false }
                    if(position.x.toInt()-test.hitBoxSize.x +1 < 0 || position.y.toInt()+test.hitBoxSize.y-1 >7)
                        return false
                }
                1.toByte() -> {
                    featureMatrix[position.y.toInt()+test.hitBoxSize.x.toInt()][position.x.toInt()+test.hitBoxSize.y.toInt()]?.let { return false }
                    if(position.x.toInt()+test.hitBoxSize.y-1 >13 || position.y.toInt()+test.hitBoxSize.x-1 >7)
                        return false
                }
                2.toByte()->{
                    featureMatrix[position.y.toInt()+test.hitBoxSize.y.toInt()][position.x.toInt()+test.hitBoxSize.x.toInt()]?.let { return false }
                    if(position.x.toInt()+test.hitBoxSize.x-1 >13 || position.y.toInt()-test.hitBoxSize.y+1 <=0)
                        return false
                }
                3.toByte()->{
                    featureMatrix[position.y.toInt()-test.hitBoxSize.x.toInt()][position.x.toInt()-test.hitBoxSize.y.toInt()]?.let { return false }
                    if(position.x.toInt()-test.hitBoxSize.y+1 <0 || position.y.toInt()-test.hitBoxSize.x+1 <0)
                        return false
                }
            }
        }
        return true
    }

    private fun activateAnimation(feature: AFeature<*>) {
        feature.triggered()
    }

    private fun addTrapToData(position: Vector) {
        val temp = selectedTrap!!.createFeature(position, idGenerate(selectedTrap!!), selectedRotation)


        for (initialiseX in 0 until temp.data.hitBoxSize.x.toInt())
            for (initialiseY in 0 until temp.data.hitBoxSize.y.toInt()) {
                when (temp.data.rotation) {
                    0.toByte() -> {
                        if ((position.y.toInt() + initialiseY) == temp.data.hitBoxPosition.y.toInt() && position.x.toInt() + initialiseX == temp.data.hitBoxPosition.x.toInt()) {
                            featureMatrix[position.y.toInt() + initialiseY][position.x.toInt() + initialiseX] =
                                temp
                        } else {
                            featureMatrix[position.y.toInt() - initialiseY][position.x.toInt() - initialiseX] =
                                temp
                        }
                    }
                    1.toByte() -> {
                        if ((position.y.toInt() + initialiseY) == temp.data.hitBoxPosition.y.toInt() && position.x.toInt() + initialiseX == temp.data.hitBoxPosition.x.toInt()) {
                            featureMatrix[position.y.toInt() + initialiseY][position.x.toInt() + initialiseX] =
                                temp
                        } else {
                            featureMatrix[position.y.toInt() + initialiseX][position.x.toInt() - initialiseY] =
                                temp
                        }
                    }
                    2.toByte() -> {
                        featureMatrix[position.y.toInt() + initialiseY][position.x.toInt() + initialiseX] =
                            temp
                    }
                    3.toByte() -> {
                        if ((position.y.toInt() + initialiseY) == temp.data.hitBoxPosition.y.toInt() && position.x.toInt() + initialiseX == temp.data.hitBoxPosition.x.toInt()) {
                            featureMatrix[position.y.toInt() + initialiseY][position.x.toInt() + initialiseX] =
                                temp
                        } else {
                            featureMatrix[position.y.toInt() - initialiseX][position.x.toInt() + initialiseY] =
                                temp
                        }
                    }
                }
            }

        for (initialiseX in 0 until temp.data.hitBoxSize.x.toInt())
            for (initialiseY in 0 until temp.data.hitBoxSize.y.toInt()) {
                when (temp.data.rotation) {
                    0.toByte() -> {
                        data.AFeatureLayer[(position.y.toInt() - initialiseY) * 14 + (position.x.toInt() - initialiseX)] =
                            featureMatrix[position.y.toInt() - initialiseY][position.x.toInt() - initialiseX]?.data
                    }
                    1.toByte() -> {
                        data.AFeatureLayer[(position.y.toInt() + initialiseX) * 14 + (position.x.toInt() + initialiseY)] =
                            featureMatrix[position.y.toInt() + initialiseX][position.x.toInt() - initialiseY]?.data
                    }
                    2.toByte() -> {
                        data.AFeatureLayer[(position.y.toInt() + initialiseY) * 14 + (position.x.toInt() + initialiseX)] =
                            featureMatrix[position.y.toInt() + initialiseY][position.x.toInt() + initialiseX]?.data
                    }
                    3.toByte() -> {
                        data.AFeatureLayer[(position.y.toInt() - initialiseX) * 14 + (position.x.toInt() + initialiseY)] =
                            featureMatrix[position.y.toInt() - initialiseX][position.x.toInt() + initialiseY]?.data
                    }
                }

            }


    }

}