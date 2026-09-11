package Class;

import java.util.Scanner;

public class Encapsulation {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Encapsulation student = new Encapsulation();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        student.setName(name);
        student.setAge(age);

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        sc.close();
    }
}