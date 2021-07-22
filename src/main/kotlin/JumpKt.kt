class JumpKt {
    fun jumpWithIf(x: Int): Int {
        var i = 0
        var j = 0
        while (i++ < 10) {
            j++
            if (x == 0) break
            if (x == 1) continue
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
                0 -> { }
                1 -> continue
            }
            j++
        }
        return j
    }
}