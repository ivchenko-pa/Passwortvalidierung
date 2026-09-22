import java.util.Arrays;
import java.util.Objects;

public final class PasswordValidator {

    public static boolean hasMinLength(String password, int min) {
        if (Objects.isNull(password)) {
            return false;
        }
        return password.length() >= min;
    }

    public static boolean containsDigit(String password){
        char[] chars = password.toCharArray();
        for(char c: chars){
            if (c >=0x30 && c <= 0x39){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpper(String password){
        char[] chars = password.toCharArray();
        for(char c: chars){
            if (c >=0x41 && c <= 0x5A){
                return true;
            }
        }
        return false;
    }

    public static boolean containsLower(String password){
        char[] chars = password.toCharArray();
        for(char c: chars){
            if (c >=0x61 && c <= 0x7A){
                return true;
            }
        }
        return false;
    }

    public static boolean isCommonPassword(String password){
        String[] notAllowedPasswords = {"hello", "java", "neuefische"};

        for (String notAllowedPassword : notAllowedPasswords){
            if (notAllowedPassword.equalsIgnoreCase(password)){
                return true;
            }
        }
        return false;
    }

//    // Bonus:
//    public static boolean containsSpecialChar(String password, String allowed);
//    // Optional:
//    public static boolean isValid(String password); // uses the checks above
}
