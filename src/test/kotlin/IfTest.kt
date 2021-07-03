import kotlin.test.Test
import kotlin.test.assertEquals

class IfTest {
    @Test
    fun testIf() {
        val ja = IfJa()
        val kt = IfKt()

        assertEquals(0, ja.fromIf(false))
        assertEquals(0, kt.fromIf(false))

        assertEquals(1, ja.fromIfElse(true))
        assertEquals(1, kt.fromIfElse(true))
    }
}