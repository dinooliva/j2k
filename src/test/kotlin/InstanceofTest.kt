import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class InstanceofTest {
    @Test
    fun testInstanceof() {
        val ja = InstanceofJa()
        val kt = InstanceofKt()

        assertFalse(ja.isInstanceof(null))
        assertFalse(kt.isInstanceof(null))

        assertFalse(ja.isInstanceof(InstanceofJa.A()))
        assertFalse(kt.isInstanceof(InstanceofKt.A()))

        assertTrue(ja.isInstanceof(InstanceofJa.B()))
        assertTrue(kt.isInstanceof(InstanceofKt.B()))
    }
}