import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest{


// Test Method: testIsEmptyWithEmptyQueue
@Test
void testIsEmptyWithEmptyQueue() {
 assertTrue(myQueue.isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyQueue
@Test
void testIsEmptyWithNonEmptyQueue() {
 myQueue.enter("hello");
 assertFalse(myQueue.isEmpty());
}


// Test Method: testEnterMethod
@Test
void testEnterMethod() {
 myQueue.enter("hello");
 assertEquals("hello", myQueue.toString());
}


// Test Method: testLeaveMethodWithEmptyQueue
@Test
void testLeaveMethodWithEmptyQueue() {
 assertThrows(ListEmptyException.class, () -> myQueue.leave());
}


// Test Method: testLeaveMethodWithNonEmptyQueue
@Test
void testLeaveMethodWithNonEmptyQueue() {
 myQueue.enter("hello");
 String element = myQueue.leave();
 assertEquals("hello", element);
 assertTrue(myQueue.isEmpty());
}


}