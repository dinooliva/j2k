class LocalClassExampleKt(var i: Int) {
    var value = 0

    fun LocalClassExampleJa(i: Int) {
        value = i
    }

    fun getB(): B {
        class C : B() {
            override fun getValue(): Int {
                return i
            }
        }
        return C()
    }

    abstract class B {
        abstract fun getValue(): Int
    }
}