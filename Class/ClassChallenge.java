package Class;

import java.util.Scanner;

public class ClassChallenge {

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

        ClassChallenge student = new ClassChallenge();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter student age: ");
        student.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student course: ");
        student.course = sc.nextLine();

        student.displayDetails();

        sc.close();
    }
}