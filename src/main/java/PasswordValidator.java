public final class PasswordValidator {

    public static boolean hasMinLength(String password, int min) {
        return password.length() >= min;
    }

//    public static boolean containsDigit(String password);
//    public static boolean containsUpperAndLower(String password);
//    public static boolean isCommonPassword(String password); // small internal list
//    // Bonus:
//    public static boolean containsSpecialChar(String password, String allowed);
//    // Optional:
//    public static boolean isValid(String password); // uses the checks above
}
