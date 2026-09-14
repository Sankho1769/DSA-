import java.util.ArrayList;
import java.util.Scanner;

public class Iterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        java.util.Iterator<String> iterator = names.iterator();

        System.out.println("\nUsing Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        sc.close();
    }
}
