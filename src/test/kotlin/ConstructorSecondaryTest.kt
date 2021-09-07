import kotlin.test.Test
import kotlin.test.assertEquals

class ConstructorSecondaryTest {
    @Test
    fun testConstructor() {
        assertEquals(42, ConstructorSecondaryJa().i)
        assertEquals(42, ConstructorSecondaryKt().i)

        assertEquals(6, ConstructorSecondaryJa(5).i)
        assertEquals(6, ConstructorSecondaryKt(5).i)
    }
}