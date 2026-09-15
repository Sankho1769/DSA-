import java.io.StringWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        try {
            StringWriter storage = new StringWriter();

            try (java.io.BufferedWriter writer =
                         new java.io.BufferedWriter(storage)) {
                writer.write(text);
            }

            System.out.println("Written using BufferedWriter: " + storage);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
