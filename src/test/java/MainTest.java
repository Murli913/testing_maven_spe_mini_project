import org.example.Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    @Test
    public void testAddition() {
        double result = Main.calculateResult(1, 5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        double result = Main.calculateResult(2, 10, 3);
        assertEquals(7, result);
    }

    @Test
    public void testMultiplication() {
        double result = Main.calculateResult(3, 4, 2);
        assertEquals(8, result);
    }

    @Test
    public void testDivision() {
        double result = Main.calculateResult(4, 10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateResult(4, 10, 0));
    }

    @Test
    public void testInvalidChoice() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateResult(5, 10, 2));
    }
}
