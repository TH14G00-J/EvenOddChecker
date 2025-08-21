import entities.EvenOddChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddCheckerTest {
    @Test
    void shouldReturnEvenForEvenNumbers() {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertEquals("Even", evenOddChecker.getParity(2));
        assertEquals("Even", evenOddChecker.getParity(4));
        assertEquals("Even", evenOddChecker.getParity(-6));
    }

    @Test
    void shouldReturnOddForOddNumbers() {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertEquals("Odd", evenOddChecker.getParity(3));
        assertEquals("Odd", evenOddChecker.getParity(-1));
        assertEquals("Odd", evenOddChecker.getParity(7));
    }
}
