import java.util.Scanner;

public class Debugging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Input value: " + number);
        System.out.println("Double value: " + (number * 2));
        System.out.println("Square value: " + (number * number));

        sc.close();
    }
}
