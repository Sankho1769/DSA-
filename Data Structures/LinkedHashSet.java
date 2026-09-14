import java.util.Scanner;

public class LinkedHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.LinkedHashSet<String> names = new java.util.LinkedHashSet<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("LinkedHashSet: " + names);
        sc.close();
    }
}
