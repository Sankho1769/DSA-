import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            System.out.println("\nFile Content:");

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        sc.close();
    }
}
