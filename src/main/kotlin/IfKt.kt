class IfKt {
    fun fromIf(b: Boolean): Int {
        if (b) {
            return 1
        }
        return 0
    }

    fun fromIfElse(b: Boolean): Int {
        if (b) {
            return 1
        } else {
            return 0
        }
    }
}