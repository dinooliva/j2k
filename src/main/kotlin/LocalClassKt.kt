class LocalClassKt {
    val i: Int

    constructor(i: Int) {
        this.i = i
    }

    fun getB(): B {
        class C : B {
            override fun getValue(): Int {
                return i
            }
        }
        return C()
    }

    interface B {
        fun getValue(): Int
    }
}