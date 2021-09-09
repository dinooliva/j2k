class ForKt {
    fun countTo(count: Int): Boolean {
        var i = 0
        while (i < count) {
            i++
        }
        return i == count
    }

    fun countToWithBreak(count: Int): Boolean {
        val dbl = count * 2
        var i = 0
        loop@ while (i < dbl) {
            if (i == count) break@loop
            i++
        }
        return i == count
    }

    fun countToWithContinue(count: Int): Boolean {
        val dbl = count * 2
        var i = 0
        var j = 0
        loop@ while (i < dbl) {
            if (i >= count) {
                i++
                continue@loop
            }
            j++
            i++
        }
        return i == dbl && j == count
    }
}