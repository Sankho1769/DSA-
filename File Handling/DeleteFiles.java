import java.io.File;
import java.util.Scanner;

public class DeleteFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name to delete: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File could not be deleted or does not exist.");
        }

        sc.close();
    }
}
