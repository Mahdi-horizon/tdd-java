import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ArithmeticTest {


private arithmetic = new Arithmetic();

    @Test
    public void testAddingTwoIntegersWithNegative() {
        int result = arithmetic.add(2, -3);
        assertEquals(-1, result);
    }

    @Test
    public void testAddingTwoPositiveIntegers() {
        int result = arithmetic.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testAddingTwoNonIntegerInputs() {
        int result = arithmetic.add("2", "3");
        assertFalse( result == 5);

    }


}
