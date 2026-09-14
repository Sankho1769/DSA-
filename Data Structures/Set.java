import java.util.HashSet;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.Set<String> names = new HashSet<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("Set: " + names);
        sc.close();
    }
}
