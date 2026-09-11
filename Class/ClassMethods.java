package Class;

import java.util.Scanner;

public class ClassMethods {

    String name;
    int age;

    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ClassMethods student = new ClassMethods();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter student age: ");
        student.age = sc.nextInt();

        student.displayDetails();

        sc.close();
    }
}