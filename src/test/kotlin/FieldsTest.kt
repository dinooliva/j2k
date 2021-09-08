import kotlin.test.Test
import kotlin.test.assertEquals

class FieldsTest {
    @Test
    fun testFields() {
        val kt = FieldsKt()
        val ja = FieldsJa()

        assertEquals(42, kt.immutable)
        assertEquals(42, ja.immutable)

        assertEquals(24, kt.mutable)
        assertEquals(24, ja.mutable)

        kt.mutable = 48
        ja.mutable = 48
        assertEquals(48, kt.mutable)
        assertEquals(48, ja.mutable)
    }
}