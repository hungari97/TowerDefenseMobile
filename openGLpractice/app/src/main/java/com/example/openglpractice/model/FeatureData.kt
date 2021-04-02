package com.example.openglpractice.model

import com.example.openglpractice.logic.Feature

data class FeatureData(
    override val id: Long,
    override val health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector,
    override val hitBoxSize: Vector,
    override var animationState: AnimateAnimateState,
    override var currentAnimationProgress: Int,
    override var rotation: Byte,
    override var functionality: Feature?

) : AFeatureData<FeatureData.AnimateAnimateState>() {
    enum class AnimateAnimateState : IAnimateEnum {
        CRYSTAL {
            override val textureArray: Array<FloatArray> by lazy {
                Array(16) { calculateCurrentState(0, 15, 1, 16) }

            }

        };

        fun changeToAttack(rest: TrapData.TrapAnimationState): TrapData.TrapAnimationState {
            return if (rest.ordinal % 2 == 0)
                TrapData.TrapAnimationState.values()[rest.ordinal + 1]
            else
                TrapData.TrapAnimationState.values()[rest.ordinal - 1]
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
                0 ->
                    FeatureData.AnimateAnimateState.CRYSTAL.textureArray
            }
            return FeatureData.AnimateAnimateState.CRYSTAL.textureArray
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