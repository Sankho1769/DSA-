import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileOutputStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter text to write: ");
        String text = sc.nextLine();

        try (java.io.FileOutputStream output =
                     new java.io.FileOutputStream(fileName)) {
            output.write(text.getBytes(StandardCharsets.UTF_8));
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
