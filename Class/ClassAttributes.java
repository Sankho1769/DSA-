package Class;

import java.util.Scanner;

public class ClassAttributes {

    String name;
    int age;
    String course;

    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student course: ");
        String course = sc.nextLine();

        ClassAttributes student = new ClassAttributes();

        student.name = name;
        student.age = age;
        student.course = course;

        student.displayDetails();

        sc.close();
    }
}