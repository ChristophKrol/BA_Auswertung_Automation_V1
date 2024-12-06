import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest{


// Test Method: testIsEmptyWithNewStack
@Test 
void testIsEmptyWithNewStack() throws ListEmptyException{
 Stack stack = new MyStack();
 assertTrue(stack.isEmpty());
}


// Test Method: testPushAndPopOneElement
@Test 
void testPushAndPopOneElement() throws ListEmptyException{
 Stack stack = new MyStack();
 Object o = new Object();
 stack.push(o);
 assertEquals(o, stack.pop());
}


// Test Method: testPushAndPopMultipleElements
@Test 
void testPushAndPopMultipleElements() throws ListEmptyException{
 Stack stack = new MyStack();
 Object o1 = new Object();
 Object o2 = new Object();
 Object o3 = new Object();
 stack.push(o1);
 stack.push(o2);
 stack.push(o3);
 assertEquals(o3, stack.pop());
 assertEquals(o2, stack.pop());
 assertEquals(o1, stack.pop());
}


// Test Method: testPopOnEmptyStack
@Test (expected = ListEmptyException.class)
void testPopOnEmptyStack() throws ListEmptyException{
 Stack stack = new MyStack();
 stack.pop();
}


}