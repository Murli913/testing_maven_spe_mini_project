import org.example.Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    @Test
    public void testFactorial() {
        assertEquals(1, Main.factorial(0));
        assertEquals(1, Main.factorial(1));
        assertEquals(2, Main.factorial(2));
        assertEquals(6, Main.factorial(3));
        assertEquals(24, Main.factorial(4));
        assertEquals(120, Main.factorial(5));
        assertEquals(720, Main.factorial(6));
    }

    @Test
    public void testPower() {
        assertEquals(8, Math.pow(2, 3));
        assertEquals(1, Math.pow(5, 0));
        assertEquals(27, Math.pow(3, 3));
    }

    @Test
    public void testLog() {
        assertEquals(0.0, Math.log(1), 0.0001);
        assertEquals(1.6094, Math.log(5), 0.0001);
        assertEquals(0.6931, Math.log(2), 0.0001);
    }

    @Test
    public void testSqrt() {
        assertEquals(2, Math.sqrt(4), 0.0001);
        assertEquals(3, Math.sqrt(9), 0.0001);
        assertEquals(5, Math.sqrt(25), 0.0001);
    }
}
