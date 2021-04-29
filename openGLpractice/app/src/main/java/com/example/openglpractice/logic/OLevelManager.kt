package com.example.openglpractice.logic

import com.example.openglpractice.logic.feature.EFeatureFactory.FIRETRAP
import com.example.openglpractice.logic.feature.EFeatureFactory.SPIKETRAP
import com.example.openglpractice.logic.character.ACharacter
import com.example.openglpractice.logic.character.EEnemyFactory
import com.example.openglpractice.logic.character.Enemy
import com.example.openglpractice.logic.character.Hero
import com.example.openglpractice.logic.feature.AFeature
import com.example.openglpractice.logic.feature.EFeatureFactory
import com.example.openglpractice.model.*
import com.example.openglpractice.model.character.CharacterData
import com.example.openglpractice.model.character.HeroData
import com.example.openglpractice.model.feature.AFeatureData
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.utility.Vector


object OLevelManager {
    var buildMode: Boolean = true
    var selectedRotation: EDirection = EDirection.LEFT
    lateinit var data: LevelData
    var selectedTrap: EFeatureFactory? = null//index
    lateinit var hero: Hero
    var featureMatrix: Array<Array<AFeature<*>?>> = arrayOf()
    var fieldMatrix: Array<Array<Field>> = arrayOf()
    var lowCharacterMatrix: Array<Array<ACharacter<*>?>> = arrayOf()
    var topCharacterMatrix: Array<Array<ACharacter<*>?>> = arrayOf()
    var selectedTraps: Set<EFeatureFactory> = setOf()
    private var idGen: Long = 0
    private var slimes: Array<Enemy> = arrayOf()

    fun initialise(fieldTypes: Array<Array<Int>>) {
        idGen = 0
        hero = Hero(HeroData(
            2,
            5,
            2,
            Vector(7, 3),
            Vector(1, 1),
            HeroData.HeroAnimateState.HEROREST,
            0,
            null,
            null,
            null,
            EDirection.RIGHT,
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

        OTimer.startThread()
    }

    private fun initialiseFieldLayer(types: Array<Array<Int>>): Array<FieldData> {
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
        val tempArray: MutableList<FieldData> = mutableListOf()
        fieldMatrix.forEach { external ->
            external.forEach { internal ->
                tempArray.add(internal.data)
            }
        }
        return tempArray.toTypedArray()
    }

    private fun initialiseFeatureLayer(): Array<AFeatureData<*>?> {
        featureMatrix = Array(8) { Array(14) { null } }
        featureMatrix[4][6] = EFeatureFactory.CRYSTAL.createFeature(Vector(6, 4), 1, EDirection.LEFT)
        val tempArray: MutableList<AFeatureData<*>?> = mutableListOf()
        featureMatrix.forEach { external ->
            external.forEach { internal ->
                tempArray.add(internal?.data)
            }
        }
        return tempArray.toTypedArray()
    }

    private fun initialiseCharacterLayer(): Array<CharacterData<*>?> {
        lowCharacterMatrix = Array(8) { Array(14) { null } }
        topCharacterMatrix = Array(8) { Array(14) { null } }
        lowCharacterMatrix[3][7] = hero
        slimes = arrayOf(
            EEnemyFactory.SLIME.createEnemy(Vector(13, 5), 36, EDirection.LEFT),
            EEnemyFactory.SLIME.createEnemy(Vector(13, 6), 37, EDirection.LEFT),
            EEnemyFactory.SLIME.createEnemy(Vector(0, 2), 38, EDirection.RIGHT),
            EEnemyFactory.SLIME.createEnemy(Vector(0, 1), 39, EDirection.RIGHT)
        )
        lowCharacterMatrix[5][13] = slimes[0]
        lowCharacterMatrix[6][13] = slimes[1]
        lowCharacterMatrix[2][0] = slimes[2]
        lowCharacterMatrix[1][0] = slimes[3]

        val tempArray: MutableList<CharacterData<*>?> = mutableListOf()
        lowCharacterMatrix.forEach { external ->
            external.forEach { internal ->
                tempArray.add(internal?.data)
            }
        }
        return tempArray.toTypedArray()
    }

    fun selectedFromThePalette(selectedType: Int) {
        when {
            selectedType == 3 -> {
                OTimer.killTimer()
            }
            selectedTrap == null -> {
                selectedTrap = selectedTraps.elementAt(selectedType)
            }
            else -> {
                selectedTrap?.let {
                    selectedTrap =
                        if (it.ordinal == selectedTraps.elementAt(selectedType).ordinal) {
                            null
                        } else
                            selectedTraps.elementAt(selectedType)
                }
            }
        }
    }

    private fun idGenerate(type: EFeatureFactory): Long {
        return type.ordinal * 100 + idGen++
    }

    fun positionToHero(to: Vector<Int>) {
        hero.data.goal = to
        slimes.forEachIndexed { _, it ->
            it.data.goal = to
            /* when (index % 4) {
                 0 -> it.data.goal = Vector(to.x, to.y + (index / 4) + 1)
                 1 -> it.data.goal = Vector(to.x - (index / 4) - 1, to.y)
                 2 -> it.data.goal = Vector(to.x, to.y - (index / 4) - 1)
                 else -> it.data.goal = Vector(to.x + (index / 4) + 1, to.y)
             }*/
        }

    }

    fun buildTrap(position: Vector<Int>) {
        if (buildMode && okToPutDown(position)) {
            //ok position
            selectedTrap?.let {
                addTrapToData(position)
            }
        }
    }

    private fun okToPutDown(position: Vector<Int>): Boolean {
        //Van e ott valami
        featureMatrix[position.y][position.x]?.let {
            activateAnimation(it)
            return false
        }

        //in field types 0-path 1-wall 2-pit 3-water can not be build
        when (fieldMatrix[position.y][position.x].data.type) {
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
            var bool = true

            val direction =
                if (test.hitBoxSize != Vector(1, 1))
                    test.rotation.vector
                else Vector(0, 0)

            if (position.x + direction.x < 0 ||
                position.x + direction.x > 13 ||
                position.y + direction.y > 7 ||
                position.y + direction.y < 0
            ) {
                bool = false
            } else
                featureMatrix[position.y + direction.y][position.x + direction.x]?.let {
                    bool = false
                }
                    ?: if (fieldMatrix[position.y + direction.y][position.x + direction.x].data.type != 0) {
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

    private fun addTrapToData(position: Vector<Int>) {
        val temp =
            selectedTrap!!.createFeature(position, idGenerate(selectedTrap!!), selectedRotation)

        for (initialiseX in 0 until temp.data.hitBoxSize.x)
            for (initialiseY in 0 until temp.data.hitBoxSize.y) {
                when (temp.data.rotation) {
                    EDirection.LEFT -> {
                        if ((position.y + initialiseY) == temp.data.hitBoxPosition.y && position.x + initialiseX == temp.data.hitBoxPosition.x) {
                            featureMatrix[position.y + initialiseY][position.x + initialiseX] =
                                temp
                        } else {
                            featureMatrix[position.y - initialiseY][position.x - initialiseX] =
                                temp
                        }
                    }
                    EDirection.UP -> {
                        if ((position.y + initialiseY) == temp.data.hitBoxPosition.y && position.x + initialiseX == temp.data.hitBoxPosition.x) {
                            featureMatrix[position.y + initialiseY][position.x + initialiseX] =
                                temp
                        } else {
                            featureMatrix[position.y + initialiseX][position.x - initialiseY] =
                                temp
                        }
                    }
                    EDirection.RIGHT -> {
                        featureMatrix[position.y + initialiseY][position.x + initialiseX] =
                            temp
                    }
                    EDirection.DOWN -> {
                        if ((position.y + initialiseY) == temp.data.hitBoxPosition.y && position.x + initialiseX == temp.data.hitBoxPosition.x) {
                            featureMatrix[position.y + initialiseY][position.x + initialiseX] =
                                temp
                        } else {
                            featureMatrix[position.y - initialiseX][position.x + initialiseY] =
                                temp
                        }
                    }
                }
            }

        for (initialiseX in 0 until temp.data.hitBoxSize.x)
            for (initialiseY in 0 until temp.data.hitBoxSize.y) {
                when (temp.data.rotation) {
                    EDirection.LEFT -> {
                        data.AFeatureLayer[(position.y - initialiseY) * data.columnNumber + (position.x - initialiseX)] =
                            featureMatrix[position.y - initialiseY][position.x - initialiseX]?.data
                    }
                    EDirection.UP -> {
                        data.AFeatureLayer[(position.y + initialiseX) * data.columnNumber + (position.x + initialiseY)] =
                            featureMatrix[position.y + initialiseX][position.x - initialiseY]?.data
                    }
                    EDirection.RIGHT -> {
                        data.AFeatureLayer[(position.y + initialiseY) * data.columnNumber + (position.x + initialiseX)] =
                            featureMatrix[position.y + initialiseY][position.x + initialiseX]?.data
                    }
                    EDirection.DOWN -> {
                        data.AFeatureLayer[(position.y - initialiseX) * data.columnNumber + (position.x + initialiseY)] =
                            featureMatrix[position.y - initialiseX][position.x + initialiseY]?.data
                    }
                }
            }
    }
}