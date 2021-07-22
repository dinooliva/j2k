class JumpKt {
    fun jumpWithIf(x: Int): Int {
        var i = 0
        var j = 0
        while (i++ < 10) {
            j++
            if (x == 1) break
            if (x == 2) continue
            j++
        }
        return j
    }

    fun jumpWithSwitch(x: Int): Int {
        var i = 0
        var j = 0
        while (i++ < 10) {
            j++
            when (x) {
                1 -> { }
                2 -> continue
            }
            j++
        }
        return j
    }

    fun jumpWithIfLabeled(x: Int): Int {
        var r = 0
        var i = 0
        outer@ while (i < 10) {
            i++
            var j = 0
            while (j < 10) {
                j++
                r++
                if (x == 1) break@outer
                if (x == 2) continue@outer
            }
        }
        return r
    }

    fun jumpWithSwitchLabeled(x: Int): Int {
        var r = 0
        var i = 0
        outer@ while (i < 10) {
            i++
            var j = 0
            while (j < 10) {
                j++
                r++
                when (x) {
                    1 -> break@outer
                    2 -> continue@outer
                }
            }
        }
        return r
    }
}