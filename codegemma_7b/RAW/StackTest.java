import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest{


// Test Method: testIsEmptyWithEmptyStack
@Test
void testIsEmptyWithEmptyStack() {
 assertTrue(stack.isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyStack
@Test
void testIsEmptyWithNonEmptyStack() {
 stack.push(new Object());
 assertFalse(stack.isEmpty());
}


// Test Method: testPushWithNullObject
@Test
void testPushWithNullObject() {
 stack.push(null);
}


// Test Method: testPopWithEmptyStack
@Test
void testPopWithEmptyStack() {
 assertThrows(ListEmptyException.class, () -> stack.pop());
}


// Test Method: testPopWithNonEmptyStack
@Test
void testPopWithNonEmptyStack() {
 stack.push(new Object());
 Object poppedObject = stack.pop();
 assertNotNull(poppedObject);
}


}