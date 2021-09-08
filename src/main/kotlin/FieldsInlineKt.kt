class FieldsInlineKt(val immutable: Int, var mutable: Int) {
    var sum: Int

    init {
        sum = immutable + mutable
    }
}