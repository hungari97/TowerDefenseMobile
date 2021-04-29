package com.example.openglpractice.logic.character

import com.example.openglpractice.logic.IAnimatable
import com.example.openglpractice.logic.interaction.IInteractable
import com.example.openglpractice.logic.OLevelManager
import com.example.openglpractice.model.character.CharacterData
import com.example.openglpractice.model.character.EActionType
import com.example.openglpractice.model.character.EActionType.*
import com.example.openglpractice.model.IAnimateEnum
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.utility.Vector

abstract class ACharacter<T : IAnimateEnum> : IInteractable, IAnimatable {
    abstract override val data: CharacterData<T>
    protected var attackNext = false

    open fun calcMove(from: Vector<Int>, to: Vector<Int>) {
        val checkedList: MutableList<Vector<Int>> = mutableListOf()
        val pathTemp: MutableList<Vector<Int>> = mutableListOf()
        var temp: Vector<Int> = from
        val tempMatrix =
            Array(8) { Array(14) { 0 } } //1 left, 2, up, 3 right, 4 down

        tempMatrix[temp.y][temp.x] = 0
        checkedList.add(from)

        var actualVector = 0
        while (actualVector < checkedList.size) {
            temp = checkedList[actualVector]

            if (temp.x == to.x && temp.y == to.y) break

            if (!checkedList.contains(Vector(temp.x, temp.y - 1)) && temp.y - 1 >= 0)
                if (OLevelManager.lowCharacterMatrix[temp.y - 1][temp.x] == null || (
                            OLevelManager.lowCharacterMatrix[temp.y - 1][temp.x]!!.data.animationState.action == WALK &&
                                    OLevelManager.topCharacterMatrix[temp.y][temp.x] ==
                                    OLevelManager.lowCharacterMatrix[temp.y - 1][temp.x]
                            )
                )
                    if (OLevelManager.topCharacterMatrix[temp.y - 1][temp.x] == null)
                        if (OLevelManager.fieldMatrix[temp.y - 1][temp.x].data.type == 0) {
                            tempMatrix[temp.y - 1][temp.x] = 3
                            checkedList.add(Vector(temp.x, temp.y - 1))
                            if (temp.x == to.x && temp.y - 1 == to.y) {
                                temp = Vector(temp.x, temp.y - 1)
                                break
                            }
                        }
            if (!checkedList.contains(Vector(temp.x + 1, temp.y)) && temp.x + 1 <= 13)
                if (OLevelManager.lowCharacterMatrix[temp.y][temp.x + 1] == null || (
                            OLevelManager.lowCharacterMatrix[temp.y][temp.x + 1]!!.data.animationState.action == WALK &&
                                    OLevelManager.topCharacterMatrix[temp.y][temp.x] ==
                                    OLevelManager.lowCharacterMatrix[temp.y][temp.x + 1]
                            )
                )
                    if (OLevelManager.topCharacterMatrix[temp.y][temp.x + 1] == null
                    )
                        if (OLevelManager.fieldMatrix[temp.y][temp.x + 1].data.type == 0) {
                            tempMatrix[temp.y][temp.x + 1] = 4
                            checkedList.add(Vector(temp.x + 1, temp.y))
                            if (temp.x + 1 == to.x && temp.y == to.y) {
                                temp = Vector(temp.x + 1, temp.y)
                                break
                            }
                        }
            if (!checkedList.contains(Vector(temp.x, temp.y + 1)) && temp.y + 1 <= 7)
                if (OLevelManager.lowCharacterMatrix[temp.y + 1][temp.x] == null || (
                            OLevelManager.lowCharacterMatrix[temp.y + 1][temp.x]!!.data.animationState.action == WALK &&
                                    OLevelManager.topCharacterMatrix[temp.y][temp.x] ==
                                    OLevelManager.lowCharacterMatrix[temp.y + 1][temp.x]
                            )
                )
                    if (OLevelManager.topCharacterMatrix[temp.y + 1][temp.x] == null
                    )
                        if (OLevelManager.fieldMatrix[temp.y + 1][temp.x].data.type == 0) {
                            tempMatrix[temp.y + 1][temp.x] = 1
                            checkedList.add(Vector(temp.x, temp.y + 1))
                            if (temp.x == to.x && temp.y + 1 == to.y) {
                                temp = Vector(temp.x, temp.y + 1)
                                break
                            }
                        }
            if (!checkedList.contains(Vector(temp.x - 1, temp.y)) && temp.x - 1 >= 0)
                if (OLevelManager.lowCharacterMatrix[temp.y][temp.x - 1] == null || (
                            OLevelManager.lowCharacterMatrix[temp.y][temp.x - 1]!!.data.animationState.action == WALK &&
                                    OLevelManager.topCharacterMatrix[temp.y][temp.x] ==
                                    OLevelManager.lowCharacterMatrix[temp.y][temp.x - 1]
                            )
                ) if (OLevelManager.topCharacterMatrix[temp.y][temp.x - 1] == null
                )
                    if (OLevelManager.fieldMatrix[temp.y][temp.x - 1].data.type == 0) {
                        tempMatrix[temp.y][temp.x - 1] = 2
                        checkedList.add(Vector(temp.x - 1, temp.y))
                        if (temp.x - 1 == to.x && temp.y == to.y) {
                            temp = Vector(temp.x - 1, temp.y)
                            break
                        }
                    }

            actualVector++
        }

        if (temp.x == to.x && temp.y == to.y) {
            pathTemp.add(temp)
            while (temp.x != from.x || temp.y != from.y) {
                when (tempMatrix[temp.y][temp.x]) {
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
                    data.path!![0].x - data.path!![1].x == -1 -> data.rotation = EDirection.RIGHT
                    data.path!![0].x - data.path!![1].x == 1 -> data.rotation = EDirection.LEFT
                    data.path!![0].y - data.path!![1].y == -1 -> data.rotation = EDirection.UP
                    data.path!![0].y - data.path!![1].y == 1 -> data.rotation = EDirection.DOWN
                }
            }
        } else {
            data.path = null
            changeAnimateState(REST)

        }
        data.path?.let {
            if (data.animationState.action == REST) {
                data.currentAnimationProgress = 0
                changeAnimateState(WALK)

                OLevelManager.topCharacterMatrix[data.path!![1].y][data.path!![1].x] =
                    this
            }
        }
    }

    open fun moveToThick() {
        if (data.currentAnimationProgress == 0) {
            if (attackNext) {
                attack()
            } else {
                data.path?.also { pathNotNull ->
                    var path = pathNotNull.toMutableList()
                    if (data.animationState.action == REST) {
                        changeAnimateState(WALK)

                    }
                    val before = data.hitBoxPosition
                    data.hitBoxPosition = path[1]
                    path.removeAt(0)
                    data.path = pathNotNull.drop(1).toTypedArray()

                    OLevelManager.lowCharacterMatrix[data.hitBoxPosition.y][data.hitBoxPosition.x] =
                        this
                    OLevelManager.topCharacterMatrix[data.hitBoxPosition.y][data.hitBoxPosition.x] =
                        null
                    OLevelManager.lowCharacterMatrix[before.y][before.x] = null

                    if (data.goal!!.x != path.last().x || data.goal!!.y != path.last().y) {
                        calcMove(data.hitBoxPosition, data.goal!!)
                        path = data.path?.toMutableList() ?: mutableListOf(data.hitBoxPosition)
                    }

                    if (path.size == 1) {
                        changeAnimateState(REST)

                        data.path = null
                        data.goal = null

                    } else {
                        if (OLevelManager.topCharacterMatrix[path[1].y][path[1].x] != null ||
                            (OLevelManager.lowCharacterMatrix[path[1].y][path[1].x] != null && (
                                    OLevelManager.lowCharacterMatrix[path[1].y][path[1].x]!!.data.animationState.action != WALK ||
                                            OLevelManager.topCharacterMatrix[data.hitBoxPosition.y][data.hitBoxPosition.x] ==
                                            OLevelManager.lowCharacterMatrix[path[1].y][path[1].x]
                                    ))
                        ) {
                            calcMove(data.hitBoxPosition, data.goal!!)
                        }
                        data.path?.let { pathInner ->
                            when {
                                data.hitBoxPosition.x - pathInner[1].x == -1 -> data.rotation =
                                    EDirection.RIGHT
                                data.hitBoxPosition.x - pathInner[1].x == 1 -> data.rotation =
                                    EDirection.LEFT
                                data.hitBoxPosition.y - pathInner[1].y == -1 -> data.rotation =
                                    EDirection.UP
                                data.hitBoxPosition.y - pathInner[1].y == 1 -> data.rotation =
                                    EDirection.DOWN
                            }
                            OLevelManager.topCharacterMatrix[pathInner[1].y][pathInner[1].x] =
                                this
                        }
                    }
                }
            }
        }
        data.path ?: data.goal?.let { it -> calcMove(data.hitBoxPosition, it) }
    }

    open fun attack() {
        if (data.currentAnimationProgress == 0 && attackNext) {
            if (data.animationState.action == WALK) {
                val before = data.hitBoxPosition
                data.hitBoxPosition = data.path!![1]
                OLevelManager.lowCharacterMatrix[data.hitBoxPosition.y][data.hitBoxPosition.x] =
                    this
                OLevelManager.topCharacterMatrix[data.hitBoxPosition.y][data.hitBoxPosition.x] =
                    null
                OLevelManager.lowCharacterMatrix[before.y][before.x] = null
                data.path = null
                data.goal = null
            }
            changeAnimateState(ATTACK)


            attackNext = false

            val direction = data.rotation.vector
            OLevelManager.topCharacterMatrix[data.hitBoxPosition.y + direction.y][data.hitBoxPosition.x + direction.x] =
                this
            OLevelManager.lowCharacterMatrix[data.hitBoxPosition.y + direction.y][data.hitBoxPosition.x + direction.x]?.hit(
                this)
        } else {
            attackNext = true
        }
    }

    abstract fun changeAnimateState(type: EActionType)

    override fun nextAnimationState() {
        if ((data.currentAnimationProgress + 1) % 16 == 0 && data.animationState.action == ATTACK) {
            changeAnimateState(REST)
            val direction = data.rotation.vector
            OLevelManager.topCharacterMatrix[data.hitBoxPosition.y + direction.y][data.hitBoxPosition.x + direction.x] =
                null
        }
        data.currentAnimationProgress = (data.currentAnimationProgress + 1) % 16
    }

    override fun onThick() {
        nextAnimationState()
        moveToThick()
    }
}