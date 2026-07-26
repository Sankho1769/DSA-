public class LinkedListDemo {

    // Node Class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List Class
    static class LinkedList {
        Node head;
 
        // Insert at Beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Insert at End
        public void insertAtEnd(int data) { 
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        // Delete from Beginning
        public void deleteBeginning() {
            if (head == null) {
                System.out.println("List is Empty");
                return;
            }

            head = head.next;
        }

        // Delete from End
        public void deleteEnd() {
            if (head == null) {
                System.out.println("List is Empty");
                return;
            }

            if (head.next == null) {
                head = null;
                return;
            }

            Node current = head;

            while (current.next.next != null) {
                current = current.next;
            }

            current.next = null;
        }

        // Search
        public boolean search(int key) {
            Node current = head;

            while (current != null) {
                if (current.data == key) {
                    return true;
                }
                current = current.next;
            }

            return false;
        }

        // Display
        public void display() {
            Node current = head;

            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }

            System.out.println("NULL");
        }
    }

    // Main Method
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Insert at End
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Original List:");
        list.display();

        // Insert at Beginning
        list.insertAtBeginning(5);

        System.out.println("\nAfter Insert at Beginning:");
        list.display();

        // Insert at End
        list.insertAtEnd(40);

        System.out.println("\nAfter Insert at End:");
        list.display();

        // Delete Beginning
        list.deleteBeginning();

        System.out.println("\nAfter Delete Beginning:");
        list.display();

        // Delete End
        list.deleteEnd();

        System.out.println("\nAfter Delete End:");
        list.display();

        // Search
        System.out.println("\nSearch 20: " + list.search(20));
        System.out.println("Search 100: " + list.search(100));
    }
}