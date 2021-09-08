class MethodsKt {
    fun add(x: Int, y: Int): Int {
        return x + y
    }

    fun factorial(n: Int): Int {
        return if (n == 0) 1 else n * factorial(n - 1)
    }
}