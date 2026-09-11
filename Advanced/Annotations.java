import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Scanner;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String value();
}

public class Annotations {

    @Info("Student information method")
    static void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        display(name, age);

        Method method = Annotations.class.getDeclaredMethod(
                "display", String.class, int.class);

        Info info = method.getAnnotation(Info.class);
        System.out.println("Annotation: " + info.value());

        sc.close();
    }
}
