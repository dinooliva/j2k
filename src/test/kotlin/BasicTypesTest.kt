import kotlin.test.Test
import kotlin.test.assertEquals

class BasicTypesTest {

    @Test
    fun testBasicTypes() {
        val ja = BasicTypesJa()
        val kt = BasicTypesKt()

        assertEquals(29, ja.b)
        assertEquals(30, ja.s)
        assertEquals(31, ja.i)
        assertEquals(32, ja.l)
        assertEquals('!', ja.c)
        assertEquals(34.0f, ja.f)
        assertEquals(35.0, ja.d)
        assertEquals(true, ja.t)

        assertEquals(29, kt.b)
        assertEquals(30, kt.s)
        assertEquals(31, kt.i)
        assertEquals(32, kt.l)
        assertEquals('!', kt.c)
        assertEquals(34.0f, kt.f)
        assertEquals(35.0, kt.d)
        assertEquals(true, kt.t)

        assertEquals(29, ja.boxedB!!)
        assertEquals(30, ja.boxedS!!)
        assertEquals(31, ja.boxedI!!)
        assertEquals(32, ja.boxedL!!)
        assertEquals('!', ja.boxedC!!)
        assertEquals(34.0f, ja.boxedF!!)
        assertEquals(35.0, ja.boxedD!!)
        assertEquals(true, ja.boxedT!!)

        assertEquals(29, kt.boxedB!!)
        assertEquals(30, kt.boxedS!!)
        assertEquals(31, kt.boxedI!!)
        assertEquals(32, kt.boxedL!!)
        assertEquals('!', kt.boxedC!!)
        assertEquals(34.0f, kt.boxedF!!)
        assertEquals(35.0, kt.boxedD!!)
        assertEquals(true, kt.boxedT!!)
    }
}