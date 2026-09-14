import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("Original: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));

        sc.close();
    }
}
