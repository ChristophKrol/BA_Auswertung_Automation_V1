import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest{


// Test Method: testIsEmptyWithEmptyQueue
@Test
void testIsEmptyWithEmptyQueue() {
 assertTrue(queue.isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyQueue
@Test
void testIsEmptyWithNonEmptyQueue() {
 queue.enter(new Object());
 assertFalse(queue.isEmpty());
}


// Test Method: testEnterMethod
@Test
void testEnterMethod() {
 queue.enter(new Object());
 assertEquals(new Object(), queue.leave());
}


// Test Method: testLeaveMethodWithEmptyQueue
@Test
void testLeaveMethodWithEmptyQueue() {
 assertThrows(ListEmptyException.class, () -> queue.leave());
}


// Test Method: testLeaveMethodWithNonEmptyQueue
@Test
void testLeaveMethodWithNonEmptyQueue() {
 queue.enter(new Object());
 assertEquals(new Object(), queue.leave());
}


}