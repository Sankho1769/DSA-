import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.HashMap<String, Integer> students = new java.util.HashMap<>();

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

        System.out.println("HashMap: " + students);
        sc.close();
    }
}
