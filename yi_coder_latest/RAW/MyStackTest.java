import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest{


// Test Method: testPushAndPopOneElement
@Test 
void testPushAndPopOneElement() throws ListEmptyException {
 MyStack stack = new MyStack();
 stack.push(5);
 assertEquals(5, stack.pop());
}


// Test Method: testPushAndPopMultipleElements
@Test 
void testPushAndPopMultipleElements() throws ListEmptyException {
 MyStack stack = new MyStack();
 stack.push(1);
 stack.push(2);
 stack.push(3);
 assertEquals(3, stack.pop());
 assertEquals(2, stack.pop());
 assertEquals(1, stack.pop());
}


// Test Method: testPopOnEmptyStack
@Test 
void testPopOnEmptyStack() throws ListEmptyException {
 MyStack stack = new MyStack();
 assertThrows(ListEmptyException.class, () -> {stack.pop();});
}


// Test Method: testIsEmptyWithPushAndPop
@Test 
void testIsEmptyWithPushAndPop() throws ListEmptyException {
 MyStack stack = new MyStack();
 assertTrue(stack.isEmpty());
 stack.push(1);
 assertFalse(stack.isEmpty());
 stack.pop();
assertTrue(stack.isEmpty());
}


}