import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IOStreams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        ByteArrayInputStream input =
                new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int data;
        while ((data = input.read()) != -1) {
            output.write(data);
        }

        System.out.println("Output: " + output.toString(StandardCharsets.UTF_8));

        sc.close();
    }
}
