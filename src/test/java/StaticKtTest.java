import org.junit.Test;

import static org.junit.Assert.*;

public class StaticKtTest {
    @Test
    public void testStaticKt() {
        assertEquals(42, StaticKt.i);

        assertEquals(42, StaticKt.getStaticI());
        assertEquals(42, StaticKt.Companion.getStaticI());
    }
}