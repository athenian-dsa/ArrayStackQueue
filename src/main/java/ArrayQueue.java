public class ArrayQueue implements Queue{
    // You will need some instance variables here
    // However, it will be up to you to come up with these instance variables
    // Look at the ArrayStack we did in class for inspiration

    // Constructor
    public ArrayQueue() {
        // YOUR CODE HERE
    }

    // Enqueues a value to the end of the queue
    public void enqueue(int data) {
        // YOUR CODE HERE
    }

    // Dequeues a value from the front of the queue
    public int dequeue() {
        // YOUR CODE HERE
        return -1;
    }

    // Returns the data value at the top of the queue without dequeuing
    public int peek() {
        // YOUR CODE HERE
        return -1;
    }

    // Checks whether or not the queue is empty
    public boolean isEmpty() {
        // YOUR CODE HERE
        return true;
    }

    public static void main(String[] args) {
        // --------------------------
        // Test 1: Basic Queue Functionality
        // --------------------------
        System.out.println("-------------------");
        System.out.println("Test 1: Basic Queue Functionality");
        System.out.println("Expected:");
        System.out.println("10");
        System.out.println("10");
        System.out.println("10");
        System.out.println("5");

        System.out.println("\nGot:");
        // Add 10 and 5 to queue and peek twice
        Queue queue = new ArrayQueue();
        queue.enqueue(10);
        System.out.println(queue.peek()); // 10
        queue.enqueue(5);
        System.out.println(queue.peek()); // 10

        // Remove 10 from the queue and peek again
        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.peek()); // 5

        // --------------------------
        // Test 2: More Queue Testing
        // --------------------------
        System.out.println("-------------------");
        System.out.println("Test 2: More Queue Testing");
        System.out.println("Expected:");
        System.out.println("10");
        System.out.println("5");
        System.out.println("2");
        System.out.println("7");

        System.out.println("\nGot:");
        // Add 10, 5, 2 and 7
        queue = new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(7);

        // Dequeue the queue completely
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
        // 10
        // 5
        // 2
        // 7

        // --------------------------
        // Test 3: Larger Queue
        // --------------------------
        System.out.println("-------------------");
        System.out.println("Test 3: Larger");
        System.out.println("Expected:");
        System.out.println("This test should print out all numbers between 0 and 199");

        System.out.println("\nGot:");
        for (int i = 0; i < 200; i++) {
            queue.enqueue(i);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
