import kotlin.test.Test
import kotlin.test.assertTrue

class WhileTest {
    @Test
    fun testWhile() {
        val ja = WhileJa()
        val kt = WhileKt()

        assertTrue(ja.countTo(10))
        assertTrue(kt.countTo(10))

        assertTrue(ja.countToWithBreak(20))
        assertTrue(kt.countToWithBreak(20))

        assertTrue(ja.countToWithContinue(30))
        assertTrue(kt.countToWithContinue(30))
    }
}