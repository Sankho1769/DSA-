package Class;

import java.util.Scanner;

public class Annotations {

    static void displayDetails(String name, int age) {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        displayDetails(name, age);

        sc.close();
    }
}