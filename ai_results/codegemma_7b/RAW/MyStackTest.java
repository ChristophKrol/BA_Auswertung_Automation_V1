import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest{


// Test Method: testIsEmptyWhenCreated
@Test
void testIsEmptyWhenCreated() {
 assertTrue(myStack.isEmpty());
}


// Test Method: testPushAndPop
@Test
void testPushAndPop() throws ListEmptyException {
 myStack.push(item);
 assertFalse(myStack.isEmpty());
 assertEquals(item, myStack.pop());
}


// Test Method: testPopWhenEmptyThrowsException
@Test
void testPopWhenEmptyThrowsException() {
 assertThrows(ListEmptyException.class, () -> myStack.pop());
}


// Test Method: testToString
@Test
void testToString() {
 myStack.push(item);
 assertEquals("[" + item.toString() + "]", myStack.toString());
}


}