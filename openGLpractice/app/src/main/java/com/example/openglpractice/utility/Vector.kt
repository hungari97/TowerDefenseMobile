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
@JvmName("intPlusDoubleVector")
operator fun Vector<Int>.plus(other: Vector<Double>) = Vector(x + other.x, y + other.y)
@JvmName("intMinusDoubleVector")
operator fun Vector<Int>.minus(other: Vector<Double>) = Vector(x - other.x, y - other.y)
@JvmName("intPlusFloatVector")
operator fun Vector<Int>.plus(other: Vector<Float>) = Vector(x + other.x, y + other.y)
@JvmName("intMinusFloatVector")
operator fun Vector<Int>.minus(other: Vector<Float>) = Vector(x - other.x, y - other.y)

operator fun Vector<Int>.div(other: Int) = Vector(x / other, y / other)
operator fun Vector<Int>.times(other: Int) = Vector(x * other, y * other)
operator fun Vector<Int>.div(other: Double) = Vector(x / other, y / other)
operator fun Vector<Int>.times(other: Double) = Vector(x * other, y * other)
operator fun Vector<Int>.div(other: Float) = Vector(x / other, y / other)
operator fun Vector<Int>.times(other: Float) = Vector(x * other, y * other)

operator fun <T> Array<Array<T>>.get(position: Vector<Int>) = this[position.y][position.x]
operator fun <T> Array<Array<T>>.set(position: Vector<Int>, value: T) {
    this[position.y][position.x] = value
}