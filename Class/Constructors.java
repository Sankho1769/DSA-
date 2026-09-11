package Class;

import java.util.Scanner;

public class Constructors {

    String name;
    int age;

    Constructors(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

        Constructors student = new Constructors(name, age);

        student.displayDetails();

        sc.close();
    }
}