import kotlin.test.Test
import kotlin.test.assertEquals

class JumpTest {
    @Test
    fun testSw9() {
        val ja = JumpJa()
        val kt = JumpKt()

        assertEquals(1,  ja.jumpWithIf(0))
        assertEquals(10, ja.jumpWithIf(1))
        assertEquals(20, ja.jumpWithIf(3))
        assertEquals(1,  kt.jumpWithIf(0))
        assertEquals(10, kt.jumpWithIf(1))
        assertEquals(20, kt.jumpWithIf(3))

        assertEquals(20, ja.jumpWithSwitch(0))
        assertEquals(10, ja.jumpWithSwitch(1))
        assertEquals(20, ja.jumpWithSwitch(2))
        assertEquals(20, kt.jumpWithSwitch(0))
        assertEquals(10, kt.jumpWithSwitch(1))
        assertEquals(20, kt.jumpWithSwitch(2))
    }
}