package Class;

import java.util.Scanner;

public class Enum {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day: ");
        String input = sc.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(input);

            System.out.println("Selected day: " + day);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day.");
        }

        sc.close();
    }
}