package Class;

import java.util.Scanner;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class SuperKeyword extends Student {

    String course;

    SuperKeyword(String name, String course) {
        super(name);
        this.course = course;
    }

    void displayDetails() {
        super.display();
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        SuperKeyword student = new SuperKeyword(name, course);

        System.out.println("\nStudent Details:");
        student.displayDetails();

        sc.close();
    }
}
