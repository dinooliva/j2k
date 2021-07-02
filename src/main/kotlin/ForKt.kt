class ForKt {
    fun loop(n: Int): Int {
        var i = 0
        var j = 0
        while (j < n) {
            i++
            j++
        }
        return i
    }

    fun loopWithBreak(n: Int): Int {
        var i = 0
        var j = 0
        out@ while (j < n) {
            if (j > n / 2) {
                break@out
            }
            i++
            j++
        }
        return if (j == n) -1 else i
    }

    fun loopWithContinue(n: Int): Int {
        var i = 0
        var j = 0
        out@ while (j < n) {
            if (j > n / 2) {
                j++
                continue@out
            }
            i++
            j++
        }
        return if (j == n) i else -1
    }
}