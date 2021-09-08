import kotlin.test.Test
import kotlin.test.assertEquals

class FieldsInlineTest {
    @Test
    fun testFields() {
        val kt = FieldsInlineKt(42, 24)
        val ja = FieldsInlineJa(42, 24)

        assertEquals(42, kt.immutable)
        assertEquals(42, ja.immutable)

        assertEquals(24, kt.mutable)
        assertEquals(24, ja.mutable)

        assertEquals(66, kt.sum)
        assertEquals(66, ja.sum)
    }
}