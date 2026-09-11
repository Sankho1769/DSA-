package Class;

import java.util.Scanner;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter animal (dog/cat): ");
        String choice = sc.nextLine();

        Animal animal;

        if (choice.equalsIgnoreCase("dog")) {
            animal = new Dog();
        } else if (choice.equalsIgnoreCase("cat")) {
            animal = new Cat();
        } else {
            System.out.println("Invalid animal.");
            sc.close();
            return;
        }

        animal.sound();

        sc.close();
    }
}
