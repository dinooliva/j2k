import kotlin.test.Test
import kotlin.test.assertEquals

class JumpTest {
    @Test
    fun testJumpWithIf() {
        val ja = JumpJa()
        val kt = JumpKt()

        assertEquals(20, ja.jumpWithIf(0))
        assertEquals(1,  ja.jumpWithIf(1))
        assertEquals(10, ja.jumpWithIf(2))
        assertEquals(20, kt.jumpWithIf(0))
        assertEquals(1,  kt.jumpWithIf(1))
        assertEquals(10, kt.jumpWithIf(2))
    }

    @Test
    fun testJumpWithSwitch() {
        val ja = JumpJa()
        val kt = JumpKt()

        assertEquals(20, ja.jumpWithSwitch(0))
        assertEquals(20, ja.jumpWithSwitch(1))
        assertEquals(10, ja.jumpWithSwitch(2))
        assertEquals(20, kt.jumpWithSwitch(0))
        assertEquals(20, kt.jumpWithSwitch(1))
        assertEquals(10, kt.jumpWithSwitch(2))
    }

    @Test
    fun testJumpWithIfLabeled() {
        val ja = JumpJa()
        val kt = JumpKt()

        assertEquals(100, ja.jumpWithIfLabeled(0))
        assertEquals(1,   ja.jumpWithIfLabeled(1))
        assertEquals(10,  ja.jumpWithIfLabeled(2))
        assertEquals(100, kt.jumpWithIfLabeled(0))
        assertEquals(1,   kt.jumpWithIfLabeled(1))
        assertEquals(10,  kt.jumpWithIfLabeled(2))
    }

    @Test
    fun testJumpWithSwitchLabeled() {
        val ja = JumpJa()
        val kt = JumpKt()
        assertEquals(100, ja.jumpWithSwitchLabeled(0))
        assertEquals(1,   ja.jumpWithSwitchLabeled(1))
        assertEquals(10,  ja.jumpWithSwitchLabeled(2))
        assertEquals(100, kt.jumpWithSwitchLabeled(0))
        assertEquals(1,   kt.jumpWithSwitchLabeled(1))
        assertEquals(10,  kt.jumpWithSwitchLabeled(2))
    }
}