package Class;

import java.util.Scanner;

public class InnerClasses {

    String name;
    int age;

    class Details {

        String course;

        void display() {
            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InnerClasses student = new InnerClasses();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter student age: ");
        student.age = sc.nextInt();
        sc.nextLine();

        Details details = student.new Details();

        System.out.print("Enter student course: ");
        details.course = sc.nextLine();

        details.display();

        sc.close();
    }
}