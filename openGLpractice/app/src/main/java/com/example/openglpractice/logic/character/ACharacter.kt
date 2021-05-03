package com.example.openglpractice.logic.character

import com.example.openglpractice.logic.IAnimatable
import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.logic.OLevelManager
import com.example.openglpractice.logic.OTimer
import com.example.openglpractice.model.character.CharacterData
import com.example.openglpractice.model.character.EActionType
import com.example.openglpractice.model.character.EActionType.*
import com.example.openglpractice.model.IAnimateEnum
import com.example.openglpractice.utility.*
import kotlin.math.abs

abstract class ACharacter<T : IAnimateEnum> : IInteractable, IAnimatable {
    abstract override val data: CharacterData<T>
    var attackRequested = false

    init {
        OTimer.subscribe(::onThick)
    }

    override fun onThick() {
        doAction()
        nextAnimationState()
    }

    protected abstract fun changeAnimateState(type: EActionType)

    override fun nextAnimationState() {
        data.animationProgress = (data.animationProgress + 1) % 16
        when (data.animationState.action) {
            REST -> {
                if (attackRequested) {
                    data.animationProgress = 0
                    changeAnimateState(ATTACK)
                    attackRequested = false
                } else data.goal?.let { goal ->
                    data.path = calcPathBetween(data.hitBoxPosition, goal)
                    data.path?.let { path ->
                        data.rotation = EDirection.values().first { it.vector == path[1] - path[0] }
                    }
                    data.path?.let {
                        data.animationProgress = 0
                        changeAnimateState(WALK)
                    }
                }
            }
            WALK -> {
                if (attackRequested && data.animationProgress == 0) {
                    changeAnimateState(ATTACK)
                    attackRequested = false
                    data.path = null
                    data.goal = null
                } else if (data.path == null) {
                    changeAnimateState(REST)
                }
            }
            ATTACK -> {
                if (data.animationProgress == 0) {
                    changeAnimateState(REST)
                    OLevelManager.characterTargetMatrix[data.hitBoxPosition + data.rotation.vector] =
                        null
                }
            }
        }
    }

    private fun doAction() =
        when (data.animationState.action) {
            REST -> {
            }
            WALK -> onWalk()
            ATTACK -> onAttack()
        }

    private fun onWalk() {
        // ha egy animációs ciklus véget ért
        if (data.animationProgress == 15) {
            //és támadás lett kérve, akkor támadjon
            //ha van út, akkor kövesse
            data.path?.toMutableList()?.also { localPath ->
                //tároljuk el az aktuális pozíciót és léptessük a karaktert
                val before = localPath.removeAt(0)
                data.hitBoxPosition = localPath[0]
                data.path = localPath.toTypedArray()

                //a léptetést vegyük fel a logikai táblákba
                OLevelManager.characterPositionMatrix[data.hitBoxPosition] = this
                OLevelManager.characterPositionMatrix[before] = null
                if (data.hitBoxPosition == data.goal) {
                    data.goal = null
                    data.path = null
                }
            }

        } else if (data.animationProgress == 0) {
            data.path?.let { localPath ->
                //ha az út már nem a célhelyszínre vezet
                //vagy a következő pozíciót valaki már célbavette
                //vagy (a pozícióban más tartózkodik
                //, aki nem készül azt elhagyni
                //vagy éppen az aktuális karakter pozícióját vette célba)
                //akkor új utat számítunk.
                if (data.goal != localPath.last() ||
                    OLevelManager.characterTargetMatrix[localPath[1]] != null ||
                    (OLevelManager.characterPositionMatrix[localPath[1]] != null && (
                            OLevelManager.characterPositionMatrix[localPath[1]]!!.data.animationState.action != WALK ||
                                    OLevelManager.characterTargetMatrix[data.hitBoxPosition] ==
                                    OLevelManager.characterPositionMatrix[localPath[1]]
                            ))

                ) {
                    data.path = calcPathBetween(data.hitBoxPosition, data.goal!!)
                    data.path?.let { path ->
                        data.rotation = EDirection.values().first { it.vector == path[1] - path[0] }
                    }
                }
            }
            data.path?.let { localPath ->
                data.rotation = EDirection.values()
                    .first { it.vector == localPath[1] - data.hitBoxPosition }
                OLevelManager.characterTargetMatrix[data.hitBoxPosition] = null
                OLevelManager.characterTargetMatrix[localPath[1]] = this
            }
        }
    }

    protected open fun onAttack() {
        if (data.animationProgress == 0) {
            val direction = data.rotation.vector
            OLevelManager.characterTargetMatrix[data.hitBoxPosition + direction] = this
            OLevelManager.characterPositionMatrix[data.hitBoxPosition + direction]?.hit(this)
        }
    }

    protected open fun calcPathBetween(
        from: Vector<Int>,
        to: Vector<Int>,
    ): Array<Vector<Int>>? {
        val knownPositions: MutableList<Vector<Int>> = mutableListOf(from)
        val reversedPath: MutableList<Vector<Int>> = mutableListOf()
        var actualPosition: Vector<Int> = from
        val directionMatrix = Array(8) { Array<EDirection?>(14) { null } }

        var actualPositionIndex = 0
        mainCycle@ while (actualPositionIndex < knownPositions.size) {

            //bejárás aktuális pozíciója
            actualPosition = knownPositions[actualPositionIndex]
            //ha az aktuális pozíció a keresett pozíció, akkor leállunk
            if (actualPosition == to) break
            //végig iterálunk a négy fő irányban lévő szomszédokon
            for (direction in EDirection.values()) {
                //szomszédos pozíció
                val neighbourPosition = actualPosition + direction.vector
                //ha nem jártunk még az adott pozíción
                //és az adott pozíció a pályán belülre esik
                //akkor megvizsgáluk
                if (!knownPositions.contains(neighbourPosition)
                    && neighbourPosition.y in directionMatrix.indices
                    && neighbourPosition.x in directionMatrix[0].indices
                ) {
                    //( ha az adott pozícióban nincs karakter
                    //vagy ( az adott pozíciót elhagyni készül
                    //és nem az aktuális pozícióba tart ) )
                    //és más nem vette még célba az aktuális pozíciót
                    //és az aktuális pozíció út
                    //akkor járható és felvesszük következő pozíciónak az útkeresésbe
                    if ((
                                OLevelManager.characterPositionMatrix[neighbourPosition] == null || (
                                        OLevelManager.characterPositionMatrix[neighbourPosition]!!.data.animationState.action == WALK &&
                                                OLevelManager.characterTargetMatrix[actualPosition] ==
                                                OLevelManager.characterPositionMatrix[neighbourPosition]
                                        )
                                ) && OLevelManager.characterTargetMatrix[neighbourPosition] == null
                        && OLevelManager.fieldMatrix[neighbourPosition].data.type == 0
                    ) {
                        //felvesszük a szomszédos pozícióba a vissza vezető irányt
                        directionMatrix[neighbourPosition] = direction.invers
                        //hozzáadjuk a szomszédot az ismert pozíciókhoz
                        knownPositions.add(neighbourPosition)
                        //ha a szomszéd maga a keresett pozíció, akkor végeztük
                        if (actualPosition == to) {
                            //aktuális pozíciónak beállítjuk a pozíciót
                            actualPosition = neighbourPosition
                            break@mainCycle
                        }
                    }
                }
            }
            //tovább lépünk a következő ismert pozícióra
            actualPositionIndex++
        }

        //ha megtaláltuk a cél pozíciót
        if (actualPosition == to) {
            //akkor vissza keressük az utat a cél pozícióból a kiindulási pozícióba
            reversedPath.add(actualPosition)
            while (actualPosition != from) {
                actualPosition += directionMatrix[actualPosition]!!.vector
                reversedPath.add(actualPosition)
            }
            return if (reversedPath.size > 1) {
                reversedPath.reversed().toTypedArray()
            } else
                null
        } else {
            val knownPositionsBackwards: MutableList<Vector<Int>> = mutableListOf(to)
            var actualPositionBackwards: Vector<Int> = to
            val directionMatrixBackwards = Array(8) { Array<EDirection?>(14) { null } }

            actualPositionIndex = 0
            mainCycle@ while (actualPositionIndex < knownPositionsBackwards.size) {
                //bejárás aktuális pozíciója
                actualPositionBackwards = knownPositionsBackwards[actualPositionIndex]
                //ha az aktuális pozíció a keresett pozíció, akkor leállunk
                if (actualPositionBackwards in knownPositions) break
                //végig iterálunk a négy fő irányban lévő szomszédokon
                for (direction in EDirection.values()) {
                    //szomszédos pozíció
                    val neighbourPosition = actualPositionBackwards + direction.vector
                    //ha nem jártunk még az adott pozíción
                    //és az adott pozíció a pályán belülre esik
                    //akkor megvizsgáluk
                    if (!knownPositionsBackwards.contains(neighbourPosition)
                        && neighbourPosition.y in directionMatrixBackwards.indices
                        && neighbourPosition.x in directionMatrixBackwards[0].indices
                    ) {
                        //ha az aktuális pozíció út
                        //akkor járható és felvesszük következő pozíciónak az útkeresésbe
                        if (OLevelManager.fieldMatrix[neighbourPosition].data.type == 0) {
                            //felvesszük a szomszédos pozícióba a vissza vezető irányt
                            directionMatrixBackwards[neighbourPosition] = direction.invers
                            //hozzáadjuk a szomszédot az ismert pozíciókhoz
                            knownPositionsBackwards.add(neighbourPosition)
                            //ha a szomszéd maga a keresett pozíció, akkor végeztük
                            if (actualPositionBackwards in knownPositions) {
                                //aktuális pozíciónak beállítjuk a pozíciót
                                actualPositionBackwards = neighbourPosition
                                break@mainCycle
                            }
                        }
                    }
                }
                //tovább lépünk a következő ismert pozícióra
                actualPositionIndex++
            }
            return if (actualPositionBackwards in knownPositions &&
                from.minus(to)
                    .let { abs(it.x) + abs(it.y) } >
                actualPositionBackwards.minus(to)
                    .let { abs(it.x) + abs(it.y) }
            ) {
                //akkor vissza keressük az utat a cél pozícióból a kiindulási pozícióba
                reversedPath.add(actualPositionBackwards)
                while (actualPositionBackwards != from) {
                    actualPositionBackwards += directionMatrix[actualPositionBackwards]!!.vector
                    reversedPath.add(actualPositionBackwards)
                }
                return if (reversedPath.size > 1) {
                    reversedPath.reversed().toTypedArray()
                } else
                    null
            } else null
        }
    }

    fun requestAttack() {
        attackRequested = true
    }

    protected fun death() {
        OTimer.unSubscribe(::onThick)
        if (OLevelManager.characterPositionMatrix[data.hitBoxPosition] == this)
            OLevelManager.characterPositionMatrix[data.hitBoxPosition] = null
        if (OLevelManager.characterTargetMatrix[data.hitBoxPosition] == this)
            OLevelManager.characterTargetMatrix[data.hitBoxPosition] = null
        for (direction in EDirection.values().map { it.vector }) {
            val position = data.hitBoxPosition + direction
            if (position.y !in OLevelManager.characterPositionMatrix.indices
                || position.x !in OLevelManager.characterPositionMatrix[0].indices
            )
                continue
            if (OLevelManager.characterTargetMatrix[data.hitBoxPosition + direction] == this)
                OLevelManager.characterTargetMatrix[data.hitBoxPosition + direction] = null
            if (OLevelManager.characterPositionMatrix[data.hitBoxPosition + direction] == this)
                OLevelManager.characterPositionMatrix[data.hitBoxPosition + direction] = null
        }
    }

}