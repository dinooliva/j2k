import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class ClassKtTest {
    @Test
    fun classTest() {
        val cJa = ClassJa(5)
        val cKt = ClassKt(5)

        assertEquals(5, cJa.getClassI())
        assertEquals(5, cKt.getClassI())

        assertEquals("toString()", cJa.toString())
        assertEquals("toString()", cKt.toString())

        assertEquals(-1, cJa.hashCode())
        assertEquals(-1, cKt.hashCode())

        assertFalse(cJa.equals(cJa))
        assertFalse(cKt.equals(cKt))
    }
}