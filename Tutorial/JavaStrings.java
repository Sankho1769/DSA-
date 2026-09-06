package Tutorial;

public class JavaStrings {
    public static void main(String[] args) {
        String text = "Hello Java";

        System.out.println(text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Character at index 0: " + text.charAt(0));
    }
}