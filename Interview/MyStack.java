package Interview;

public class MyStack<T> {

    private Object[] elements;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public MyStack() {
        this(DEFAULT_CAPACITY);
    }

    public MyStack(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException(
                "Capacity must be greater than 0"
            );
        }

        elements = new Object[initialCapacity];
        size = 0;
    }

    // Adds an element to the top of the stack
    public void push(T value) {
        ensureCapacity();

        elements[size] = value;
        size++;
    }

    // Removes and returns the top element
    @SuppressWarnings("unchecked")
    public T pop() {

        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        size--;

        T value = (T) elements[size];

        // Prevent unnecessary object references
        elements[size] = null;

        return value;
    }

    // Returns the top element without removing it
    @SuppressWarnings("unchecked")
    public T peek() {

        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return (T) elements[size - 1];
    }

    // Returns number of elements
    public int size() {
        return size;
    }

    // Checks whether stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Doubles the array size when required
    private void ensureCapacity() {

        if (size < elements.length) {
            return;
        }

        int newCapacity = elements.length * 2;

        Object[] newElements = new Object[newCapacity];

        System.arraycopy(
            elements,
            0,
            newElements,
            0,
            elements.length
        );

        elements = newElements;
    }

    // Prints stack from top to bottom
    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack:");
        stack.display();

        System.out.println("\nTop element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("Popped: " + stack.pop());

        System.out.println("\nStack after popping:");

        stack.display();

        System.out.println("\nSize: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());
    }
}