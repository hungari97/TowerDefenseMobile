package com.example.openglpractice.logic

import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.os.Build
import com.example.openglpractice.R
import com.example.openglpractice.model.TrapData
import com.example.openglpractice.model.Vector

enum class FeatureFactory {
    TRAP {
        override val iconIndex:Int
            get() =R.mipmap.icon

        override fun createFeature(position: Vector): Trap {
            val trap = Trap()
                val data=TrapData(
                    10,
                    3,
                    1,
                    position,
                    Vector(0.5, 0.5),
                    TrapData.TrapAnimationState.values()[0],
                    0,
                    trap,
                    3000
                )
            trap.data=data
            return trap
        }

    };


    abstract fun createFeature(position: Vector): AFeature<*>
    abstract val iconIndex: Int

}