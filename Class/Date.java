package Class;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (dd-MM-yyyy): ");
        String input = sc.nextLine();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(input, formatter);

        System.out.println("\nEntered Date: " + date.format(formatter));
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonthValue());
        System.out.println("Day: " + date.getDayOfMonth());

        sc.close();
    }
}