package com.example.openglpractice.logic

import com.example.openglpractice.R
import com.example.openglpractice.logic.FeatureFactory.*
import com.example.openglpractice.model.*
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader


object LevelManager {
    var buildMode: Boolean = true
    var selectedRotation: Byte = 0.toByte()
    lateinit var data: LevelData
    lateinit var collisionManager: CollisionManager
    var selectedTrap: FeatureFactory? = null//index
    lateinit var hero: Hero
    var featureMatrix: Array<Array<AFeature<*>?>> = arrayOf()
    var fieldMatrix: Array<Array<Field>> = arrayOf()
    var lowCharacterMatrix: Array<Array<Character<*>?>> = arrayOf()
    var topCharacterMatrix: Array<Array<Character<*>?>> = arrayOf()
    var selectedTraps: Set<FeatureFactory> = setOf()
    private var idGen: Long = 0
    private var slime: Array<Enemy> = arrayOf()

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

    fun initialise(fieldTypes:Array<Array<Int>>) {
        idGen = 0
        hero = Hero(HeroData(
            2,
            5,
            2,
            Vector(0.0, 0.0),
            Vector(1.0, 1.0),
            HeroData.HeroAnimateState.HEROREST,
            0,
            null,
            null,
            null,
            2,
            setOf(SPIKETRAP, FIRETRAP)
        ))
        hero.data.functionality = hero

        selectedTraps = hero.data.trapTypes
        data = LevelData(
            initialiseFieldLayer(fieldTypes),
            initialiseFeatureLayer(),
            initialiseCharacterLayer(),
            3,
            14,
            0,
            3
        )

        Timer.startThread()
    }


    private fun initialiseFieldLayer(types:Array<Array<Int>>): Array<FieldData> {

        fieldMatrix = Array(8) { row ->
            Array(14) { field ->
                Field(
                    (row * 14 + field).toLong(),
                    row,
                    field,
                    types[row][field]
                )
            }
        }
       /* fieldMatrix[2][2].data.type = 1
        fieldMatrix[1][2].data.type = 1
        fieldMatrix[0][2].data.type = 1
        fieldMatrix[2][1].data.type = 1
        fieldMatrix[2][0].data.type = 1*/
        val tempArray: MutableList<FieldData> = mutableListOf()
        fieldMatrix.forEach { external ->
            external.forEach { internal ->
                tempArray.add(internal.data)
            }
        }
        return tempArray.toTypedArray()
    }

    private fun initialiseFeatureLayer(): Array<AFeatureData<*>?> {
        featureMatrix = Array(8) { row ->
            Array(14) { field ->
                null
            }
        }
        featureMatrix[3][2] = FeatureFactory.CRYSTAL.createFeature(Vector(3.0, 2.0), 1, 0.toByte())
        val tempArray: MutableList<AFeatureData<*>?> = mutableListOf()
        featureMatrix.forEach { external ->
            external.forEach { internal ->
                tempArray.add(internal?.data)
            }
        }
        return tempArray.toTypedArray()
    }

    private fun initialiseCharacterLayer(): Array<CharacterData<*>?> {
        lowCharacterMatrix = Array(8) { external ->
            Array(14) { internal ->
                null
            }
        }
        topCharacterMatrix = Array(8) { external ->
            Array(14) { internal ->
                null
            }
        }
        lowCharacterMatrix[0][0] = hero
        slime = arrayOf(EnemyFactory.SLIME.createEnemy(Vector(5.0, 5.0), 30, 2),
            EnemyFactory.SLIME.createEnemy(Vector(5.0, 7.0), 31, 2),
            EnemyFactory.SLIME.createEnemy(Vector(5.0, 6.0), 32, 2),
            EnemyFactory.SLIME.createEnemy(Vector(4.0, 5.0), 33, 2),
            EnemyFactory.SLIME.createEnemy(Vector(3.0, 5.0), 34, 2),
            EnemyFactory.SLIME.createEnemy(Vector(5.0, 4.0), 35, 2),
            EnemyFactory.SLIME.createEnemy(Vector(5.0, 3.0), 36, 2),
            EnemyFactory.SLIME.createEnemy(Vector(6.0, 3.0), 37, 2),
            EnemyFactory.SLIME.createEnemy(Vector(4.0, 7.0), 38, 2),
            EnemyFactory.SLIME.createEnemy(Vector(1.0, 0.0), 39, 2)
        )
        lowCharacterMatrix[5][5] = slime[0]
        lowCharacterMatrix[7][5] = slime[1]
        lowCharacterMatrix[6][5] = slime[2]
        lowCharacterMatrix[5][4] = slime[3]
        lowCharacterMatrix[5][3] = slime[4]
        lowCharacterMatrix[4][5] = slime[5]
        lowCharacterMatrix[3][5] = slime[6]
        lowCharacterMatrix[3][6] = slime[7]
        lowCharacterMatrix[7][4] = slime[8]
        lowCharacterMatrix[0][1] = slime[9]

        val tempArray: MutableList<CharacterData<*>?> = mutableListOf()
        lowCharacterMatrix.forEach { external ->
            external.forEach { internal ->
                tempArray.add(internal?.data)
            }
        }
        return tempArray.toTypedArray()
    }

    fun selectedFromThePalette(selectedType: Int) {
        if (selectedType == 3) {
            Timer.killTimer()
        } else
            if (selectedTrap == null) {
                selectedTrap = selectedTraps.elementAt(selectedType)
            } else {
                selectedTrap?.let {
                    selectedTrap = if (it.ordinal == selectedTraps.elementAt(selectedType).ordinal) {
                        null
                    } else
                        selectedTraps.elementAt(selectedType)
                }
            }
    }

    private fun idGenerate(type: FeatureFactory): Long {
        return type.ordinal * 100 + idGen++
    }

    fun positionToHero(to: Vector) {
        hero.data.goal = to
        slime.forEachIndexed { index, it ->
            it.data.goal = to
            /* when (index % 4) {
                 0 -> it.data.goal = Vector(to.x, to.y + (index / 4) + 1)
                 1 -> it.data.goal = Vector(to.x - (index / 4) - 1, to.y)
                 2 -> it.data.goal = Vector(to.x, to.y - (index / 4) - 1)
                 else -> it.data.goal = Vector(to.x + (index / 4) + 1, to.y)
             }*/
        }

    }

    fun buildTrap(position: Vector) {
        if (buildMode && okToPutDown(position)) {
            //ok position
            selectedTrap?.let {
                addTrapToData(position)
            }
        }
    }

    private fun okToPutDown(position: Vector): Boolean {
        //Van e ott valami
        featureMatrix[position.y.toInt()][position.x.toInt()]?.let {
            activateAnimation(it)
            return false
        }

        //in field types 0-path 1-wall 2-pit 3-water can not be build
        when (fieldMatrix[position.y.toInt()][position.x.toInt()].data.type) {
            0 -> {
                if (selectedTrap == FIRETRAP) {
                    return false
                }
            }
            1 -> {
                if (selectedTrap != FIRETRAP) {
                    return false
                }
            }
            2, 3 -> {
                return false
            }
        }

        //ha lerakjuk akk fog e felakadni valahol ha nagyobb mint (1;1)
        selectedTrap?.let {
            val test = it.createFeature(position, 0, selectedRotation).data
            var bool: Boolean = true

            val direction: Vector = if (test.hitBoxSize != Vector(1.0, 1.0))
                when (test.rotation) {
                    0.toByte() -> Vector(-1.0, 0.0)
                    1.toByte() -> Vector(0.0, 1.0)
                    2.toByte() -> Vector(1.0, 0.0)
                    else -> Vector(0.0, -1.0)
                } else Vector(0.0, 0.0)

            if (position.x.toInt() + direction.x < 0 ||
                position.x.toInt() + direction.x > 13 ||
                position.y.toInt() + direction.y > 7 ||
                position.y.toInt() + direction.y < 0
            ) {
                bool = false
            } else
                featureMatrix[position.y.toInt() + direction.y.toInt()][position.x.toInt() + direction.x.toInt()]?.let {
                    bool = false
                }
                    ?: if (fieldMatrix[position.y.toInt() + direction.y.toInt()][position.x.toInt() + direction.x.toInt()].data.type != 0) {
                        bool = false
                    }
            test.functionality!!.death()
            if (!bool) {
                return false
            }

        }
        return true
    }

    private fun activateAnimation(feature: AFeature<*>) {
        feature.triggered()
    }

    private fun addTrapToData(position: Vector) {
        val temp =
            selectedTrap!!.createFeature(position, idGenerate(selectedTrap!!), selectedRotation)

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