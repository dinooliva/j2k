import kotlin.test.Test
import kotlin.test.assertEquals

class InterfaceTest {
    @Test
    fun testInterface() {
        assertEquals(1, InterfaceJa.OneF().f())
        assertEquals(1, InterfaceKt.OneF().f())
    }
}