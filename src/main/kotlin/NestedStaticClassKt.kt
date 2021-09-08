class NestedStaticClassKt {
    companion object {
        var i = 0

        fun lowerJ(): Int {
            return Nested.j;
        }
    }

    class Nested {
        companion object { internal var j = 0 }

        constructor(value: Int) {
            i = value
            j = 2 * value
        }

        fun upperI(): Int {
            return i
        }
    }
}