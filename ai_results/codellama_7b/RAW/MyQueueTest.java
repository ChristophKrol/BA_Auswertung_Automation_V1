import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest{


// Test Method: testIsEmptyWithEmptyQueue
@Test 
void testIsEmptyWithEmptyQueue(){
 assertTrue(new MyQueue().isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyQueue
@Test 
void testIsEmptyWithNonEmptyQueue(){
 MyQueue queue = new MyQueue();
 queue.enter(1);
 assertFalse(queue.isEmpty());
}


// Test Method: testEnterWithNull
@Test 
void testEnterWithNull(){
 MyQueue queue = new MyQueue();
 queue.enter(null);
 assertEquals(1, queue.size());
}


// Test Method: testLeaveWithEmptyQueue
@Test 
void testLeaveWithEmptyQueue(){
 MyQueue queue = new MyQueue();
 try {
     queue.leave();
 } catch (ListEmptyException e) {
     assertTrue(true);
 }
}


// Test Method: testLeaveWithNonEmptyQueue
@Test 
void testLeaveWithNonEmptyQueue(){
 MyQueue queue = new MyQueue();
 queue.enter(1);
 Object result = queue.leave();
 assertEquals(1, result);
}


// Test Method: testToString
@Test 
void testToString(){
 MyQueue queue = new MyQueue();
 queue.enter(1);
 queue.enter(2);
 assertEquals("[1, 2]", queue.toString());
}


}