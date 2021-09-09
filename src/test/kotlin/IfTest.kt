import kotlin.test.Test
import kotlin.test.assertEquals

class IfTest {
    @Test
    fun testIf() {
        val ja = IfJa()
        val kt = IfKt()

        assertEquals(1, ja.ifTerenary(true))
        assertEquals(1, kt.ifTerenary(true))

        assertEquals(0, ja.ifThen(false))
        assertEquals(0, kt.ifThen(false))

        assertEquals(1, ja.ifThenElse(true))
        assertEquals(1, kt.ifThenElse(true))
    }
}