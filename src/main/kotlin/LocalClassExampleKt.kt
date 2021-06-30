class LocalClassExampleKt {
    var i: Int

    constructor(i: Int) {
        this.i = i
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