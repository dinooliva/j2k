import kotlin.test.Test
import kotlin.test.assertEquals

class NestedClassKtTest {
    @Test
    fun testNestedClass() {
        assertEquals(6, NestedClassJa(6).Nested().getExampleI())
        assertEquals(6, NestedClassKt(6).Nested().getExampleI())
    }
}