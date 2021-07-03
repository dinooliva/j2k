import kotlin.test.Test
import kotlin.test.assertEquals

class ConstructorKtTest {
    @Test
    fun testConstructor() {
        assertEquals(42, ConstructorJa().x)
        assertEquals(42, ConstructorKt().x)

        assertEquals(5, ConstructorKt(5).x)
        assertEquals(5, ConstructorKt(5).x)
    }
}