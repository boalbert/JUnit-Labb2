import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TextProcessorTest {

    private final TextProcessor textProcessor = new TextProcessor();

    @Test
    @DisplayName("Testing uppercase-method in TextProcessor")
    void testUppercaseMethod() {
       assertEquals("HELLO",textProcessor.returnStringCapitalized("hello"));
    }

    @Test
    @DisplayName("Testing lowercase-method in TextProcessor")
    void returnStringLowercase() {
        assertEquals("lowercase", textProcessor.returnStringLowercase("LOWERCASE"));
    }

    @RepeatedTest(5)
    @DisplayName("(x5) Testing method returnStringReversed in TextProcessor class")
    void returnStringReversed() {
        assertEquals("desrever", textProcessor.returnStringReversed("reversed") );
    }

    @ParameterizedTest
    @ValueSource(strings = {"this", "should", "not", "be", "null"})
    void checkIfReturnStringReversedInputDoesNotReturnNull(String valueSource){
        assertNotNull(textProcessor.returnStringReversed(valueSource));
        System.out.println("Reversed String: " + textProcessor.returnStringReversed(valueSource));
    }

    @BeforeEach
    @Test
    void displayBeforeEach() {
        System.out.print("This will run before each test: ");
    }

    @AfterEach
    @Test
    void displayAfterEach() {
        System.out.print("... and this will run after each test.");
    }
}
