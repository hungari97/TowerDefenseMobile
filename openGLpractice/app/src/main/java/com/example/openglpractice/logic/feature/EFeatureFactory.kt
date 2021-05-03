package com.example.openglpractice.logic.feature

import com.example.openglpractice.R
import com.example.openglpractice.model.feature.FeatureData
import com.example.openglpractice.model.feature.TrapData
import com.example.openglpractice.utility.EDirection
import com.example.openglpractice.utility.Vector

enum class EFeatureFactory {
    SPIKETRAP {
        override val iconIndex: Int
            get() = R.mipmap.spike

        override fun createFeature(position: Vector<Int>, id: Long, rotation: EDirection): Trap {
            val data = TrapData(
                id,
                3,
                2,
                position,
                Vector(1, 1),
                TrapData.TrapAnimationState.valueOf("SPIKEREST"),
                0,
                null,
                rotation,
                1500
            )
            val trap = Trap(data)
            trap.data.functionality=trap
            return trap
        }

    },
    FIRETRAP {
        override val iconIndex: Int
            get() = R.mipmap.firetrap

        override fun createFeature(position: Vector<Int>, id: Long, rotation: EDirection): Trap {
            val data = TrapData(
                id,
                3,
                2,
                position,
                Vector(2, 1),
                TrapData.TrapAnimationState.valueOf("FIREREST"),
                0,
                null,
                rotation,
                5000
            )
            val trap = Trap(data)
            trap.data.functionality = trap
            return trap
        }
    },
    CRYSTAL {
        override val iconIndex: Int
            get() = TODO("Not yet implemented")

        override fun createFeature(position: Vector<Int>, id: Long, rotation: EDirection): Feature {

            val data = FeatureData(
                id,
                20,
                0,
                position,
                Vector(1, 1),
                FeatureData.FeatureAnimateState.valueOf("CRYSTAL"),
                0,
                rotation,
                null
            )
            val crystal = Feature(data)
            crystal.data.functionality = crystal
            return crystal
        }
    };

    abstract fun createFeature(position: Vector<Int>, id: Long, rotation: EDirection): AFeature<*>
    abstract val iconIndex: Int

}