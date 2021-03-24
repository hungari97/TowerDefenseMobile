package com.example.openglpractice.logic

import com.example.openglpractice.model.EnemyData

abstract class Enemy: Character<EnemyData.EnemyAnimateState>() {
    override val data:EnemyData
        get() {
            TODO()
        }
}