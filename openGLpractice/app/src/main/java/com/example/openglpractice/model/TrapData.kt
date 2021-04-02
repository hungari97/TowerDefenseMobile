package com.example.openglpractice.model

import com.example.openglpractice.logic.Trap

data class TrapData(
    override val id: Long,
    override var health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector,
    override val hitBoxSize: Vector,
    override var animationState: TrapAnimationState,
    override var currentAnimationProgress: Int,
    override var functionality: Trap?,
    override var rotation: Byte, //0-left, 1 -up, 2-rigth, 3, down
    val coolDown: Long

) : AFeatureData<TrapData.TrapAnimationState>() {
    enum class TrapAnimationState : IAnimateEnum {
        SPIKEREST {
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(1, 1, 1)
            }
        },
        SPIKEATTACK {
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(1, 1, 2)
            }

        },
        FIREREST {
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(2, 1, 3)
            }
        },
        FIREATTACK {
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(2, 1, 5)
            }
        };

        fun changeToAttack(rest: TrapAnimationState): TrapAnimationState {
            return if (rest.ordinal % 2 == 0)
                values()[rest.ordinal + 1]
            else
                values()[rest.ordinal - 1]
        }


        fun calculateCurrentState(
            minR: Int,
            minC: Int,
            maxR: Int,
            maxC: Int
        ): FloatArray {
            return floatArrayOf(
                minC / 16.0f, minR / 7.0f,
                minC / 16.0f, maxR / 7.0f,
                maxC / 16.0f, minR / 7.0f,
                minC / 16.0f, maxR / 7.0f,
                maxC / 16.0f, maxR / 7.0f,
                maxC / 16.0f, minR / 7.0f
            )
        }

        override fun calculateAnimationArray(type: Int, rest: Boolean): Array<FloatArray> {
            when (type) {
                0 -> if (rest) {
                    SPIKEREST.textureArray
                } else
                    SPIKEATTACK.textureArray
                1 -> if (rest) {
                    FIREREST.textureArray
                } else
                    FIREATTACK.textureArray
            }
            return SPIKEREST.textureArray
        }

        fun textureArrayInitialise(
            frameSizeX: Int,
            frameSizeY: Int,
            startingRow: Int
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