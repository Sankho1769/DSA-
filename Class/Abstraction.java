package Class;

import java.util.Scanner;

abstract class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayCourse();

    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Abstraction extends Student {

    String course;

    Abstraction(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    void displayCourse() {
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

        Abstraction student = new Abstraction(name, age, course);

        student.displayDetails();
        student.displayCourse();

        sc.close();
    }
}