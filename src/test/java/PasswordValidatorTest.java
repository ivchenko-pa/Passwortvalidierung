import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void hasMinLength_shoudBeTrue_when8charsProvidedAndMinIs8() {
        String input = "abcdefgh";
        int min = 8;
        boolean output = PasswordValidator.hasMinLength(input, min);
        assertTrue(output);
    }

    @Test
    void hasMinLength_shoudBeTrue_when9charsProvidedAndMinIs8() {
        String input = "abcdefghi";
        int min = 8;
        boolean output = PasswordValidator.hasMinLength(input, min);
        assertTrue(output);
    }

    @Test
    void hasMinLength_shoudBeFalse_when7charsProvidedAndMinIs8() {
        String input = "abcdefg";
        int min = 8;
        boolean output = PasswordValidator.hasMinLength(input, min);
        assertFalse(output);
    }
}