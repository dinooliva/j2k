import kotlin.test.Test
import kotlin.test.assertEquals

class AbstractClassKtTest {
    @Test
    fun abstractClassTest() {
        val acJ = AbstractClassJa.A()
        val acK = AbstractClassKt.A()

        assertEquals(24, acJ.getAbstractClassValue())
        assertEquals(24, acK.getAbstractClassValue())

        assertEquals(48, acJ.getAbstractClassValueX2())
        assertEquals(48, acK.getAbstractClassValueX2())
    }
}