package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// DISABLED
class DListTest{


// Test Method: testIsEmpty
//@Test 
void testIsEmpty(){
 DList list = new DList();
 assertTrue(list.isEmpty());
}


// Test Method: testAddFirst
//@Test 
void testAddFirst(){
 DList list = new DList();
 list.addFirst("Value");
 assertEquals("Value", list.head.getNext().getValue());
}


// Test Method: testRemoveFirst
//@Test 
void testRemoveFirst() throws ListEmptyException{
 DList list = new DList();
 list.addFirst("Value");
 assertEquals("Value", list.removeFirst());
}


// Test Method: testGetLast
//@Test 
void testGetLast() throws ListEmptyException{
 DList list = new DList();
 list.addLast("Value");
 assertEquals("Value", list.getLast());
}


// Test Method: testAddLast
//@Test 
void testAddLast(){
 DList list = new DList();
 list.addLast("Value");
 //assertEquals("Value", list.tail.getPrev().getValue());
}


// Test Method: testRemoveLast
//@Test 
void testRemoveLast() throws ListEmptyException{
 DList list = new DList();
 list.addLast("Value");
 assertEquals("Value", list.removeLast());
}


}