package com.example.openglpractice.logic

import com.example.openglpractice.model.HeroData
import com.example.openglpractice.model.Vector

class Hero() : Character<HeroData.HeroAnimateState>() {
    override lateinit var data: HeroData

    constructor(id: Long) : this() {
        data = HeroData(
            id = id,
            health = 5,
            damage = 2,
            hitBoxPosition = Vector(0.5, 0.5),
            hitBoxSize = Vector(1.0, 1.0),
            animationState = HeroData.HeroAnimateState.valueOf("HEROREST"),
            currentAnimationProgress = 0,
            goal = null,
            path = null,
            functionality = this,
            rotation = 2,
            trapTypes = setOf(FeatureFactory.SPIKETRAP, FeatureFactory.FIRETRAP)
        )
    }

    init {
        Timer.subbscribers.plusAssign(::onThick)
    }

    override fun hit(thing: Interactable) {
        TODO("Not yet implemented")
    }

    override fun death() {
        Timer.subbscribers.remove (::onThick )
    }

    override fun calcMove(from: Vector, to: Vector) {
        super.calcMove(from, to)
        data.path?.let {
            if (data.animationState.name.equals("HEROREST"))
                data.currentAnimationProgress = 0
            changeAnimateState("HEROWALK")
            data.hitBoxSize = Vector(2.0, 1.0)
            LevelManager.topCharacterMatrix[data.path!![1].y.toInt()][data.path!![1].x.toInt()] = this

        }
    }

    override fun moveToThick() {
        val before = data.hitBoxPosition
        super.moveToThick()
        if (data.path.isNullOrEmpty()) {
            //ha végzett a menetellel menjen vissza várakozásba
            if (data.animationState.name.equals("HEROWALK")) {
                data.goal = null
                LevelManager.lowCharacterMatrix[before.y.toInt()][before.x.toInt()] = null
                LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
                    this
                data.hitBoxSize = Vector(1.0, 1.0)
                changeAnimateState("HEROREST")
            }
            //ha nincs útja és van célja akk számítson egyet
            data.goal?.let { calcMove(data.hitBoxPosition, it) }
        }
        data.path?.let { path ->
            if (data.currentAnimationProgress == 0) {
                if (data.goal!!.x.toInt() != path.last().x.toInt() || data.goal!!.y.toInt() != path.last().y.toInt()){

                    calcMove(data.hitBoxPosition, data.goal!!)
                    LevelManager.lowCharacterMatrix[before.y.toInt()][before.x.toInt()] = null
                    LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =null
                    LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
                        this
                    LevelManager.topCharacterMatrix[data.path!![1].y.toInt()][data.path!![1].x.toInt()] =
                        this
                }else {
                    if (data.hitBoxPosition.x.toInt() - path[1].x.toInt() == -1)
                        data.rotation = 2
                    else
                        if (data.hitBoxPosition.x.toInt() - path[1].x.toInt() == 1)
                            data.rotation = 0
                        else
                            if (data.hitBoxPosition.y.toInt() - path[1].y.toInt() == -1)
                                data.rotation = 1
                            else
                                if (data.hitBoxPosition.y.toInt() - path[1].y.toInt() == 1)
                                    data.rotation = 3

                    LevelManager.lowCharacterMatrix[before.y.toInt()][before.x.toInt()] = null
                    LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
                        this
                    LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
                        null
                    LevelManager.topCharacterMatrix[path[1].y.toInt()][path.get(1).x.toInt()] =
                        this
                }

            }
        }

    }

    override fun onThick() {
        nextAnimationState()
        moveToThick()
    }

    override fun nextAnimationState() {
        super.nextAnimationState()

    }

    override fun changeAnimateState(type: String) {
        super.changeAnimateState(type)
        when (type) {
            "HEROREST" -> {
                data.animationState = HeroData.HeroAnimateState.HEROREST
            }
            "HEROWALK" -> {
                data.animationState = HeroData.HeroAnimateState.HEROWALK
            }
            "HEROATTACK" -> {
                data.animationState = HeroData.HeroAnimateState.HEROATTACK
            }
        }

    }

}