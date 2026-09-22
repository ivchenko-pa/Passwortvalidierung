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
        String[] notAllowedPasswords = {"helloWorld2000", "SuperJava15", "Neuefische2026"};

        for (String notAllowedPassword : notAllowedPasswords){
            if (notAllowedPassword.equalsIgnoreCase(password)){
                System.out.print("Your password belongs to common passwords list: ");
                System.out.println(Arrays.toString(notAllowedPasswords));
                return true;
            }
        }
        return false;
    }

//    // Bonus:
//    public static boolean containsSpecialChar(String password, String allowed);
//    // Optional:
    public static boolean isValid(String password){
        if ( hasMinLength(password, 8) && containsDigit(password) && containsLower(password) && containsUpper(password) && !isCommonPassword(password)) {
            System.out.println("Password accepted");
            return true;
        }
        System.out.println("Password not accepted.");
        return false;
    }
}
