import kotlin.test.Test
import kotlin.test.assertEquals

class InterfaceKtTest {
    @Test
    fun testInterface() {
        val ja = InterfaceJa.OneF()
        val kt = InterfaceJa.OneF()

        assertEquals(1, ja.f())
        assertEquals(1, kt.f())
    }
}