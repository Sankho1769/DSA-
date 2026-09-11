import java.util.Scanner;

public class WrapperClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        Integer wrapped = number;
        int unwrapped = wrapped;

        System.out.println("Primitive value: " + number);
        System.out.println("Wrapper object: " + wrapped);
        System.out.println("Unwrapped value: " + unwrapped);

        sc.close();
    }
}
