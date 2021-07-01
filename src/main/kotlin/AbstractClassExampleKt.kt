abstract class AbstractClassExampleKt {
    val value: Int

    constructor(value: Int) {
        this.value = value
    }

    fun getAbstractClassValue(): Int {
        return value
    }

    abstract fun getAbstractClassValueX2(): Int

    class A : AbstractClassExampleKt {
        constructor() : super(24)

        override public fun getAbstractClassValueX2(): Int {
            return 48
        }
    }
}