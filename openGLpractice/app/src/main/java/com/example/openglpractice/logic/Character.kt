package com.example.openglpractice.logic

import com.example.openglpractice.model.CharacterData
import com.example.openglpractice.model.IFeatureEnum
import com.example.openglpractice.model.Vector

abstract class Character<T : IFeatureEnum> : Interactable, Animatable {
    abstract override val data: CharacterData<T>

    open fun calcMove(from: Vector, to: Vector) {
        val checkedList: MutableList<Vector> = mutableListOf()
        val pathtemp: MutableList<Vector> = mutableListOf()
        var temp: Vector = from
        val tempMatrix =
            Array(8) { external ->
                Array(14) { internal ->
                    0   //1 left, 2, up, 3 right, 4 down
                }
            }

        tempMatrix[temp.y.toInt()][temp.x.toInt()] = 0
        checkedList.add(from)

        var actualVector = 0
        while (actualVector < checkedList.size) {
            temp = checkedList[actualVector]

            if (temp.x.toInt() == to.x.toInt() && temp.y.toInt() == to.y.toInt()) break
            if (!checkedList.contains(Vector(temp.x, temp.y - 1)) && temp.y - 1 >= 0)
                if (LevelManager.fieldMatrix[temp.y.toInt() - 1][temp.x.toInt()].data.type == 0) {
                    tempMatrix[temp.y.toInt() - 1][temp.x.toInt()] = 3
                    checkedList.add(Vector(temp.x, temp.y - 1))
                    if (temp.x == to.x && temp.y - 1 == to.y) {
                        temp = Vector(temp.x, temp.y - 1)
                        break
                    }
                }
            if (!checkedList.contains(Vector(temp.x + 1, temp.y)) && temp.x + 1 <= 13)
                if (LevelManager.fieldMatrix[temp.y.toInt()][temp.x.toInt() + 1].data.type == 0) {
                    tempMatrix[temp.y.toInt()][temp.x.toInt() + 1] = 4
                    checkedList.add(Vector(temp.x + 1, temp.y))
                    if (temp.x + 1 == to.x && temp.y == to.y) {
                        temp = Vector(temp.x + 1, temp.y)
                        break
                    }
                }
            if (!checkedList.contains(Vector(temp.x, temp.y + 1)) && temp.y + 1 <= 7)
                if (LevelManager.fieldMatrix[temp.y.toInt() + 1][temp.x.toInt()].data.type == 0) {
                    tempMatrix[temp.y.toInt() + 1][temp.x.toInt()] = 1
                    checkedList.add(Vector(temp.x, temp.y + 1))
                    if (temp.x == to.x && temp.y + 1 == to.y) {
                        temp = Vector(temp.x, temp.y + 1)
                        break
                    }
                }
            if (!checkedList.contains(Vector(temp.x - 1, temp.y)) && temp.x - 1 >= 0)
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
            pathtemp.add(temp)
            while (temp.x != from.x || temp.y != from.y) {
                when (tempMatrix[temp.y.toInt()][temp.x.toInt()]) {
                    0 -> return
                    1 -> {
                        pathtemp.add(Vector(temp.x, temp.y - 1))
                        temp = Vector(temp.x, temp.y - 1)
                    }
                    2 -> {
                        pathtemp.add(Vector(temp.x + 1, temp.y))
                        temp = Vector(temp.x + 1, temp.y)
                    }
                    3 -> {
                        pathtemp.add(Vector(temp.x, temp.y + 1))
                        temp = Vector(temp.x, temp.y + 1)
                    }
                    4 -> {
                        pathtemp.add(Vector(temp.x - 1, temp.y))
                        temp = Vector(temp.x - 1, temp.y)
                    }
                }
            }

            data.path = pathtemp.reversed().toTypedArray()
            if (data.path!![0].x.toInt() - data.path!![1].x.toInt() == -1)
                data.rotation = 2
            else
                if (data.path!![0].x.toInt() - data.path!![1].x.toInt() == 1)
                    data.rotation = 0
                else
                    if (data.path!![0].y.toInt() - data.path!![1].y.toInt() == -1)
                        data.rotation = 1
                    else
                        if (data.path!![0].y.toInt() - data.path!![1].y.toInt() == 1)
                            data.rotation = 3
        }

    }

    open fun moveToThick() {
        data.path?.let {path->
            if (data.currentAnimationProgress == 0) {
                data.hitBoxPosition = path[1]
               // println("a mostani hely ${data.hitBoxPosition.x} x ${data.hitBoxPosition.y} y")
                data.path = path.drop(1).toTypedArray()

                if (data.path!!.size == 1)
                    data.path = null

            }
        }
    }

    open fun changeAnimateState(type: String) {

    }

    override fun nextAnimationState() {
        data.currentAnimationProgress = (data.currentAnimationProgress + 1) % 16

    }
}