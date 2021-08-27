import kotlin.test.Test
import kotlin.test.assertEquals

class ExceptionTest {
    @Test
    fun testCheckedException() {
        val ja = ExceptionJa()
        val kt = ExceptionKt()

        assertEquals(-1, ja.tryCheckedException(1))
        assertEquals(2,  ja.tryCheckedException(2))

        assertEquals(-1, kt.tryCheckedException(1))
        assertEquals(2,  kt.tryCheckedException(2))
    }

    @Test
    fun testRuntimeException() {
        val ja = ExceptionJa()
        val kt = ExceptionKt()

        assertEquals(-1, ja.tryRuntimeException(1))
        assertEquals(2,  ja.tryRuntimeException(2))

        assertEquals(-1, kt.tryRuntimeException(1))
        assertEquals(2,  kt.tryRuntimeException(2))
    }

    @Test
    fun testAutoCloseable() {
        val ja = ExceptionJa()
        val kt = ExceptionKt()

        assertEquals(-1, ja.tryAutoCloseableWithException(1))
        assertEquals(2,  ja.tryAutoCloseableWithException(2))

        assertEquals(-1, kt.tryAutoCloseableWithException(1))
        assertEquals(2,  kt.tryAutoCloseableWithException(2))
    }
}