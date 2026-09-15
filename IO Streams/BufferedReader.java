import java.io.StringReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        try (java.io.BufferedReader reader =
                     new java.io.BufferedReader(new StringReader(text))) {
            System.out.println("Read using BufferedReader: " + reader.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
