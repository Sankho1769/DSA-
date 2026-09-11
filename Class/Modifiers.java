package Class;

import java.util.Scanner;

public class Modifiers {

    private String name;
    private int age;

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
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

        Modifiers student = new Modifiers();

        student.setDetails(name, age);
        student.displayDetails();

        sc.close();
    }
}
