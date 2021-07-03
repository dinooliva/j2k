import kotlin.test.Test
import kotlin.test.assertEquals

class EnumKtTest {
    @Test
    fun testEnum() {
        assertEquals(0, EnumJa.A.ordinal)
        assertEquals(0, EnumKt.A.ordinal)

        assertEquals(1, EnumJa.A.getEnumValue())
        assertEquals(1, EnumKt.A.getEnumValue())

        assertEquals(2, EnumJa.A.getEnumValueX2())
        assertEquals(2, EnumKt.A.getEnumValueX2())

        assertEquals(1, EnumJa.B.ordinal)
        assertEquals(1, EnumKt.B.ordinal)

        assertEquals(2, EnumJa.B.getEnumValue())
        assertEquals(2, EnumKt.B.getEnumValue())

        assertEquals(4, EnumJa.B.getEnumValueX2())
        assertEquals(4, EnumKt.B.getEnumValueX2())
    }
}