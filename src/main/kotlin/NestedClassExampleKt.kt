class NestedClassExampleKt {
    var i: Int

    constructor(i: Int) {
        this.i = i
    }

    inner class Nested {
        fun getExampleI(): Int {
            return i
        }
    }
}