class ExceptionKt {
    @Throws(Exception::class)
    fun checkedException(x: Int): Int {
        if (x == 1) {
            throw Exception("checked")
        }
        return x
    }

    fun tryCheckedException(x: Int): Int {
        return try {
            checkedException(x)
        } catch (exn: Exception) {
            -x
        }
    }

    fun runtimeException(x: Int): Int {
        if (x == 1) {
            throw RuntimeException("runtime")
        }
        return x
    }

    fun tryRuntimeException(x: Int): Int {
        return try {
            runtimeException(x)
        } catch (exn: RuntimeException) {
            -x
        }
    }

    fun tryAutoCloseableWithException(x: Int): Int {
        class TestAutoCloseable : AutoCloseable {
            var i = 0
            override fun close() {
                i = -x
            }
        }

        var outer = TestAutoCloseable()
        try {
            TestAutoCloseable().use { tac ->
                outer = tac
                if (x == 1) {
                    throw Exception()
                }
                return x
            }
        } catch (exn: Exception) {
            return outer.i
        }
    }
}