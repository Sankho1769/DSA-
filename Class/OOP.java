package Class;

import java.util.Scanner;

public class OOP {

    String name;
    int age;

    void displayDetails() {
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

        OOP student = new OOP();

        student.name = name;
        student.age = age;

        student.displayDetails();

        sc.close();
    }
}