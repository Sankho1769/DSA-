package Method;

import java.util.Scanner;

public class Recursion {

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            System.out.println("Factorial: " + factorial(number));
        }

        sc.close();
    }
}