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
) : CharacterData<EnemyData.EnemyAnimateState>() {
    enum class EnemyAnimateState : ICharacterAnimationEnum {
        SLIMEREST {
            override val action: EActionType = REST
            override val frameSize: Vector<Int> = Vector(1, 1)
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(frameSize.x, frameSize.y, 6)
            }

        },
        SLIMEWALK {
            override val action: EActionType = WALK
            override val frameSize: Vector<Int> = Vector(2, 1)
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(frameSize.x, frameSize.y, 7)

            }

        },
        SLIMEATTACK {
            override val action: EActionType = ATTACK
            override val frameSize: Vector<Int> = Vector(2, 1)
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(frameSize.x, frameSize.y, 9)

            }
        };

        fun changeToAction(rest: EnemyAnimateState, toAction: EActionType): EnemyAnimateState {
            return when (toAction) {
                REST -> {
                    when (rest.ordinal % 3) {
                        0 -> values()[rest.ordinal]
                        1 -> values()[rest.ordinal - 1]
                        else -> values()[rest.ordinal - 2]
                    }
                }
                WALK -> {
                    when (rest.ordinal % 3) {
                        0 -> values()[rest.ordinal + 1]
                        1 -> values()[rest.ordinal]
                        else -> values()[rest.ordinal - 1]
                    }
                }
                ATTACK -> {
                    when {
                        rest.ordinal % 3 == 0 -> values()[rest.ordinal + 2]
                        rest.ordinal % 3 == 1 -> values()[rest.ordinal + 1]
                        else -> values()[rest.ordinal]
                    }
                }

            }
        }

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

        /*override fun calculateAnimationArray(type: Int, rest: Boolean): Array<FloatArray> {
            when (type) {
                0 -> if (rest) {
                    EnemyAnimateState.SLIMEREST.textureArray
                } else
                    SLIMEWALK.textureArray
            }
            return SLIMEREST.textureArray
        }*/

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