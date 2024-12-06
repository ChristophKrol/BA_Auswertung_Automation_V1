import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest{


// Test Method: testIsEmptyWithEmptyQueue
@Test 
void testIsEmptyWithEmptyQueue() throws Exception{
 Queue queue = new QueueImpl(); assertTrue(queue.isEmpty());}


// Test Method: testIsEmptyWithNonEmptyQueue
@Test 
void testIsEmptyWithNonEmptyQueue() throws Exception{
 Queue queue = new QueueImpl(); queue.enter(new Object()); assertFalse(queue.isEmpty());}


// Test Method: testEnterAndLeave
@Test 
void testEnterAndLeave() throws Exception{
 Queue queue = new QueueImpl(); Object obj = new Object(); queue.enter(obj); assertEquals(obj, queue.leave());}


// Test Method: testLeaveWithEmptyQueue
@Test (expected=ListEmptyException.class) 
void testLeaveWithEmptyQueue() throws Exception{
 Queue queue = new QueueImpl(); queue.leave();}


}