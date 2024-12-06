package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest{


// Test Method: testEmptyStack
@Test 
void testEmptyStack(){
    MyStack stack = new MyStack();
    assertTrue(stack.isEmpty());
}



// Test Method: testPushAndPop
@Test 
void testPushAndPop() throws ListEmptyException {
    MyStack stack = new MyStack();
    Object obj1 = 1;
    Object obj2 = 2;
    stack.push(obj1);
    stack.push(obj2);
    assertEquals(obj2, stack.pop());
    assertEquals(obj1, stack.pop());
}



// Test Method: testPopFromEmptyStack
@Test 
void testPopFromEmptyStack() throws ListEmptyException {
    MyStack stack = new MyStack();
    try{
        stack.pop();
        fail("Expected ListEmptyException");
    } catch (ListEmptyException e) {}
}


/**
// Test Method: testToString
@Test 
void testToString(){
    MyStack stack = new MyStack();
    assertEquals("", stack.toString());
}
**/


}