class WhileKt {
    fun count(count: Int): Boolean {
        var i = 0
        while (i < count) {
            i++
        }
        return i == count
    }

    fun countWithBreak(count: Int): Boolean {
        val dbl = count * 2
        var i = 0
        loop@ while (i < dbl) {
            i++
            if (i == count) break@loop
        }
        return i == count
    }

    fun countWithContinue(count: Int): Boolean {
        val dbl = count * 2
        var i = 0
        var j = 0
        loop@ while (i < dbl) {
            i++
            if (i > count) continue@loop
            j++
        }
        return i == dbl && j == count
    }
}