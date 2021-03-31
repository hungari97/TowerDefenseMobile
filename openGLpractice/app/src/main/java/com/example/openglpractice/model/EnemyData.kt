package com.example.openglpractice.model

import com.example.openglpractice.logic.Enemy
import com.example.openglpractice.logic.Interactable

data class EnemyData(
    override val id: Long,
    override var health: Int,
    override val damage: Int,
    override var hitBoxPosition: Vector,
    override var hitBoxSize: Vector,
    override var animationState: EnemyAnimateState,
    override var currentAnimationProgress: Int,
    override var goal: Vector?,
    override var path: Array<Vector>?,
    override var rotation: Byte,
    override var functionality: Enemy?,
) : CharacterData<EnemyData.EnemyAnimateState>() {
    enum class EnemyAnimateState : IFeatureEnum {
        SLIMEREST {
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(1, 1, 6)

            }
            override val isWalking: Boolean
                get() = false

        },
        SLIMEWALK {
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(2, 1, 7)

            }
            override val isWalking: Boolean
                get() = true

        },
        SLIMEATTACK {
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(2, 1, 9)

            }
            override val isWalking: Boolean
                get() = false

        };

        fun changeToAction(rest: EnemyAnimateState, toAction: String): EnemyAnimateState {
            return when (toAction) {
                "REST" -> {
                    when (rest.ordinal % 3) {
                        0 -> values()[rest.ordinal]
                        1 -> values()[rest.ordinal - 1]
                        else -> values()[rest.ordinal - 2]
                    }
                }
                "WALK" -> {
                    when (rest.ordinal % 3) {
                        0 -> values()[rest.ordinal + 1]
                        1 -> values()[rest.ordinal]
                        else -> values()[rest.ordinal - 1]
                    }
                }
                "ATTACK" -> {
                    when {
                        rest.ordinal % 3 == 0 -> values()[rest.ordinal + 2]
                        rest.ordinal % 3 == 1 -> values()[rest.ordinal + 1]
                        else -> values()[rest.ordinal]
                    }
                }

                else -> {
                    when {
                        rest.ordinal % 3 == 0 -> values()[rest.ordinal]
                        rest.ordinal % 3 == 1 -> values()[rest.ordinal + 1]
                        else -> values()[rest.ordinal + 2]
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

        override fun calculateAnimationArray(type: Int, rest: Boolean): Array<FloatArray> {
            when (type) {
                0 -> if (rest) {
                    TrapData.TrapAnimationState.SPIKEREST.textureArray
                } else
                    TrapData.TrapAnimationState.SPIKEATTACK.textureArray
                1 -> if (rest) {
                    TrapData.TrapAnimationState.FIREREST.textureArray
                } else
                    TrapData.TrapAnimationState.FIREATTACK.textureArray
            }
            return TrapData.TrapAnimationState.SPIKEREST.textureArray
        }

        fun textureArrayInitialise(
            frameSizeX: Int,
            frameSizeY: Int,
            startingRow: Int,
        ): Array<FloatArray> {
            var output = Array<FloatArray>(16 * frameSizeX * frameSizeY) { floatArrayOf(0.0f) }

            for (frameIndex in 0 until 16)
                for (frameX in 0 until frameSizeX) {
                    for (frameY in 0 until frameSizeY) {

                        output[frameIndex * frameSizeX * frameSizeY + frameY * frameSizeX + frameX] =
                            calculateCurrentState(
                                (startingRow + (((frameIndex) * frameSizeX / (16 - (16 % frameSizeX))) * frameSizeY)) + frameY,
                                (frameIndex * frameSizeX) % (16 - (16 % frameSizeX)) + frameX,
                                (startingRow + (((frameIndex) * frameSizeX / (16 - (16 % frameSizeX))) * frameSizeY)) + frameY + 1,
                                (frameIndex * frameSizeX) % (16 - (16 % frameSizeX)) + frameX + 1
                            )

                    }
                }
            return output
        }
    }

}