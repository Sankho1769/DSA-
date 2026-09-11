package Class;

import java.util.Scanner;
import java.lang.Math;

public class PackagesAPI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        System.out.println("\nUsing Java API:");
        System.out.println("Square root: " + Math.sqrt(number));
        System.out.println("Square: " + Math.pow(number, 2));
        System.out.println("Absolute value: " + Math.abs(number));

        sc.close();
    }
}