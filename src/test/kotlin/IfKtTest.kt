import kotlin.test.Test
import kotlin.test.assertEquals

class IfKtTest {
    @Test
    fun testIf() {
        val ifJa = IfJa()
        val ifKt = IfKt()

        assertEquals(0, ifJa.fromIf(false))
        assertEquals(0, ifKt.fromIf(false))

        assertEquals(1, ifJa.fromIfElse(true))
        assertEquals(1, ifKt.fromIfElse(true))
    }
}