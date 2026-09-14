import java.util.ArrayList;
import java.util.Scanner;

public class DataStructures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("Elements: " + numbers);
        sc.close();
    }
}
