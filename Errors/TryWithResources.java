import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String text = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new StringReader(text))) {
            System.out.println("Read text: " + reader.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
