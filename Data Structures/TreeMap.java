import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.TreeMap<String, Integer> students = new java.util.TreeMap<>();

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

        System.out.println("TreeMap (sorted by key): " + students);
        sc.close();
    }
}
