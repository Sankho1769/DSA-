import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try (java.io.FileInputStream input = new java.io.FileInputStream(fileName)) {
            int data;
            System.out.println("\nFile Content:");

            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
