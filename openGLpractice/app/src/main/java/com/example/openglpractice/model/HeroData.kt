package com.example.openglpractice.model

import com.example.openglpractice.logic.FeatureFactory
import com.example.openglpractice.logic.Hero

data class HeroData(
    override val id: Long,
    override val health: Int,
    override val damage: Int,
    override var hitBoxPosition: Vector,
    override var hitBoxSize: Vector,
    override var animationState: HeroAnimateState,
    override var currentAnimationProgress: Int,
    override var goal: Vector?,
    override var path: Array<Vector>?,
    override var functionality: Hero?,
    override var rotation: Byte,
    var trapTypes: Set<FeatureFactory>

) : CharacterData<HeroData.HeroAnimateState>() {
    enum class HeroAnimateState : IFeatureEnum {
        HEROREST {
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(1,1,1)
            }
        },
        HEROWALK {
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(2,1,2)
            }
        },
        HEROATTACK {
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(2,1,4)
            }
        };

        fun calculateCurrentState(
            minR: Int,
            minC: Int,
            maxR: Int,
            maxC: Int
        ): FloatArray {
            return floatArrayOf(
                minC / 16.0f, minR / 6.0f,
                minC / 16.0f, maxR / 6.0f,
                maxC / 16.0f, minR / 6.0f,
                minC / 16.0f, maxR / 6.0f,
                maxC / 16.0f, maxR / 6.0f,
                maxC / 16.0f, minR / 6.0f
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
            startingRow: Int
        ): Array<FloatArray> {
            var output = Array<FloatArray>(16 * frameSizeX * frameSizeY) { floatArrayOf(0.0f) }

            for (frameIndex in 0 until 16)
                for (frameX in 0 until frameSizeX) {
                    for (frameY in 0 until frameSizeY) {

                        output[frameIndex * frameSizeX * frameSizeY + frameY * frameSizeX + frameX] =
                            calculateCurrentState(
                                (startingRow + (((frameIndex ) * frameSizeX / (16 - (16 % frameSizeX))) * frameSizeY)) + frameY,
                                (frameIndex * frameSizeX) % (16 - (16 % frameSizeX)) + frameX,
                                (startingRow + (((frameIndex ) * frameSizeX / (16 - (16 % frameSizeX))) * frameSizeY)) + frameY +1,
                                (frameIndex * frameSizeX) % (16 - (16 % frameSizeX)) + frameX + 1
                            )

                    }
                }
            var kep = Array(16) { currentFrame ->
                calculateCurrentState(
                    startingRow + (((currentFrame + 1) * frameSizeX / (16 - (16 % frameSizeX))) * frameSizeY),
                    (currentFrame * frameSizeX) % (16 - (16 % frameSizeX)),
                    (startingRow + (((currentFrame + 1) * frameSizeX / (16 - (16 % frameSizeX))) * frameSizeY) + frameSizeY),
                    (currentFrame * frameSizeX) % (16 - (16 % frameSizeX)) + frameSizeX
                )

            }
            return output
        }
    }
}