package com.example.openglpractice.logic

import com.example.openglpractice.model.EnemyData
import com.example.openglpractice.model.Vector

enum class EnemyFactory {
    SLIME{
        override fun createEnemy(position: Vector, id: Long, rotation: Byte): Enemy {
            val data=EnemyData(
                id = id,
                health=5,
                damage=1,
                hitBoxPosition = position,
                hitBoxSize= Vector(1.0,1.0),
                animationState=EnemyData.EnemyAnimateState.SLIMEREST,
                currentAnimationProgress = 0,
                goal=null,
                path = null,
                rotation= rotation,
                functionality = null
            )
            val enemy=Enemy(data)
            enemy.data.functionality=enemy
            return enemy
        }
    };
    abstract fun createEnemy(position: Vector, id: Long, rotation: Byte): Enemy

}