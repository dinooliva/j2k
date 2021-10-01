class InstanceofKt {
    fun isInstanceof(a: A?): Boolean {
        return if (a == null) false else a is B
    }

    open class A
    class B : A()
}