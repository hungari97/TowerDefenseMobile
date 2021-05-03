package com.example.openglpractice.utility

data class Vector<T : Number>(var x: T, var y: T) {

    override operator fun equals(other: Any?) =
        other != 0 && other is Vector<*> && x == other.x && y == other.y

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }

}

operator fun Vector<Int>.plus(other: Vector<Int>) = Vector(x + other.x, y + other.y)
operator fun Vector<Int>.minus(other: Vector<Int>) = Vector(x - other.x, y - other.y)
operator fun <T> Array<Array<T>>.get(position: Vector<Int>) = this[position.y][position.x]
operator fun <T> Array<Array<T>>.set(position: Vector<Int>, value: T) {
    this[position.y][position.x] = value
}