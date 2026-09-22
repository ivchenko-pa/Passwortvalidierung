import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void hasMinLength_shoudBeTrue_whenEqualsMinLimit() {
        String input = "abcdefgh";
        int min = 8;
        boolean output = PasswordValidator.hasMinLength(input, min);
        assertTrue(output);
    }

    @Test
    void hasMinLength_shoudBeTrue_whenAboveMinLimit() {
        String input = "abcdefghi";
        int min = 8;
        boolean output = PasswordValidator.hasMinLength(input, min);
        assertTrue(output);
    }

    @Test
    void hasMinLength_shoudBeFalse_whenBelowMinLimit() {
        String input = "abcdefg";
        int min = 8;
        boolean output = PasswordValidator.hasMinLength(input, min);
        assertFalse(output);
    }

    @Test
    void hasMinLength_shoudBeFalse_whenEmptyStringInput() {
        String input = "";
        int min = 8;
        boolean output = PasswordValidator.hasMinLength(input, min);
        assertFalse(output);
    }

    @Test
    void hasMinLength_shoudBeFalse_whenNullInput() {
        String input = null;
        int min = 8;
        boolean output = PasswordValidator.hasMinLength(input, min);
        assertFalse(output);
    }

    @Test
    void containsDigit_shouldBeTrue_whenContainsDigit() {
        String input = "8";
        boolean output = PasswordValidator.containsDigit(input);
        assertTrue(output);
    }

    @Test
    void containsDigit_shouldBeFalse_whenNoDigit() {
        String input = "a";
        boolean output = PasswordValidator.containsDigit(input);
        assertFalse(output);
    }

    @Test
    void containsDigit_shouldBeTrue_whenFirstCharIsDigit() {
        String input = "5a";
        boolean output = PasswordValidator.containsDigit(input);
        assertTrue(output);
    }

    @Test
    void containsDigit_shouldBeTrue_whenLastCharIsDigit() {
        String input = "a5";
        boolean output = PasswordValidator.containsDigit(input);
        assertTrue(output);
    }
}