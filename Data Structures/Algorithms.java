import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Algorithms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        Collections.sort(numbers);

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        int index = Collections.binarySearch(numbers, target);

        System.out.println("Sorted list: " + numbers);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
