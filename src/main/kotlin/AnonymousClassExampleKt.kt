class AnonymousClassExampleKt {
    val i: Int

    constructor(i: Int) {
        this.i = i
    }

    fun getB(): B? {
        return object : B {
            override public fun getValue(): Int {
                return i
            }
        }
    }

    interface B {
        fun getValue(): Int
    }
}