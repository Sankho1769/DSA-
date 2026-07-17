public class Queuee {
    static class Queue {

        int[] arr = new int[5];
        int front = 0;
        int rear = -1;

        // Insert (Enqueue)
        void enqueue(int data) {

            if (rear == arr.length - 1) {
                System.out.println("Queue Overflow");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // Remove (Dequeue)
        int dequeue() {

            if (front > rear) {
                System.out.println("Queue Underflow");
                return -1;
            }

            int value = arr[front];
            front++;

            return value;
        }

        // Show front element
        int peek() {

            if (front > rear) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }

        // Display Queue
        void display() {

            if (front > rear) {
                System.out.println("Queue is Empty");
                return;
            }

            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue:");
        q.display();

        System.out.println("Front Element: " + q.peek());

        System.out.println("Removed: " + q.dequeue());

        System.out.println("Queue After Dequeue:");
        q.display();
    }
}

