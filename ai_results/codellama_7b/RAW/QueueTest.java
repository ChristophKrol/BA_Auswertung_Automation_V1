import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest{


// Test Method: isEmpty_emptyQueue
@Test
void isEmpty_emptyQueue(){
assertTrue(new Queue().isEmpty());
}


// Test Method: isEmpty_nonEmptyQueue
@Test
void isEmpty_nonEmptyQueue(){
Queue queue = new Queue();
queue.enter("test");
assertFalse(queue.isEmpty());
}


// Test Method: leave_emptyQueue
@Test(expected = ListEmptyException.class)
void leave_emptyQueue(){
new Queue().leave();
}


// Test Method: leave_nonEmptyQueue
@Test
void leave_nonEmptyQueue(){
Queue queue = new Queue();
queue.enter("test");
assertEquals("test", queue.leave());
}


}