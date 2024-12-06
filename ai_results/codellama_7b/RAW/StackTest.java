import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest{


// Test Method: testIsEmptyWithEmptyStack
@Test
void testIsEmptyWithEmptyStack(){
assertTrue(new Stack().isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyStack
@Test
void testIsEmptyWithNonEmptyStack(){
Stack stack = new Stack();
stack.push("item");
assertFalse(stack.isEmpty());
}


// Test Method: testPushWithNullValue
@Test(expected = NullPointerException.class)
void testPushWithNullValue(){
Stack stack = new Stack();
stack.push(null);
}


// Test Method: testPopWithEmptyStack
@Test(expected = ListEmptyException.class)
void testPopWithEmptyStack(){
Stack stack = new Stack();
stack.pop();
}


// Test Method: testPopWithNonEmptyStack
@Test
void testPopWithNonEmptyStack(){
Stack stack = new Stack();
stack.push("item");
assertEquals("item", stack.pop());
}


}