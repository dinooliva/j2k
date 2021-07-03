import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class ClassTest {
    @Test
    fun testClass() {
        val ja = ClassJa(5)
        val kt = ClassKt(5)

        assertEquals(5, ja.getClassI())
        assertEquals(5, kt.getClassI())

        assertEquals("toString()", ja.toString())
        assertEquals("toString()", kt.toString())

        assertEquals(-1, ja.hashCode())
        assertEquals(-1, kt.hashCode())

        assertFalse(ja.equals(ja))
        assertFalse(kt.equals(kt))
    }
}