package com.example.openglpractice.logic

import com.example.openglpractice.model.CharacterData
import com.example.openglpractice.model.EActionType
import com.example.openglpractice.model.IAnimateEnum
import com.example.openglpractice.model.Vector

abstract class Character<T : IAnimateEnum> : Interactable, Animatable {
    abstract override val data: CharacterData<T>
    protected var attackNext = false

    open fun calcMove(from: Vector, to: Vector) {
        val checkedList: MutableList<Vector> = mutableListOf()
        val pathTemp: MutableList<Vector> = mutableListOf()
        var temp: Vector = from
        val tempMatrix =
            Array(8) { Array(14) { 0 } } //1 left, 2, up, 3 right, 4 down

        tempMatrix[temp.y.toInt()][temp.x.toInt()] = 0
        checkedList.add(from)

        var actualVector = 0
        while (actualVector < checkedList.size) {
            temp = checkedList[actualVector]

            if (temp.x.toInt() == to.x.toInt() && temp.y.toInt() == to.y.toInt()) break

            if (!checkedList.contains(Vector(temp.x, temp.y - 1)) && temp.y - 1 >= 0)
                if (LevelManager.lowCharacterMatrix[temp.y.toInt() - 1][temp.x.toInt()] == null || (
                            LevelManager.lowCharacterMatrix[temp.y.toInt() - 1][temp.x.toInt()]!!.data.animationState.action == EActionType.WALK &&
                                    LevelManager.topCharacterMatrix[temp.y.toInt() ][temp.x.toInt()] ==
                                    LevelManager.lowCharacterMatrix[temp.y.toInt() - 1][temp.x.toInt()]
                            )
                )
                    if (LevelManager.topCharacterMatrix[temp.y.toInt() - 1][temp.x.toInt()] == null)
                        if (LevelManager.fieldMatrix[temp.y.toInt() - 1][temp.x.toInt()].data.type == 0) {
                            tempMatrix[temp.y.toInt() - 1][temp.x.toInt()] = 3
                            checkedList.add(Vector(temp.x, temp.y - 1))
                            if (temp.x == to.x && temp.y - 1 == to.y) {
                                temp = Vector(temp.x, temp.y - 1)
                                break
                            }
                        }
            if (!checkedList.contains(Vector(temp.x + 1, temp.y)) && temp.x + 1 <= 13)
                if (LevelManager.lowCharacterMatrix[temp.y.toInt()][temp.x.toInt() + 1] == null || (
                            LevelManager.lowCharacterMatrix[temp.y.toInt()][temp.x.toInt() + 1]!!.data.animationState.action == EActionType.WALK &&
                                    LevelManager.topCharacterMatrix[temp.y.toInt()][temp.x.toInt()] ==
                                    LevelManager.lowCharacterMatrix[temp.y.toInt()][temp.x.toInt() + 1]
                            )
                )
                    if (LevelManager.topCharacterMatrix[temp.y.toInt()][temp.x.toInt() + 1] == null
                    )
                        if (LevelManager.fieldMatrix[temp.y.toInt()][temp.x.toInt() + 1].data.type == 0) {
                            tempMatrix[temp.y.toInt()][temp.x.toInt() + 1] = 4
                            checkedList.add(Vector(temp.x + 1, temp.y))
                            if (temp.x + 1 == to.x && temp.y == to.y) {
                                temp = Vector(temp.x + 1, temp.y)
                                break
                            }
                        }
            if (!checkedList.contains(Vector(temp.x, temp.y + 1)) && temp.y + 1 <= 7)
                if (LevelManager.lowCharacterMatrix[temp.y.toInt() + 1][temp.x.toInt()] == null || (
                            LevelManager.lowCharacterMatrix[temp.y.toInt() + 1][temp.x.toInt()]!!.data.animationState.action == EActionType.WALK &&
                                    LevelManager.topCharacterMatrix[temp.y.toInt()][temp.x.toInt()] ==
                                    LevelManager.lowCharacterMatrix[temp.y.toInt() + 1][temp.x.toInt()]
                            )
                )
                    if (LevelManager.topCharacterMatrix[temp.y.toInt() + 1][temp.x.toInt()] == null
                    )
                        if (LevelManager.fieldMatrix[temp.y.toInt() + 1][temp.x.toInt()].data.type == 0) {
                            tempMatrix[temp.y.toInt() + 1][temp.x.toInt()] = 1
                            checkedList.add(Vector(temp.x, temp.y + 1))
                            if (temp.x == to.x && temp.y + 1 == to.y) {
                                temp = Vector(temp.x, temp.y + 1)
                                break
                            }
                        }
            if (!checkedList.contains(Vector(temp.x - 1, temp.y)) && temp.x - 1 >= 0)
                if (LevelManager.lowCharacterMatrix[temp.y.toInt()][temp.x.toInt() - 1] == null || (
                            LevelManager.lowCharacterMatrix[temp.y.toInt()][temp.x.toInt() - 1]!!.data.animationState.action == EActionType.WALK &&
                                    LevelManager.topCharacterMatrix[temp.y.toInt()][temp.x.toInt()] ==
                                    LevelManager.lowCharacterMatrix[temp.y.toInt()][temp.x.toInt() - 1]
                            )
                ) if (LevelManager.topCharacterMatrix[temp.y.toInt()][temp.x.toInt() - 1] == null
                )
                    if (LevelManager.fieldMatrix[temp.y.toInt()][temp.x.toInt() - 1].data.type == 0) {
                        tempMatrix[temp.y.toInt()][temp.x.toInt() - 1] = 2
                        checkedList.add(Vector(temp.x - 1, temp.y))
                        if (temp.x - 1 == to.x && temp.y == to.y) {
                            temp = Vector(temp.x - 1, temp.y)
                            break
                        }
                    }

            actualVector++
        }

        if (temp.x.toInt() == to.x.toInt() && temp.y.toInt() == to.y.toInt()) {
            pathTemp.add(temp)
            while (temp.x != from.x || temp.y != from.y) {
                when (tempMatrix[temp.y.toInt()][temp.x.toInt()]) {
                    0 -> return
                    1 -> {
                        pathTemp.add(Vector(temp.x, temp.y - 1))
                        temp = Vector(temp.x, temp.y - 1)
                    }
                    2 -> {
                        pathTemp.add(Vector(temp.x + 1, temp.y))
                        temp = Vector(temp.x + 1, temp.y)
                    }
                    3 -> {
                        pathTemp.add(Vector(temp.x, temp.y + 1))
                        temp = Vector(temp.x, temp.y + 1)
                    }
                    4 -> {
                        pathTemp.add(Vector(temp.x - 1, temp.y))
                        temp = Vector(temp.x - 1, temp.y)
                    }
                }
            }
            if (pathTemp.size > 1) {
                data.path = pathTemp.reversed().toTypedArray()
                when {
                    data.path!![0].x.toInt() - data.path!![1].x.toInt() == -1 -> data.rotation = 2
                    data.path!![0].x.toInt() - data.path!![1].x.toInt() == 1 -> data.rotation = 0
                    data.path!![0].y.toInt() - data.path!![1].y.toInt() == -1 -> data.rotation = 1
                    data.path!![0].y.toInt() - data.path!![1].y.toInt() == 1 -> data.rotation = 3
                }
            }
        } else {
            data.path = null
            data.hitBoxSize = Vector(1.0, 1.0)
            changeAnimateState("REST")
        }
    }

    open fun moveToThick() {
        if (data.currentAnimationProgress == 0) {
            if (attackNext) {
                attack()
            }
            data.path?.also { pathNotNull ->
                var path = pathNotNull.toMutableList()
                val before = data.hitBoxPosition
                data.hitBoxPosition = path[1]
                path.removeAt(0)
                data.path = pathNotNull.drop(1).toTypedArray()

                LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
                    this
                LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] =
                    null
                LevelManager.lowCharacterMatrix[before.y.toInt()][before.x.toInt()] = null

                if (data.goal!!.x.toInt() != path.last().x.toInt() || data.goal!!.y.toInt() != path.last().y.toInt()) {
                    calcMove(data.hitBoxPosition, data.goal!!)
                    path = data.path?.toMutableList() ?: mutableListOf(data.hitBoxPosition)
                }

                if (path.size == 1) {
                    data.hitBoxSize = Vector(1.0, 1.0)
                    changeAnimateState("REST")
                    data.path = null
                    data.goal = null

                } else {
                    if (LevelManager.topCharacterMatrix[path[1].y.toInt()][path[1].x.toInt()] != null ||
                        (LevelManager.lowCharacterMatrix[path[1].y.toInt()][path[1].x.toInt()] != null && (
                                LevelManager.lowCharacterMatrix[path[1].y.toInt()][path[1].x.toInt()]!!.data.animationState.action != EActionType.WALK ||
                                        LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt()][data.hitBoxPosition.x.toInt()] ==
                                        LevelManager.lowCharacterMatrix[path[1].y.toInt()][path[1].x.toInt()]
                                ))
                    ) {
                        calcMove(data.hitBoxPosition, data.goal!!)
                    }
                    data.path?.let { pathInner ->
                        when {
                            data.hitBoxPosition.x.toInt() - pathInner[1].x.toInt() == -1 -> data.rotation =
                                2
                            data.hitBoxPosition.x.toInt() - pathInner[1].x.toInt() == 1 -> data.rotation =
                                0
                            data.hitBoxPosition.y.toInt() - pathInner[1].y.toInt() == -1 -> data.rotation =
                                1
                            data.hitBoxPosition.y.toInt() - pathInner[1].y.toInt() == 1 -> data.rotation =
                                3
                        }
                        LevelManager.topCharacterMatrix[pathInner[1].y.toInt()][pathInner[1].x.toInt()] =
                            this
                    }
                }
            }
        }
        data.path ?: data.goal?.let { calcMove(data.hitBoxPosition, it) }
    }

    open fun attack() {
        if (data.currentAnimationProgress == 0 && attackNext) {
            changeAnimateState("ATTACK")
            data.hitBoxSize = (Vector(2.0, 1.0))
            attackNext = false
            val direction: Vector = when (data.rotation) {
                0.toByte() -> Vector(-1.0, 0.0)
                1.toByte() -> Vector(0.0, 1.0)
                2.toByte() -> Vector(1.0, 0.0)
                else -> Vector(0.0, -1.0)
            }
            LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt() + direction.y.toInt()][data.hitBoxPosition.x.toInt() + direction.x.toInt()] =
                this
            LevelManager.lowCharacterMatrix[data.hitBoxPosition.y.toInt() + direction.y.toInt()][data.hitBoxPosition.x.toInt() + direction.x.toInt()]?.let {
                it.hit(this)

            }
        } else {
            attackNext = true
        }
    }

    abstract fun changeAnimateState(type: String)

    override fun nextAnimationState() {
        if ((data.currentAnimationProgress + 1) % 16 == 0 && data.animationState.action == EActionType.ATTACK) {
            changeAnimateState("REST")
            data.hitBoxSize = Vector(1.0, 1.0)

            val direction: Vector = when (data.rotation) {
                0.toByte() -> Vector(-1.0, 0.0)
                1.toByte() -> Vector(0.0, 1.0)
                2.toByte() -> Vector(1.0, 0.0)
                else -> Vector(0.0, -1.0)
            }
            LevelManager.topCharacterMatrix[data.hitBoxPosition.y.toInt() + direction.y.toInt()][data.hitBoxPosition.x.toInt() + direction.x.toInt()] =
                null
        }
        data.currentAnimationProgress = (data.currentAnimationProgress + 1) % 16
    }

    override fun onThick() {
        nextAnimationState()
        moveToThick()
    }
}