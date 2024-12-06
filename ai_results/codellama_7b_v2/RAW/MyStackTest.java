import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest{


// Test Method: testIsEmptyWithEmptyStack
@Test 
void testIsEmptyWithEmptyStack(){
 assertTrue(new MyStack().isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyStack
@Test 
void testIsEmptyWithNonEmptyStack(){
 MyStack stack = new MyStack();
 stack.push(1);
 assertFalse(stack.isEmpty());
}


// Test Method: testPushWithNullValue
@Test 
void testPushWithNullValue(){
 MyStack stack = new MyStack();
 stack.push(null);
 assertEquals(1, stack.size());
}


// Test Method: testPopWithEmptyStack
@Test 
void testPopWithEmptyStack(){
 MyStack stack = new MyStack();
 assertThrows(ListEmptyException.class, () -> stack.pop());
}


// Test Method: testPopWithNonEmptyStack
@Test 
void testPopWithNonEmptyStack(){
 MyStack stack = new MyStack();
 stack.push(1);
 assertEquals(1, stack.pop());
}


// Test Method: testToStringWithEmptyStack
@Test 
void testToStringWithEmptyStack(){
 MyStack stack = new MyStack();
 assertEquals("[]", stack.toString());
}


// Test Method: testToStringWithNonEmptyStack
@Test 
void testToStringWithNonEmptyStack(){
 MyStack stack = new MyStack();
 stack.push(1);
 assertEquals("[1]", stack.toString());
}


}