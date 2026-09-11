package Class;

import java.util.Scanner;

interface Student {

    void displayDetails();
}

public class Interface implements Student {

    String name;
    int age;
    String course;

    Interface(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
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

        Interface student = new Interface(name, age, course);

        student.displayDetails();

        sc.close();
    }
}