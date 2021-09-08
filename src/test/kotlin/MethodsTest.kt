import kotlin.test.Test
import kotlin.test.assertEquals

class MethodsTest {
    @Test
    fun testMethods() {
        val kt = MethodsKt()
        val ja = MethodsJa()

        assertEquals(42, kt.add(24, 18))
        assertEquals(42, ja.add(24, 18))

        assertEquals(1, kt.factorial(0))
        assertEquals(1, ja.factorial(0))

        assertEquals(24, kt.factorial(4))
        assertEquals(24, ja.factorial(4))
    }
}