class NestedStaticClassKt {
    companion object {
        @JvmField var i = 0

        @JvmStatic fun lowerJ(): Int {
            return Nested.j;
        }
    }

    class Nested {
        companion object {
            @JvmField internal var j = 0
        }

        constructor(value: Int) {
            i = value
            j = 2 * value
        }

        fun upperI(): Int {
            return i
        }
    }
}