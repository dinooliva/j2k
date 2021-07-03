import kotlin.test.Test
import kotlin.test.assertEquals

class AbstractClassTest {
    @Test
    fun testAbstractClass() {
        val ja = AbstractClassJa.A()
        val kt = AbstractClassKt.A()

        assertEquals(24, ja.getAbstractClassValue())
        assertEquals(24, kt.getAbstractClassValue())

        assertEquals(48, ja.getAbstractClassValueX2())
        assertEquals(48, kt.getAbstractClassValueX2())
    }
}