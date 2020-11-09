import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
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
    @ValueSource(strings = {"hello", "are", "you", "there"})
    void checkIfReturnStringReversedInputDoesNotReturnNull(String valuesource){
        assertNotNull(textProcessor.returnStringReversed(valuesource));
    }
}
