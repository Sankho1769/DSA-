import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = sc.nextLine();

        String pattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (Pattern.matches(pattern, email)) {
            System.out.println("Valid email format.");
        } else {
            System.out.println("Invalid email format.");
        }

        sc.close();
    }
}
