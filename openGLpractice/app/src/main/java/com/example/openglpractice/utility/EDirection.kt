package com.example.openglpractice.utility

enum class EDirection(val vector: Vector<Int>) {
    LEFT(Vector(-1, 0)) {
        override val invers: EDirection by lazy { RIGHT }
    },
    UP(Vector(0, 1)){
        override val invers: EDirection by lazy { DOWN }
    },
    RIGHT(Vector(1, 0)){
        override val invers: EDirection by lazy { LEFT }
    },
    DOWN(Vector(0, -1)){
        override val invers: EDirection by lazy { UP }
    };

    abstract val invers: EDirection
}