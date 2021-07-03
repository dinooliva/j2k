import kotlin.test.Test
import kotlin.test.assertEquals

class NestedClassKtTest {
    @Test
    fun testNestedClass() {
        val ja = NestedClassJa(6).Nested()
        val kt = NestedClassKt(6).Nested()

        assertEquals(6, ja.getExampleI())
        assertEquals(6, kt.getExampleI())
    }
}