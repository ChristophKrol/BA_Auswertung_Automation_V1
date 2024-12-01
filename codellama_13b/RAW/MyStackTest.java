import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest{


// Test Method: testIsEmpty
@Test 
void testIsEmpty(){
 assertTrue(myStack.isEmpty());
}


// Test Method: testPush
@Test 
void testPush(){
 myStack.push(1);
 assertEquals(1, myStack.top.head.getValue());
}


// Test Method: testPop
@Test 
void testPop() throws ListEmptyException {
 myStack.push(1);
 assertEquals(1, myStack.pop());
}


}