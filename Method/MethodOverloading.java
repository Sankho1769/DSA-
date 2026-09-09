package Method;

import java.util.Scanner;

public class MethodOverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        System.out.print("Enter first decimal number: ");
        double decimal1 = sc.nextDouble();

        System.out.print("Enter second decimal number: ");
        double decimal2 = sc.nextDouble();

        System.out.println("\nInteger Sum: " + add(num1, num2));
        System.out.println("Decimal Sum: " + add(decimal1, decimal2));

        sc.close();
    }
}