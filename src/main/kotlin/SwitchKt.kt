class SwitchKt {
    fun basic(i: Int): Int {
        var retval = 0
        when (i) {
            1 -> retval += 10
            2 -> retval += 20
            else -> retval += i * 100
        }
        return retval
    }

    fun simpleFallThrough(i: Int): Int {
        var retval = 0
        when (i) {
            1, 2 -> retval += 20
            else -> retval += i * 100
        }
        return retval
    }

    fun fallThrough(i: Int): Int {
        var retval = 0
        when (i) {
            1 -> {
                retval += 10
                retval += 20
            }
            2 -> retval += 20
            else -> retval += i * 100
        }
        return retval
    }
}