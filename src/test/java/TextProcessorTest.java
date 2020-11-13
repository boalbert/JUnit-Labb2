import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TextProcessorTest {

    private final TextProcessor textProcessor = new TextProcessor();

    @DisplayName("Contains function that runs before each test")
    @BeforeEach
    @Test
    void displayBeforeEach() {

        System.out.print("This should contain functionality that needs to be run before each test ");

    }

    @DisplayName("Contains function that runs after each test")
    @AfterEach
    @Test
    void displayAfterEach() {

        System.out.print("... and this will run after each test.");

    }

    @DisplayName("Testing uppercase-method in TextProcessor")
    @Test
    void testUppercaseMethod() {

        assertEquals("HELLO",textProcessor.returnStringCapitalized("hello"));

    }

    @DisplayName("Testing lowercase-method in TextProcessor")
    @Test
    void returnStringLowercase() {

        assertEquals("lowercase", textProcessor.returnStringLowercase("LOWERCASE"));

    }

    @DisplayName("(x5) Testing method returnStringReversed in TextProcessor class")
    @RepeatedTest(5)
    void returnStringReversed() {

        assertEquals("desrever", textProcessor.returnStringReversed("reversed") );

    }

    @DisplayName("Checks that method returnStringReversed() does not return null")
    @ParameterizedTest
    @ValueSource(strings = {"this", "should", "not", "return", "null"})
    void checkIfReturnStringReversedInputDoesNotReturnNull(String valueSource){

        assertNotNull(textProcessor.returnStringReversed(valueSource));

    }
}
