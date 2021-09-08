class PropertiesKt {
    val immutable = 42
    var mutable = 24
    var isEmpty = false
    var synthesized
        get() = if (isEmpty) 0 else mutable
        set(value) {
            if (!isEmpty) {
                mutable = value
            }
        }
}