package com.example.openglpractice

import kotlin.random.Random

enum class TileType(val textureIndexes: FloatArray) {        //32 ;64
    FLOOR(
        /*floatArrayOf(
            2 / 32.0f, 4 / 64.0f,
            2 / 32.0f, 5 / 64.0f,
            1 / 32.0f, 4 / 64.0f,
            2 / 32.0f, 5 / 64.0f,
            1 / 32.0f, 5 / 64.0f,
            1 / 32.0f, 4 / 64.0f
        )*/
        floatArrayOf(
            20 / 32.0f, 1 / 64.0f,
            20 / 32.0f, 3 / 64.0f,
            18 / 32.0f, 1 / 64.0f,
            20 / 32.0f, 3 / 64.0f,
            18 / 32.0f, 3 / 64.0f,
            18 / 32.0f, 1 / 64.0f
        )

    ),//2;5    19;2 ->20;3
    WALL(
        floatArrayOf(
            2 / 32.0f, 5 / 64.0f,
            2 / 32.0f, 6 / 64.0f,
            1 / 32.0f, 5 / 64.0f,
            2 / 32.0f, 6 / 64.0f,
            1 / 32.0f, 6 / 64.0f,
            1 / 32.0f, 5 / 64.0f
        )
    ),//2;6
    ENEMY(
        floatArrayOf(
            1 / 32.0f, 1 / 64.0f,
            1 / 32.0f, 2 / 64.0f,
            0 / 32.0f, 1 / 64.0f,
            1 / 32.0f, 2 / 64.0f,
            0 / 32.0f, 2 / 64.0f,
            0 / 32.0f, 1 / 64.0f
        )
    ),//1;2
    TRAP(
        floatArrayOf(
            11 / 32.0f, 5 / 64.0f,
            11 / 32.0f, 6 / 64.0f,
            10 / 32.0f, 5 / 64.0f,
            11 / 32.0f, 6 / 64.0f,
            10 / 32.0f, 6 / 64.0f,
            10 / 32.0f, 5 / 64.0f
        )
    ),//11;6
    PIT(
        floatArrayOf(
            9 / 32.0f, 0 / 64.0f,
            9 / 32.0f,1 / 64.0f,
            8 / 32.0f, 0 / 64.0f,
            9 / 32.0f, 1 / 64.0f,
            8 / 32.0f, 1 / 64.0f,
            8 / 32.0f, 0 / 64.0f
        )
    );//9;1

    public fun giveOneRandomItem(): FloatArray {
        val rand = Random.nextInt(5)

        return when (rand) {
            0 -> FLOOR.textureIndexes
            1 -> WALL.textureIndexes
            2 -> ENEMY.textureIndexes
            3 -> TRAP.textureIndexes
            4 -> PIT.textureIndexes
            else -> FLOOR.textureIndexes
        }

    }

    /*fun giveAllRandomItem(size:Int):FloatArray{
        var result=FloatArray(2*6*size)

    }*/
}