import org.junit.Test;

import static org.junit.Assert.*;

public class PropertiesJaTest {
    @Test
    public void testProperties() {
        PropertiesJa ja = new PropertiesJa();
        PropertiesKt kt = new PropertiesKt();

        assertEquals(42, kt.getImmutable());
        assertEquals(42, ja.getImmutable());

        assertEquals(24, kt.getMutable());
        assertEquals(24, ja.getMutable());
        kt.setMutable(48);
        ja.setMutable(48);
        assertEquals(48, kt.getMutable());
        assertEquals(48, ja.getMutable());

        assertFalse(kt.isEmpty());
        assertFalse(ja.isEmpty());
        kt.setEmpty(true);
        ja.setEmpty(true);
        assertTrue(kt.isEmpty());
        assertTrue(ja.isEmpty());
/*
        kt.synthesized = 32
        ja.synthesized = 32
        assertEquals(0, kt.synthesized)
        assertEquals(0, ja.synthesized)
        kt.isEmpty = false
        ja.isEmpty = false
        kt.synthesized = 32
        ja.synthesized = 32
        assertEquals(32, kt.synthesized)
        assertEquals(32, ja.synthesized)


        assertEquals(42, StaticKt.i);

        assertEquals(42, StaticKt.getStaticI());
        assertEquals(42, StaticKt.Companion.getStaticI());
     */
    }
}
