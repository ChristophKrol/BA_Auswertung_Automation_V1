import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest{


// Test Method: testIsEmptyWithEmptyQueue
@Test 
void testIsEmptyWithEmptyQueue(){
 assertTrue(queue.isEmpty());
}


// Test Method: testEnterAndLeaveWithSingleElement
@Test 
void testEnterAndLeaveWithSingleElement(){
 queue.enter(item);
 assertFalse(queue.isEmpty());
 Object leave = queue.leave();
 assertEquals(item, leave);
}


// Test Method: testEnterAndLeaveWithMultipleElements
@Test 
void testEnterAndLeaveWithMultipleElements(){
 queue.enter(item1);
 queue.enter(item2);
 assertFalse(queue.isEmpty());
 Object leave = queue.leave();
 assertEquals(item1, leave);
 leave = queue.leave();
 assertEquals(item2, leave);
}


// Test Method: testLeaveWithEmptyQueue
@Test 
void testLeaveWithEmptyQueue(){
 assertThrows(ListEmptyException.class, () -> queue.leave());
}


}