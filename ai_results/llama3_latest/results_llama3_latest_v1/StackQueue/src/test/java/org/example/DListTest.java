package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DListTest{


// Test Method: testIsEmptyWhenCreated
@Test 
void testIsEmptyWhenCreated(){
 assertEquals(true, new DList().isEmpty());
}

/*
// Test Method: testAddFirst
@Test 
void testAddFirst(){
 DList list = new DList(); list.addFirst("value1"); list.addFirst("value2"); assertEquals("value2", list.removeFirst());
}
*/

// Test Method: testRemoveFirst
@Test 
void testRemoveFirst() throws ListEmptyException {
 DList list = new DList(); list.addFirst("value1"); assertEquals("value1", list.removeFirst());
}


// Test Method: testGetLast
@Test 
void testGetLast() throws ListEmptyException {
 DList list = new DList(); list.addLast("value1"); assertEquals("value1", list.getLast());
}

/*
// Test Method: testAddLast
@Test 
void testAddLast(){
 DList list = new DList(); list.addLast("value1"); list.addLast("value2"); assertEquals("value2", list.removeLast());
}

*/
 /**
// Test Method: testRemoveLast
@Test 
void testRemoveLast() throws ListEmptyException {
 DList list = new DList(); list.addLast("value1"); assertEquals("value1", list.removeLast());
}
**/

}