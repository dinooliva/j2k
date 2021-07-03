import kotlin.test.Test
import kotlin.test.assertEquals

class StaticTest {
    @Test
    fun testStaticTest() {
        assertEquals(42, StaticJa.getStaticI())
        assertEquals(42, StaticKt.getStaticI())
    }
}