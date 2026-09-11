import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AdvancedSorting {

    static class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public String toString() {
            return name + " - " + marks;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, marks));
        }

        students.sort(Comparator.comparingInt(s -> s.marks));

        System.out.println("\nSorted by marks:");
        for (Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}
