import kotlin.test.Test
import kotlin.test.assertTrue

class ForTest{
    @Test
    fun testFor() {
        val ja = ForJa()
        val kt = ForKt()

        assertTrue(ja.countTo(10))
        assertTrue(kt.countTo(10))

        assertTrue( ja.countToWithBreak(20))
        assertTrue(kt.countToWithBreak(20))

        assertTrue(ja.countToWithContinue(30))
        assertTrue(kt.countToWithContinue(30))
    }
}