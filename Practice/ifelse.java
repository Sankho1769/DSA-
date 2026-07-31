package Practice;

public class ifelse {
    public static void main(String[] args) {
        

        // int age = 20;

        // if ( age >= 18) {
        //     System.out.println("You are eligible to vote.");
        // } else if ( age < 18) {
        //     System.out.println("You are not eligible to vote.");
        // } else {
        //     System.out.println("Enter a valid number");
        // }

        // int num = 5;

        // if (num % 2 == 0) {
        //     System.out.println("Odd");
        // } else {
        //     System.out.println("Even");
        // }

        // int num = -15;

        // if (num > 0) {
        //     System.out.println("Positive");
        // } else if (num < 0) {
        //     System.out.println("Negative");
        // } else {
        //     System.out.println("Zero");
        // }

        // int a = 25;
        // int b = 40;

        // if (a > b) {
        //     System.out.println("A is larger" + a);
        // } else if (a < b) {
        //     System.out.println("B is Larger" + b);
        // } else {
        //     System.out.println("Equal");
        // }

        int year = 2024;

        if (( year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ) {
            System.out.println("This is a leap year " + year);
        } else {
            System.out.println("This is not a leap year " + year);
        }
 

    }
}
