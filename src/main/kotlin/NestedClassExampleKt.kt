class NestedClassExampleKt(var i: Int) {

    inner class Nested {
        fun getExampleI(): Int {
            return i
        }
    }
}