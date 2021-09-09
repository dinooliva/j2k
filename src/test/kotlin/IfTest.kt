import kotlin.test.Test
import kotlin.test.assertEquals

class IfTest {
    @Test
    fun testIf() {
        val ja = IfJa()
        val kt = IfKt()

        assertEquals(1, ja.ifTernary(true))
        assertEquals(1, kt.ifTernary(true))

        assertEquals(0, ja.ifThen(false))
        assertEquals(0, kt.ifThen(false))

        assertEquals(1, ja.ifThenElse(true))
        assertEquals(1, kt.ifThenElse(true))
    }
}