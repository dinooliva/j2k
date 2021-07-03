import kotlin.test.Test
import kotlin.test.assertEquals

class AnonymousClassKtTest {
    @Test
    fun testAnonymousClass() {
        assertEquals(8, AnonymousClassJa(8).getB().getValue())
        assertEquals(8, AnonymousClassJa(8).getB().getValue())
    }
}