import kotlin.test.Test
import kotlin.test.assertEquals

class ForTest{
    @Test
    fun testFor() {
        val ja = ForJa()
        val kt = ForKt()

        assertEquals(4, ja.loop(4))
        assertEquals(4, kt.loop(4))

        assertEquals(6, ja.loopWithBreak(10))
        assertEquals(6, kt.loopWithBreak(10))

        assertEquals(7, ja.loopWithContinue(12))
        assertEquals(7, kt.loopWithContinue(12))
    }
}