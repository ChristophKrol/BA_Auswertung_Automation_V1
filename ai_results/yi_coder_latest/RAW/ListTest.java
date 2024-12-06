import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest{


// Test Method: testIsEmptyWithEmptyList
@Test 
void testIsEmptyWithEmptyList() throws ListEmptyException {
  List list = new MyList();
 assertTrue(list.isEmpty());
}


// Test Method: testAddFirstAndGetFirst
@Test 
void testAddFirstAndGetFirst() throws ListEmptyException {
  List list = new MyList();
  list.addFirst("value1");
 assertEquals("value1", list.getFirst());
}


// Test Method: testAddLastAndGetLast
@Test 
void testAddLastAndGetLast() throws ListEmptyException {
  List list = new MyList();
  list.addLast("value2");
 assertEquals("value2", list.getLast());
}


// Test Method: testRemoveFirst
@Test 
void testRemoveFirst() throws ListEmptyException {
  List list = new MyList();
  list.addFirst("value3");
 assertEquals("value3", list.removeFirst());
}


// Test Method: testRemoveLast
@Test 
void testRemoveLast() throws ListEmptyException {
  List list = new MyList();
  list.addLast("value4");
 assertEquals("value4", list.removeLast());
}


// Test Method: testIsEmptyWithElementsInList
@Test 
void testIsEmptyWithElementsInList() throws ListEmptyException {
  List list = new MyList();
  list.addLast("value5");
 assertFalse(list.isEmpty());
}


}