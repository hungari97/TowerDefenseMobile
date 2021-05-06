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
import com.example.openglpractice.model.interactor.BuildInteractor
import com.example.openglpractice.utility.*
import kotlin.random.Random


object OLevelManager {
    var buildMode: Boolean = true
    var selectedRotation: EDirection = EDirection.LEFT
    lateinit var data: LevelData
    var selectedTrap: EFeatureFactory? = null//index
    lateinit var hero: Hero
    var featureMatrix: Array<Array<AFeature<*>?>> = arrayOf()
    var fieldMatrix: Array<Array<Field>> = arrayOf()
    var characterPositionMatrix: Array<Array<ACharacter<*>?>> = arrayOf()
    var characterTargetMatrix: Array<Array<ACharacter<*>?>> = arrayOf()
    var selectedTraps: Set<EFeatureFactory> = setOf()
    private var idGen: Long = 0
    var interactor: BuildInteractor? = null

    fun initialise(levelLayout: Array<Array<Int>>) {
        idGen = 0
        hero = Hero(HeroData(
            2,
            5,
            2,
            Vector(levelLayout[1][0], levelLayout[1][1]),
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
            arrayOf(),
            arrayOf(),
            levelLayout[2],
            levelLayout[3],
            14,
            0,
            3,
            Vector(levelLayout[0][0], levelLayout[0][1]),
        )

        val layout = levelLayout.toMutableList()
        repeat(4) {
            layout.removeAt(0)
        }
        val fields = initialiseFieldLayer(layout.toTypedArray())
        val features = initialiseFeatureLayer()
        initialiseCharacterLayer()

        data.fieldLayer = fields
        data.featureLayer = features

        OTimer.subscribe(::spawn)
        OTimer.subscribe(::checkIfLevelEnded)
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
        featureMatrix[4][6] =
            EFeatureFactory.CRYSTAL.createFeature(Vector(6, 4), 1, EDirection.LEFT)
        val tempArray: MutableList<AFeatureData<*>?> = mutableListOf()
        featureMatrix.forEach { external ->
            external.forEach { internal ->
                tempArray.add(internal?.data)
            }
        }
        return tempArray.toTypedArray()
    }

    private fun initialiseCharacterLayer(): Array<CharacterData<*>?> {
        characterPositionMatrix = Array(8) { Array(14) { null } }
        characterTargetMatrix = Array(8) { Array(14) { null } }
        characterPositionMatrix[hero.data.hitBoxPosition] = hero

        val tempArray: MutableList<CharacterData<*>?> = mutableListOf()
        characterPositionMatrix.forEach { external ->
            tempArray.addAll(external.map { it?.data })
        }
        return tempArray.toTypedArray()
    }

    fun spawn() {
        if (buildMode || data.enemyToSpawnCount[0] == 0) return
        characterPositionMatrix.first().forEachIndexed { index: Int, it: ACharacter<*>? ->
            if (data.enemyToSpawnCount[0] != 0
                && it == null
                && fieldMatrix.first()[index].data.type == 0
            ) {
                characterPositionMatrix.first()[index] =
                    EEnemyFactory.SLIME.createEnemy(
                        id = Random.nextLong(),
                        rotation = EDirection.UP,
                        position = Vector(index, 0)
                    )
                data.enemyToSpawnCount[0]--
            }
        }
        characterPositionMatrix.last().forEachIndexed { index: Int, it: ACharacter<*>? ->
            if (data.enemyToSpawnCount[0] != 0 && it == null
                && fieldMatrix.last()[index].data.type == 0
            ) {
                characterPositionMatrix.last()[index] =
                    EEnemyFactory.SLIME.createEnemy(
                        id = Random.nextLong(),
                        rotation = EDirection.DOWN,
                        position = Vector(index, characterPositionMatrix.lastIndex)
                    )
                data.enemyToSpawnCount[0]--
            }
        }
        characterPositionMatrix.forEachIndexed { index: Int, it: Array<ACharacter<*>?> ->
            it.first()
            it.last()
            if (data.enemyToSpawnCount[0] != 0
                && characterPositionMatrix[index].first() == null
                && fieldMatrix[index].first().data.type == 0
            ) {
                characterPositionMatrix[index][0] =
                    EEnemyFactory.SLIME.createEnemy(
                        id = Random.nextLong(),
                        rotation = EDirection.RIGHT,
                        position = Vector(0, index)
                    )
                data.enemyToSpawnCount[0]--
            }
            if (data.enemyToSpawnCount[0] != 0
                && characterPositionMatrix[index].last() == null
                && fieldMatrix[index].last().data.type == 0
            ) {
                characterPositionMatrix[index][characterPositionMatrix[index].lastIndex] =
                    EEnemyFactory.SLIME.createEnemy(
                        id = Random.nextLong(),
                        rotation = EDirection.LEFT,
                        position = Vector(characterPositionMatrix[index].lastIndex, index)
                    )

                data.enemyToSpawnCount[0]--
            }
        }
    }

    fun checkIfLevelEnded() {
        //TODO("Az aktuális wave elfogyása csak a fázist zárja")
        if (data.enemyToSpawnCount[0] == 0
            && !characterPositionMatrix.any { line -> line.any { it is Enemy } }
            || featureMatrix[data.crystalPosition] == null
            || hero.data.health <= 0
        ) {
            interactor?.gameNotifyUIAboutGameEnd()
        }
    }

    fun nextWave() {
        data.enemyToSpawnCount =
            data.enemyToSpawnCount.toMutableList().also { it.removeAt(0) }.toTypedArray()
    }

    fun selectedFromThePalette(selectedTypeIndex: Int) {
        when {
            selectedTypeIndex == 3 -> {
                OTimer.killTimer()
            }
            selectedTrap == null -> {
                selectedTrap = selectedTraps.elementAt(selectedTypeIndex)
            }
            else -> {
                selectedTrap?.let {
                    selectedTrap =
                        if (it.ordinal == selectedTraps.elementAt(selectedTypeIndex).ordinal) {
                            null
                        } else
                            selectedTraps.elementAt(selectedTypeIndex)
                }
            }
        }
    }

    private fun idGenerate(type: EFeatureFactory): Long {
        return type.ordinal * 100 + idGen++
    }


    fun positionToHero(to: Vector<Int>) {
        hero.data.goal = to
        /* slimes.forEachIndexed { _, it ->
            it.data.goal = to
            when (index % 4) {
                 0 -> it.data.goal = Vector(to.x, to.y + (index / 4) + 1)
                 1 -> it.data.goal = Vector(to.x - (index / 4) - 1, to.y)
                 2 -> it.data.goal = Vector(to.x, to.y - (index / 4) - 1)
                 else -> it.data.goal = Vector(to.x + (index / 4) + 1, to.y)
             }
        }*/

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
        val indexOfTrapType = selectedTraps.indexOf(selectedTrap)
        if (data.trapLimits[indexOfTrapType] == 0)
            return false
        //Van e ott valami
        featureMatrix[position]?.let {
            activateAnimation(it)
            return false
        }

        //in field types 0-path 1-wall 2-pit 3-water can not be build
        when (fieldMatrix[position].data.type) {
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
            val direction =
                if (test.hitBoxSize != Vector(1, 1))
                    test.rotation.vector
                else Vector(0, 0)
            test.functionality!!.remove()
            return position.x + direction.x in 0..13 &&
                    position.y + direction.y in 0..7 &&
                    featureMatrix[position + direction] == null &&
                    fieldMatrix[position + direction].data.type == 0
        }
        return true
    }

    private fun activateAnimation(feature: AFeature<*>) {
        feature.triggered()
    }

    fun removeTrapFromData(position: Vector<Int>) {
        if (featureMatrix[position] == null || selectedTrap != null)
            return
        val trap = featureMatrix[position]
        EDirection.values().forEach {
            if (
                position.x + it.vector.x in 0..13 &&
                position.y + it.vector.y in 0..7 &&
                featureMatrix[position + it.vector] == trap
            )
                featureMatrix[position + it.vector] = null
        }
        featureMatrix[position] = null

        trap?.let { trap ->
            trap.remove()
            data.trapLimits[EFeatureFactory.values().indexOfFirst { it.isProducedType(trap) }]++
        }
        interactor?.gameNotifyUIAboutTrapLimitChange()
    }

    private fun addTrapToData(position: Vector<Int>) {
        val indexOfTrapType = selectedTraps.indexOf(selectedTrap)
        data.trapLimits[indexOfTrapType]--
        interactor?.gameNotifyUIAboutTrapLimitChange()
        val temp =
            selectedTrap!!.createFeature(position, idGenerate(selectedTrap!!), selectedRotation)

        for (initialiseX in 0 until temp.data.hitBoxSize.x)
            for (initialiseY in 0 until temp.data.hitBoxSize.y) {
                val initialization = when (temp.data.rotation) {
                    EDirection.LEFT -> Vector(-initialiseX, -initialiseY)
                    EDirection.UP -> Vector(-initialiseY, initialiseX)
                    EDirection.RIGHT -> Vector(initialiseX, initialiseY)
                    EDirection.DOWN -> Vector(initialiseY, -initialiseX)
                }
                featureMatrix[position + initialization] = temp
                data.featureLayer[(position.y + initialization.y) * data.columnNumber + (position.x + initialization.x)] =
                    featureMatrix[position + initialization]?.data
            }
    }

    fun getTrapCount(index: Int): Int = data.trapLimits[index]
}