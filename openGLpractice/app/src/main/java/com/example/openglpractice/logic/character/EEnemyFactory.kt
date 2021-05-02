package com.example.openglpractice.logic.character

import com.example.openglpractice.model.character.EnemyData
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.utility.Vector

enum class EEnemyFactory {
    SLIME{
        override fun createEnemy(position: Vector<Int>, id: Long, rotation: EDirection): Enemy {
            val data= EnemyData(
                id = id,
                health=5,
                damage=1,
                hitBoxPosition = position,
                hitBoxSize= Vector(1,1),
                animationState= EnemyData.EnemyAnimateState.SLIMEREST,
                animationProgress = 0,
                goal=null,
                path = null,
                rotation= rotation,
                functionality = null
            )
            val enemy= Enemy(data)
            enemy.data.functionality=enemy
            return enemy
        }
    };
    abstract fun createEnemy(position: Vector<Int>, id: Long, rotation: EDirection): Enemy

}