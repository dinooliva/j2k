class AnonymousClassExampleKt (var i: Int){

    fun getB(): B? {
        return object : B() {
            override fun getValue(): Int {
                return i
            }
        }
    }

    abstract class B {
        abstract fun getValue(): Int
    }
}