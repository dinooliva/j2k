class InstanceofKt {
    fun isInstanceof(a: A?): Boolean {
        return a is B
    }

    open class A
    class B : A()
}