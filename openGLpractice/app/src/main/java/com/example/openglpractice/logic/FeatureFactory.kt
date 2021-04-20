package com.example.openglpractice.logic

import com.example.openglpractice.R
import com.example.openglpractice.model.FeatureData
import com.example.openglpractice.model.TrapData
import com.example.openglpractice.model.Vector

enum class FeatureFactory {
    SPIKETRAP {
        override val iconIndex: Int
            get() = R.mipmap.spike

        override fun createFeature(position: Vector, id: Long, rotation: Byte): Trap {
            val data = TrapData(
                id,
                3,
                2,
                position,
                Vector(1.0, 1.0),
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

        override fun createFeature(position: Vector, id: Long, rotation: Byte): Trap {
            val data = TrapData(
                id,
                3,
                2,
                position,
                Vector(2.0, 1.0),
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

        override fun createFeature(position: Vector, id: Long, rotation: Byte): Feature {

            val data = FeatureData(
                id,
                10,
                0,
                position,
                Vector(1.0, 1.0),
                FeatureData.AnimateAnimateState.valueOf("CRYSTAL"),
                0,
                rotation,
                null
            )
            val crystal = Feature(data)
            crystal.data.functionality = crystal
            return crystal
        }
    };

    abstract fun createFeature(position: Vector, id: Long, rotation: Byte): AFeature<*>
    abstract val iconIndex: Int

}