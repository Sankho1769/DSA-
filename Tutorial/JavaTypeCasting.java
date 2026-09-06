package Tutorial;

public class JavaTypeCasting {
    public static void main(String[] args) {
        // Widening casting
        int number = 10;
        double value = number;

        System.out.println("Widening: " + value);

        // Narrowing casting
        double price = 99.99;
        int convertedPrice = (int) price;

        System.out.println("Narrowing: " + convertedPrice);
    }
}