package Class;

import java.util.Scanner;

public class ThisKeyword {

    String name;
    int age;

    ThisKeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        ThisKeyword student = new ThisKeyword(name, age);

        student.displayDetails();

        sc.close();
    }
}