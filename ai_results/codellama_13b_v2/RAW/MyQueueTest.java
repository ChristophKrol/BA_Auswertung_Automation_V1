import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest{


// Test Method: testIsEmptyWithEmptyQueue
@Test
void testIsEmptyWithEmptyQueue() {
 assertTrue(queue.isEmpty());
}


// Test Method: testEnterAndLeave
@Test
void testEnterAndLeave() {
 queue.enter("item1");
 queue.enter("item2");
 assertEquals(queue.leave(), "item1");
 assertEquals(queue.leave(), "item2");
}


// Test Method: testLeaveWithEmptyQueue
@Test
void testLeaveWithEmptyQueue() {
 try {
 queue.leave();
 assertTrue(false);
 } catch (ListEmptyException e) {
 assertTrue(true);
 }
}


// Test Method: testToString
@Test
void testToString() {
 queue.enter("item1");
 queue.enter("item2");
 assertEquals(queue.toString(), "["item1", "item2"]");
}


}