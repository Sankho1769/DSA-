import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter text to write: ");
        String text = sc.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
