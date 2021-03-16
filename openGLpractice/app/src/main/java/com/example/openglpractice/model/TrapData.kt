package com.example.openglpractice.model

import com.example.openglpractice.logic.Trap

data class TrapData(
    override val id: Long,
    override var health: Int,
    override val damage: Int,
    override val hitBoxPosition: Vector,
    override val hitBoxSize: Vector,
    override val animationState: TrapAnimationState,
    override var currentAnimationProgress: Int,
    override val functionality: Trap,
    val coolDown: Long

) : AFeatureData<TrapData.TrapAnimationState>() {
    enum class TrapAnimationState : IFeatureEnum {
        REST_0 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 0, 2, 1)
            }
        },
        REST_1 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 1, 2, 2)
            }
        },
        REST_2 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 2, 2, 3)
            }
        },
        REST_3 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 3, 2, 4)
            }
        },
        REST_4 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 4, 2, 5)
            }
        },
        REST_5 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 5, 2, 6)
            }
        },
        REST_6 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 6, 2, 7)
            }
        },
        REST_7 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 7, 2, 8)
            }
        },
        REST_8 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 8, 2, 9)
            }
        },
        REST_9 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 9, 2, 10)
            }
        },
        REST_10 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 10, 2, 11)
            }
        },
        REST_11 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 11, 2, 12)
            }
        },
        REST_12 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 12, 2, 13)
            }
        },
        REST_13 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 13, 2, 14)
            }
        },
        REST_14 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 14, 2, 15)
            }
        },
        REST_15 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(1, 15, 2, 16)
            }
        },
        ATTACK_0 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 0, 3, 1)
            }
        },
        ATTACK_1 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 1, 3, 2)
            }
        },
        ATTACK_2 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 2, 3, 3)
            }
        },
        ATTACK_3 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 3, 3, 4)
            }
        },
        ATTACK_4 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 4, 3, 5)
            }
        },
        ATTACK_5 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 5, 3, 6)
            }
        },
        ATTACK_6 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 6, 3, 7)
            }
        },
        ATTACK_7 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 7, 3, 8)
            }
        },
        ATTACK_8 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 8, 3, 9)
            }
        },
        ATTACK_9 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 9, 3, 10)
            }
        },
        ATTACK_10 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 10, 3, 11)
            }
        },
        ATTACK_11 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 11, 3, 12)
            }
        },
        ATTACK_12 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 12, 3, 13)
            }
        },
        ATTACK_13 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 13, 3, 14)
            }
        },
        ATTACK_14 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 14, 3, 15)
            }
        },
        ATTACK_15 {
            override val textureIndexes: FloatArray by lazy {
                calculateCurrentState(2, 15, 3, 16)
            }
        };

        override fun valueOfCurrentState(state: Int): FloatArray {
            return values()[state].textureIndexes
        }

        override fun calculateCurrentState(
            minR: Int,
            minC: Int,
            maxR: Int,
            maxC: Int
        ): FloatArray {
            return floatArrayOf(
                maxC / 16.0f, minR / 7.0f,
                maxC / 16.0f, maxR / 7.0f,
                minC / 16.0f, minR / 7.0f,
                maxC / 16.0f, maxR / 7.0f,
                minC / 16.0f, maxR / 7.0f,
                minC / 16.0f, minR / 7.0f
            )
        }

    }
}