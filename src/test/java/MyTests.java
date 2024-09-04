import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testArrayQueueBasicFunctionality() {
        Queue queue = new ArrayQueue();
        queue.enqueue(10);
        assertEquals(10, queue.peek());
        queue.enqueue(5);
        assertEquals(10, queue.peek());

        assertFalse(queue.isEmpty());

        assertEquals(10, queue.dequeue());
        assertEquals(5, queue.peek());

        assertEquals(5, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testArrayQueueExpansion() {
        Queue queue = new ArrayQueue();
        for (int i = 0; i < 200; i++) {
            queue.enqueue(i);
        }

        while (!queue.isEmpty()) {
            queue.dequeue();
        }
    }
}