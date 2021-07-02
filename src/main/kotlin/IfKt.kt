class IfKt {
    fun fromBoolIf(b: Boolean): Int {
        if (b) {
            return 1
        }
        return 0
    }

    fun fromBoolIfElse(b: Boolean): Int {
        if (b) {
            return 1
        } else {
            return 0
        }
    }
}