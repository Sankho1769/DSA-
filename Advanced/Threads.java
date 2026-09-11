import java.util.Scanner;

public class Threads {

    static class MessageThread extends Thread {
        private final String message;

        MessageThread(String message) {
            this.message = message;
        }

        public void run() {
            System.out.println("Thread message: " + message);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = sc.nextLine();

        MessageThread thread = new MessageThread(message);
        thread.start();
        thread.join();

        System.out.println("Main thread finished.");

        sc.close();
    }
}
