import kotlin.test.Test
import kotlin.test.assertEquals

class NestedStaticClassTest {
    @Test
    fun tesNestedStaticClass() {
        assertEquals(7, NestedStaticClassJa.Nested(7).upperI())
        assertEquals(7, NestedStaticClassKt.Nested(7).upperI())

        assertEquals(14, NestedStaticClassJa.lowerJ())
        assertEquals(14, NestedStaticClassKt.lowerJ())
    }
}