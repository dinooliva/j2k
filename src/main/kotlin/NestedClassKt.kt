class NestedClassKt {
    val i: Int

    constructor(i: Int) {
        this.i = i
    }

    inner class Nested {
        fun exampleI(): Int {
            return i
        }
    }
}