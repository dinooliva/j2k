import kotlin.test.Test
import kotlin.test.assertEquals

class SwitchTest {
    @Test
    fun basicTest() {
        val ja = SwitchJa()
        val kt = SwitchKt()

        assertEquals(10, ja.basic(1))
        assertEquals(20, ja.basic(2))
        assertEquals(500, ja.basic(5))

        assertEquals(10, kt.basic(1))
        assertEquals(20, kt.basic(2))
        assertEquals(500, kt.basic(5))
    }

    @Test
    fun simpleFallThroughTest() {
        val ja = SwitchJa()
        val kt = SwitchKt()

        assertEquals(20, ja.simpleFallThrough(1))
        assertEquals(20, ja.simpleFallThrough(2))
        assertEquals(500, ja.simpleFallThrough(5))

        assertEquals(20, kt.simpleFallThrough(1))
        assertEquals(20, kt.simpleFallThrough(2))
        assertEquals(500, kt.simpleFallThrough(5))
    }

    @Test
    fun fallThroughTest() {
        val ja = SwitchJa()
        val kt = SwitchKt()

        assertEquals(30, ja.fallThrough(1))
        assertEquals(20, ja.fallThrough(2))
        assertEquals(500, ja.fallThrough(5))

        assertEquals(30, kt.fallThrough(1))
        assertEquals(20, kt.fallThrough(2))
        assertEquals(500, kt.fallThrough(5))
    }
}