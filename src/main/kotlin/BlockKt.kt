class BlockKt {
    fun block(i: Int): Boolean {
        var b = true
        run {
            if (i == 0) {
                b = false
            }
        }
        return b
    }

    fun blockWithLabel(i: Int): Boolean {
        var b = true
        foo@ while (b) {
            if (true) {
                if (i == 0) {
                    b = false
                    continue@foo
                }
                break@foo
            }
        }
        return b
    }
}