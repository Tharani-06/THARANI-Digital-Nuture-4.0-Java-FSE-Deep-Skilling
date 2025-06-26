import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        assertEquals(5, 2 + 3);

        assertTrue(5 > 3);

        assertFalse(5 < 3);

        assertNull(null);

        assertNotNull(new Object());
    }

    @Test
    public void testMoreAssertions() {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        assertSame(a, b);
        assertNotSame(a, c);

        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);

    }

}
