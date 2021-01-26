package com.example.openglpractice.logic

import com.example.openglpractice.model.AFeatureData
import com.example.openglpractice.model.TrapData
import com.example.openglpractice.model.Vector

enum class FeatureFactory {
    TRAP {
        override val iconIndex: Int
            get() = 1

        override fun createFeature(position: Vector): Trap {
            val trap = Trap(
                TrapData(
                    10,
                    3,
                    1,
                    position,
                    Vector(0.5, 0.5),
                    TrapData.TrapAnimationState.valueOf("0"),
                    0,
                    null,
                    3000
                )
            )
            return trap
        }

    };


    abstract fun createFeature(position: Vector): AFeature<>
    abstract val iconIndex: Int

}