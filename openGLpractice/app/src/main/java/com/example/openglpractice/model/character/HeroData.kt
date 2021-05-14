package com.example.openglpractice.model.character

import com.example.openglpractice.logic.feature.EFeatureFactory
import com.example.openglpractice.logic.character.Hero
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.utility.Vector

data class HeroData(
    override val id: Long,
    override var health: Int,
    override val damage: Int,
    override var hitBoxPosition: Vector<Int>,
    override var hitBoxSize: Vector<Int>,
    override var animationState: HeroAnimateState,
    override var animationProgress: Int,
    override var goal: Vector<Int>?,
    override var path: Array<Vector<Int>>?,
    override var functionality: Hero?,
    override var rotation: EDirection,
    var trapTypes: Set<EFeatureFactory>,

    ) : CharacterData() {
    enum class HeroAnimateState : ICharacterAnimationEnum {
        HEROREST {
            override val action: EActionType = EActionType.REST
            override val frameSize: Vector<Int> = Vector(1, 1)
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(frameSize.x, frameSize.y, 0)
            }
        },
        HEROWALK {
            override val action: EActionType = EActionType.WALK
            override val frameSize: Vector<Int> = Vector(2, 1)
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(frameSize.x, frameSize.y, 1)
            }
        },
        HEROATTACK {
            override val action: EActionType = EActionType.ATTACK
            override val frameSize: Vector<Int> = Vector(2, 1)
            override val textureArray: Array<FloatArray> by lazy {
                textureArrayInitialise(frameSize.x, frameSize.y, 3)
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