package drp.common

class ValueManager<T>(
    private var receivers: MutableList<(value: T) -> Unit> = mutableListOf(),
    private var producer: (() -> T)? = null,
    startValue: T? = null
) {
    private var container: T? = startValue
        get() {
            producer?.let { producer -> field = producer() }
            return field
        }
        set(value) {
            value ?: throw NullPointerException("value should not be null!")
            field = value
            receivers.forEach { it(value) }
        }
    var value: T
        get() {
            return container ?: throw Exception("Container is not initialized yet!")
        }
        set(value) {
            container = value
        }

    fun recieve(value: T) { container = value    }

    fun produce(): T = value

    fun setReceivers(value: List<(value: T) -> Unit>) {
        receivers = value.toMutableList()
    }

    operator fun plusAssign(value: (value: T) -> Unit) {
        receivers.add(value)
    }

    operator fun minusAssign(value: (value: T) -> Unit) {
        receivers.remove(value)
    }

    operator fun plusAssign(value: List<(value: T) -> Unit>) {
        receivers.addAll(value)
    }

    operator fun minusAssign(value: List<(value: T) -> Unit>) {
        receivers.removeAll(value)
    }

    operator fun plusAssign(value: () -> T) {
        producer = value
    }

    operator fun minusAssign(value: () -> T) {
        if (producer == value)
            producer = null
    }

    val clear = fun() {
        producer = null
        receivers.clear()
        container = null
    }
}