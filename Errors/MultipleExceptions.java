import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] numbers = new int[size];

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Value: " + numbers[index]);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }

        sc.close();
    }
}
