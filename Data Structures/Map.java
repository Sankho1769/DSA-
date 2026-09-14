import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.Map<String, Integer> students = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.put(name, marks);
        }

        System.out.println("Map: " + students);
        sc.close();
    }
}
