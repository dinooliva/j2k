class IfKt {
    fun ifTerenary(b: Boolean): Int {
       return if (b) 1 else 0
    }

    fun ifThen(b: Boolean): Int {
        if (b) {
            return 1
        }
        return 0
    }

    fun ifThenElse(b: Boolean): Int {
        if (b) {
            return 1
        } else {
            return 0
        }
    }
}