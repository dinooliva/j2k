import kotlin.test.Test
import kotlin.test.assertEquals

class LocalClassKtTest {
    @Test
    fun localClassTest() {
        assertEquals(9, LocalClassJa(9).getB().getValue())
        assertEquals(9, LocalClassKt(9).getB().getValue())
    }
}