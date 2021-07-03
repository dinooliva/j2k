import kotlin.test.Test
import kotlin.test.assertEquals

class AnonymousClassKtTest {
    @Test
    fun testAnonymousClass() {
        val acJ = AnonymousClassJa(8).getB()
        val acK = AnonymousClassJa(8).getB()

        assertEquals(8, acJ.getValue())
        assertEquals(8, acK.getValue())
    }
}