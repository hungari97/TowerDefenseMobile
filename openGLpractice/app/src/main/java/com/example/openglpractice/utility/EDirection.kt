package com.example.openglpractice.utility

enum class EDirection(val vector:Vector<Int>) {
    LEFT(Vector(-1, 0)),
    UP(Vector(0, 1)),
    RIGHT(Vector(1, 0)),
    DOWN(Vector(0, -1)),
}