package com.example.openglpractice.logic

import com.example.openglpractice.R
import com.example.openglpractice.model.TrapData
import com.example.openglpractice.model.Vector

enum class FeatureFactory {
    SPIKETRAP {
        override val iconIndex:Int
            get() =R.mipmap.icon

        override fun createFeature(position: Vector,id: Long,rotation: Byte): Trap {
            val trap = Trap()
                val data=TrapData(
                    id,
                    3,
                    1,
                    position,
                    Vector(1.0, 1.0),
                    TrapData.TrapAnimationState.valueOf("SPIKEREST"),
                    0,
                    trap,
                    rotation,
                    3000
                )
            trap.data=data
            return trap
        }

    },
    FIRETRAP{
        override val iconIndex: Int
            get() = R.mipmap.ic_launcher

        override fun createFeature(position: Vector,id:Long,rotation: Byte): Trap {
            val trap = Trap()
            val data=TrapData(
                id,
                3,
                2,
                position,
                Vector(2.0,1.0),
                TrapData.TrapAnimationState.valueOf("FIREREST"),
                5,
                trap,
                rotation,
                5000
            )
            trap.data=data
            return trap
        }
    };

    abstract fun createFeature(position: Vector,id:Long,rotation:Byte): AFeature<*>
    abstract val iconIndex: Int

}