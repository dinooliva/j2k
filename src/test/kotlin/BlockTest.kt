import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BlockTest {
    @Test
    fun testBlock() {
        val ja = BlockJa()
        val kt = BlockKt()

        assertFalse(ja.block(0))
        assertFalse(kt.block(0))

        assertTrue(ja.block(1))
        assertTrue(kt.block(1))

        assertFalse(ja.blockWithLabel(0))
        assertFalse(kt.blockWithLabel(0))

        assertTrue(ja.blockWithLabel(1))
        assertTrue(kt.blockWithLabel(1))
    }
}