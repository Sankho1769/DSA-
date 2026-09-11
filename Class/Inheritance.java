package Class;

import java.util.Scanner;

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Inheritance extends Student {

    String course;

    Inheritance(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void displayDetails() {
        displayStudent();
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

        Inheritance student = new Inheritance(name, age, course);

        System.out.println("\nStudent Details:");
        student.displayDetails();

        sc.close();
    }
}