import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DListTest{


// Test Method: testAddFirstWithEmptyList
@Test 
void testAddFirstWithEmptyList(){
 DList list = new DList();
 assertTrue(list.isEmpty());
 list.addFirst("value");
 assertFalse(list.isEmpty());
}


// Test Method: testAddFirstWithNonEmptyList
@Test 
void testAddFirstWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1");
 assertFalse(list.isEmpty());
 list.addFirst("value2");
 assertEquals("[value2, value1]", list.toString());
}


// Test Method: testRemoveFirstWithEmptyList
@Test 
void testRemoveFirstWithEmptyList(){
 DList list = new DList();
 assertThrows(ListEmptyException.class, () -> {list.removeFirst();});
}


// Test Method: testRemoveFirstWithNonEmptyList
@Test 
void testRemoveFirstWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1");
 assertFalse(list.isEmpty());
 Object value = list.removeFirst();
 assertEquals("value1", value);
 assertTrue(list.isEmpty());
}


// Test Method: testGetLastWithEmptyList
@Test 
void testGetLastWithEmptyList(){
 DList list = new DList();
 assertThrows(ListEmptyException.class, () -> {list.getLast();});
}


// Test Method: testGetLastWithNonEmptyList
@Test 
void testGetLastWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1");
 assertFalse(list.isEmpty());
 Object value = list.getLast();
 assertEquals("value1", value);
}


// Test Method: testAddLastWithEmptyList
@Test 
void testAddLastWithEmptyList(){
 DList list = new DList();
 assertTrue(list.isEmpty());
 list.addLast("value");
 assertFalse(list.isEmpty());
}


// Test Method: testAddLastWithNonEmptyList
@Test 
void testAddLastWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1");
 assertFalse(list.isEmpty());
 list.addLast("value2");
 assertEquals("[value1, value2]", list.toString());
}


// Test Method: testRemoveLastWithEmptyList
@Test 
void testRemoveLastWithEmptyList(){
 DList list = new DList();
 assertThrows(ListEmptyException.class, () -> {list.removeLast();});
}


// Test Method: testRemoveLastWithNonEmptyList
@Test 
void testRemoveLastWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1");
 assertFalse(list.isEmpty());
 Object value = list.removeLast();
 assertEquals("value1", value);
 assertTrue(list.isEmpty());
}


}