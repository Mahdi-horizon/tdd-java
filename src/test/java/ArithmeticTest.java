import org.example.Arithmetic;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {


private Arithmetic arithmetic = new Arithmetic();

    @Test
    public void testAddingTwoIntegersWithNegative() {
        int result = arithmetic.add(2, -3);
        assertTrue( result == Integer.MIN_VALUE);
    }

    @Test
    public void testAddingTwoPositiveIntegers() {
        int result = arithmetic.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testAddingTwoNonIntegerInputs() {
        int result = arithmetic.add("2", "3");
        assertFalse( result !=Integer.MIN_VALUE);

    }


}
