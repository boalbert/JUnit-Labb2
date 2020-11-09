import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Simple test of add-method")
    void testAdd() {
        assertEquals(4, calculator.add(2,2));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    @DisplayName("Parameterized test for add-method")
    void testAddParameterized(int n) {
        assertEquals(1 + n, calculator.add(1, n));
    }

    @Test
    void testDivision() {
        assertEquals(3,calculator.division(7,2));
    }

    @Disabled
    @Test
    @DisplayName("Testing to division by zero")
    void testException() {
        Exception exception = Assertions.assertThrows(ArithmeticException.class,() -> calculator.division(1,0));

        assertEquals("/ by zero", exception.getMessage());

    }

    @Test
    void multiply() {
        assertEquals(10,calculator.multiply(2,5));
    }

    @Test
    void assertTrue(){
        Assertions.assertTrue(calculator.multiply(2,2) > 2);
    }

}
