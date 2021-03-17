package QueueTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoundedArrayQueueTest {

    private QueueADT<String> queue;

    @BeforeEach
    public void set()
    {
        queue = new BoundedArrayQueue<String>();
    }

    @Test
    public void addoneElementInList(){
        queue.enqueue("Apple");
        assertTrue(queue.contains("Apple"));
    }

    @Test
    public void addmultipleelementsinthelist()
    {
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        assertEquals(3, queue.size());
    }

    @Test
    public void exception()
    {
        assertThrows(IllegalArgumentException.class, () -> queue.first());
    }
}