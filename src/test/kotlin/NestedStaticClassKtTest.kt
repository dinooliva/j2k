import kotlin.test.Test
import kotlin.test.assertEquals

class NestedStaticClassKtTest {
    @Test
    fun tesNestedStaticClass() {
        val ja = NestedStaticClassJa.Nested(7)
        val kt = NestedStaticClassKt.Nested(7)

        assertEquals(7, ja.getExampleI())
        assertEquals(7, kt.getExampleI())
    }
}