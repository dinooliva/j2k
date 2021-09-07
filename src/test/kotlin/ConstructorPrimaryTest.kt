import kotlin.test.Test
import kotlin.test.assertEquals

class ConstructorPrimaryTest {
    @Test
    fun testConstructor() {
        assertEquals(42, ConstructorPrimaryJa().i)
        assertEquals(42, ConstructorPrimaryKt().i)

        assertEquals(11, ConstructorPrimaryJa(10).i)
        assertEquals(11, ConstructorPrimaryKt(10).i)
    }
}