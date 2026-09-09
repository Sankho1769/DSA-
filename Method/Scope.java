package Method;

import java.util.Scanner;

public class Scope {

    static int classNumber;

    static void display() {
        int localNumber;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        localNumber = sc.nextInt();

        classNumber = localNumber * 2;

        System.out.println("\nLocal variable: " + localNumber);
        System.out.println("Class variable: " + classNumber);

        sc.close();
    }

    public static void main(String[] args) {
        display();
    }
}