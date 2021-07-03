import kotlin.test.Test
import kotlin.test.assertEquals

class LocalClassTest {
    @Test
    fun testLocalClass() {
        assertEquals(9, LocalClassJa(9).getB().getValue())
        assertEquals(9, LocalClassKt(9).getB().getValue())
    }
}