import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.List<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("List: " + names);
        sc.close();
    }
}
