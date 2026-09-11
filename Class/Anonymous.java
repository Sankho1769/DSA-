package Class;

import java.util.Scanner;

interface Student {
    void displayDetails();
}

public class Anonymous {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        Student student = new Student() {

            public void displayDetails() {
                System.out.println("\nStudent Details:");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
            }
        };

        student.displayDetails();

        sc.close();
    }
}