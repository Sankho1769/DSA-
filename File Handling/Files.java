import java.io.File;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        File file = new File(path);

        System.out.println("Exists: " + file.exists());
        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getPath());

        sc.close();
    }
}
