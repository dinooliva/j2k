class NestedStaticClassExampleKt {
    companion object {
        var i = 0
    }

    class Nested(j: Int) {
        init {
            i = j
        }

        fun getExampleI(): Int {
            return i
        }
    }
}