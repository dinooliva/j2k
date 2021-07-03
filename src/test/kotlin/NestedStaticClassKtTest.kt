import kotlin.test.Test
import kotlin.test.assertEquals

class NestedStaticClassKtTest {
    @Test
    fun tesNestedStaticClass() {
        assertEquals(7, NestedStaticClassJa.Nested(7).getExampleI())
        assertEquals(7, NestedStaticClassKt.Nested(7).getExampleI())
    }
}