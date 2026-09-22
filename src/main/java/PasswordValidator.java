public final class PasswordValidator {

    public static boolean hasMinLength(String password, int min) {
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
//    public static boolean containsUpperAndLower(String password);
//    public static boolean isCommonPassword(String password); // small internal list
//    // Bonus:
//    public static boolean containsSpecialChar(String password, String allowed);
//    // Optional:
//    public static boolean isValid(String password); // uses the checks above
}
