import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPasswordValid = false;

        while (!isPasswordValid){
            System.out.println("Please enter password: \n" +
                    "Hint: should be min 8 characters long, should contain at least one uppercase, one lowercase and a digit");
            String password = scanner.nextLine();
            isPasswordValid = PasswordValidator.isValid(password);
        }
        scanner.close();
    }

}
