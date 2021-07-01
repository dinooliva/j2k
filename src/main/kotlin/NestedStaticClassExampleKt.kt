class NestedStaticClassExampleKt {
    companion object { var i = 0 }

    class Nested {
        constructor(j: Int) {
            i = j
        }

        fun getExampleI(): Int {
            return i
        }
    }
}