package com.example.openglpractice.model.character

import com.example.openglpractice.logic.character.Enemy
import com.example.openglpractice.model.character.EActionType.*
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.utility.Vector

data class EnemyData(
    override val id: Long,
    override var health: Int,
    override val damage: Int,
    override var hitBoxPosition: Vector<Int>,
    override var hitBoxSize: Vector<Int>,
    override var animationState: EnemyAnimateState,
    override var animationProgress: Int,
    override var goal: Vector<Int>?,
    override var path: Array<Vector<Int>>?,
    override var rotation: EDirection,
    override var functionality: Enemy?,
) : CharacterData() {
    enum class EnemyAnimateState : ICharacterAnimationEnum {
        SLIMEREST {
            override val action: EActionType = REST
            override val frameSize: Vector<Int> = Vector(1, 1)
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(frameSize.x, frameSize.y, 5)
            }

        },
        SLIMEWALK {
            override val action: EActionType = WALK
            override val frameSize: Vector<Int> = Vector(2, 1)
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(frameSize.x, frameSize.y, 6)

            }

        },
        SLIMEATTACK {
            override val action: EActionType = ATTACK
            override val frameSize: Vector<Int> = Vector(2, 1)
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(frameSize.x, frameSize.y, 8)

            }
        };

        fun calculateCurrentState(
            minR: Int,
            minC: Int,
            maxR: Int,
            maxC: Int,
        ): FloatArray {
            return floatArrayOf(
                minC / 16.0f, minR / 11.0f,
                minC / 16.0f, maxR / 11.0f,
                maxC / 16.0f, minR / 11.0f,
                minC / 16.0f, maxR / 11.0f,
                maxC / 16.0f, maxR / 11.0f,
                maxC / 16.0f, minR / 11.0f
            )
        }

        fun textureArrayInitialise(
            frameSizeX: Int,
            frameSizeY: Int,
            startingRow: Int,
        ): Array<FloatArray> {
            val output = Array(16) { floatArrayOf(0.0f) }

            for (frameIndex in 0 until 16)
                output[frameIndex] =
                    calculateCurrentState(
                        (startingRow + (((frameIndex) * frameSizeX / (16 - (16 % frameSizeX))) * frameSizeY)),
                        (frameIndex * frameSizeX) % (16 - (16 % frameSizeX)),
                        (startingRow + (((frameIndex) * frameSizeX / (16 - (16 % frameSizeX))) * frameSizeY)) + frameSizeY,
                        (frameIndex * frameSizeX) % (16 - (16 % frameSizeX)) + frameSizeX
                    )
            return output
        }
    }

}