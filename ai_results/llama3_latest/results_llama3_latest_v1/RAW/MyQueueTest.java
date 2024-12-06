import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest{


// Test Method: testIsEmptyOnInit
@Test
void testIsEmptyOnInit(){
    MyQueue queue = new MyQueue();
    assertTrue(queue.isEmpty());
}


// Test Method: testEnterAndLeave
@Test
void testEnterAndLeave() throws ListEmptyException {
    MyQueue queue = new MyQueue();
    Object obj1 = "obj1";
    Object obj2 = "obj2";
    queue.enter(obj1);
    queue.enter(obj2);
    assertEquals(obj1, queue.leave());
    assertEquals(obj2, queue.leave());
}


// Test Method: testLeaveOnEmptyQueue
@Test
void testLeaveOnEmptyQueue() {
    MyQueue queue = new MyQueue();
    try {
        queue.leave();
        fail("Expected ListEmptyException");
    } catch (ListEmptyException e) {}
}


// Test Method: testToString
@Test
void testToString(){
    MyQueue queue = new MyQueue();
    Object obj1 = "obj1";
    Object obj2 = "obj2";
    queue.enter(obj1);
    queue.enter(obj2);
    assertEquals("[obj1, obj2]", queue.toString());
}


}