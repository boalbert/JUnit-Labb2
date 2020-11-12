import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @DisplayName("Contains function that runs before all tests")
    @BeforeAll
    static void beforeAllTests() {

        System.out.println("Setting up something before running all tests...");

    }

    @DisplayName("Simple test of addition-method for Calculator-class")
    @Test
    void testAddition() {

        assertEquals(4, calculator.addition(2,2));

    }

    @DisplayName("Parameterized test for addition-method")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    void testAddParameterized(int n) {

        assertEquals(1 + n, calculator.addition(1, n));

    }

    @DisplayName("Testing subtraction-method for Calculator-class")
    @Test
    void testSubtraction() {

        assertEquals(10, calculator.subtraction(15,5) );

    }

    @DisplayName("Testing division-method for Calculator-class")
    @Test
    void testDivision() {

        assertEquals(3,calculator.division(7,2));
        assertNotEquals(3.5, calculator.division(7,2));

    }

    @DisplayName("Testing multiplication-method for Calculator-class")
    @Test
    void testMultiply() {

        assertEquals(10,calculator.multiply(2,5));

    }

    @DisplayName("Tests if number turns bigger when multiply by itself (larger than 1)")
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5, 6, 7, 8, 9, 10})
    void testIfNumberTurnsBiggerWhenWeMultiPlyByItself(int n){

        Assertions.assertTrue(calculator.multiply(n,n) > n);

    }

    @DisplayName("(DISABLED) Should throw exception when dividing by zero")
    @Disabled
    @Test
    void testException() {

        Exception exception = Assertions.assertThrows(ArithmeticException.class,() -> calculator.division(1,0));
        assertEquals("/ by zero", exception.getMessage());

    }
}
