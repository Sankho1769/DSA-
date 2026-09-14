import java.util.Scanner;

public class TreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.TreeSet<Integer> numbers = new java.util.TreeSet<>();

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("TreeSet (sorted): " + numbers);
        sc.close();
    }
}
