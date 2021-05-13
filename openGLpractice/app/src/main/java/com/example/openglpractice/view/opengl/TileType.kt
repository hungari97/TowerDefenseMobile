package com.example.openglpractice.view.opengl

import com.example.openglpractice.utility.Vector
import kotlin.random.Random

enum class TileType {
    FLOOR_LURD {
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(0, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_XURD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(1, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_LXRD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(2, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_LUXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(3, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_LURX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(4, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_XXRD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(5, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_XUXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(6, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_XURX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(7, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_LXXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(8, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_LXRX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(9, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_LUXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(10, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_LXXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(11, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_XUXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(12, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_XXRX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(13, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_XXXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(14, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    FLOOR_XXXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(15, 4)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_LURD {
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(0, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_XURD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(1, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_LXRD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(2, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_LUXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(3, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_LURX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(4, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_XXRD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(5, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_XUXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(6, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_XURX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(7, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_LXXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(8, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_LXRX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(9, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_LUXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(10, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_LXXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(11, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_XUXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(12, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_XXRX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(13, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_XXXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(14, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WALL_XXXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(15, 3)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_LURD {
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(0, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_XURD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(1, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_LXRD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(2, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_LUXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(3, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_LURX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(4, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_XXRD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(5, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_XUXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(6, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_XURX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(7, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_LXXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(8, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_LXRX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(9, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_LUXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(10, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_LXXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(11, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_XUXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(12, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_XXRX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(13, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_XXXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(14, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    PIT_XXXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(15, 2)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_LURD {
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(0, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_XURD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(1, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_LXRD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(2, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_LUXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(3, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_LURX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(4, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_XXRD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(5, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_XUXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(6, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_XURX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(7, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_LXXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(8, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_LXRX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(9, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_LUXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(10, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_LXXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(11, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_XUXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(12, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_XXRX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(13, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_XXXD{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(14, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    WATER_XXXX{
        override val textureSize: Vector<Int> = Vector(16, 5)
        override val tilePosition: Vector<Int> = Vector(15, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    CHARACTER_NOTHING{
        override val textureSize: Vector<Int> = Vector(16, 11)
        override val tilePosition: Vector<Int> = Vector(1, 1)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    },
    TRAP_NOTHING{
        override val textureSize: Vector<Int> = Vector(16, 7)
        override val tilePosition: Vector<Int> = Vector(0, 0)
        override val textureIndexes: FloatArray by lazy {
            generateTextureIndexes()
        }
    };

    abstract val textureSize: Vector<Int>
    abstract val tilePosition: Vector<Int>
    abstract val textureIndexes: FloatArray
    protected fun generateTextureIndexes() = floatArrayOf(
        (tilePosition.x + 1) / textureSize.x.toFloat(),
        tilePosition.y / textureSize.y.toFloat(),
        (tilePosition.x + 1) / textureSize.x.toFloat(),
        (tilePosition.y + 1) / textureSize.y.toFloat(),
        tilePosition.x / textureSize.x.toFloat(),
        tilePosition.y / textureSize.y.toFloat(),
        (tilePosition.x + 1) / textureSize.x.toFloat(),
        (tilePosition.y + 1) / textureSize.y.toFloat(),
        tilePosition.x / textureSize.x.toFloat(),
        (tilePosition.y + 1) / textureSize.y.toFloat(),
        tilePosition.x / textureSize.x.toFloat(),
        tilePosition.y / textureSize.y.toFloat()
    )
}