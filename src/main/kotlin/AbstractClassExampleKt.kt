internal abstract class AbstractClassExampleKt(val value: Int) {

    fun getAbstractClassValue(): Int {
        return value
    }

    abstract fun getAbstractClassValueX2(): Int

    internal class A : AbstractClassExampleJa(24) {
        override public fun getAbstractClassValueX2(): Int {
            return 48
        }
    }
}