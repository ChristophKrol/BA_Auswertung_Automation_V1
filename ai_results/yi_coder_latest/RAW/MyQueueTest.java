import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest{


// Test Method: testIsEmptyWithEmptyQueue
@Test 
void testIsEmptyWithEmptyQueue() throws ListEmptyException {
 MyQueue queue = new MyQueue();
 assertTrue(queue.isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyQueue
@Test 
void testIsEmptyWithNonEmptyQueue() throws ListEmptyException {
 MyQueue queue = new MyQueue();
 queue.enter(1);
 assertFalse(queue.isEmpty());
}


// Test Method: testEnterAndLeave
@Test 
void testEnterAndLeave() throws ListEmptyException {
 MyQueue queue = new MyQueue();
 queue.enter(1);
 queue.enter(2);
 assertEquals(1, queue.leave());
 assertEquals(2, queue.leave());
}


// Test Method: testLeaveOnEmptyQueue
@Test (expected = ListEmptyException.class)
void testLeaveOnEmptyQueue() throws ListEmptyException {
 MyQueue queue = new MyQueue();
 queue.leave();
}


}