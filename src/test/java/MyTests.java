import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testArrayQueue() {
        Queue queue = new ArrayQueue();
        queue.enqueue(10);
        assertEquals(10, queue.peek());
        queue.enqueue(5);
        assertEquals(5, queue.peek());

        assertFalse(queue.isEmpty());

        assertEquals(10, queue.dequeue());
        assertEquals(5, queue.peek());

        assertEquals(5, queue.dequeue());
        assertTrue(queue.isEmpty());
    }
}