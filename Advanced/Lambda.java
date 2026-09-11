import java.util.Scanner;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Predicate<Integer> isEven = n -> n % 2 == 0;

        if (isEven.test(number)) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        sc.close();
    }
}
