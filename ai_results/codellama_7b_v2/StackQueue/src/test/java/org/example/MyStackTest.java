package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest{


// Test Method: testEmptyStack
@Test 
void testEmptyStack(){
 assertThrows(ListEmptyException.class, () -> { MyStack stack = new MyStack(); stack.pop(); });
}


// Test Method: testPushAndPop
@Test 
void testPushAndPop() throws ListEmptyException {
 MyStack stack = new MyStack();
 Object o1 = 1;
 Object o2 = 2;
 stack.push(o1);
 stack.push(o2);
 assertEquals(o2, stack.pop());
 assertEquals(o1, stack.pop());
}


// Test Method: testPopFromEmptyStack
@Test 
void testPopFromEmptyStack(){
 MyStack stack = new MyStack();
 assertThrows(ListEmptyException.class, () -> { stack.pop(); });
}

/*
// Test Method: testToString
@Test 
void testToString(){
 MyStack stack = new MyStack();
 assertEquals("", stack.toString());
}
*/

}