import java.util.Scanner;

public class Generics {
    static class Box<T> {
        private T value;

        Box(T value) {
            this.value = value;
        }

        T getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String value = sc.nextLine();

        Box<String> box = new Box<>(value);

        System.out.println("Generic value: " + box.getValue());

        sc.close();
    }
}
