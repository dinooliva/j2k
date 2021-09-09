import kotlin.test.Test
import kotlin.test.assertTrue

class WhileTest {
    @Test
    fun testWhile() {
        val ja = WhileJa()
        val kt = WhileKt()

        assertTrue(ja.count(10))
        assertTrue(kt.count(10))

        assertTrue(ja.countWithBreak(20))
        assertTrue(kt.countWithBreak(20))

        assertTrue(ja.countWithContinue(30))
        assertTrue(kt.countWithContinue(30))
    }
}