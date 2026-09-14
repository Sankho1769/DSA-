import java.util.Scanner;

public class HashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.HashSet<Integer> numbers = new java.util.HashSet<>();

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("HashSet: " + numbers);
        sc.close();
    }
}
