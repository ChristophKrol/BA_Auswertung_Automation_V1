import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest{


// Test Method: testIsEmptyWithEmptyList
@Test 
void testIsEmptyWithEmptyList(){
 List list = new ArrayList<>();
 assertTrue(list.isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyList
@Test 
void testIsEmptyWithNonEmptyList(){
 List list = new ArrayList<>();
 list.addFirst(1);
 assertFalse(list.isEmpty());
}


// Test Method: testAddFirstWithNullValue
@Test 
void testAddFirstWithNullValue(){
 List list = new ArrayList<>();
 list.addFirst(null);
 assertEquals(1, list.size());
}


// Test Method: testGetFirstWithEmptyList
@Test 
void testGetFirstWithEmptyList(){
 List list = new ArrayList<>();
 assertThrows(ListEmptyException.class, () -> list.getFirst());
}


// Test Method: testRemoveFirstWithEmptyList
@Test 
void testRemoveFirstWithEmptyList(){
 List list = new ArrayList<>();
 assertThrows(ListEmptyException.class, () -> list.removeFirst());
}


// Test Method: testAddLastWithNullValue
@Test 
void testAddLastWithNullValue(){
 List list = new ArrayList<>();
 list.addLast(null);
 assertEquals(1, list.size());
}


// Test Method: testGetLastWithEmptyList
@Test 
void testGetLastWithEmptyList(){
 List list = new ArrayList<>();
 assertThrows(ListEmptyException.class, () -> list.getLast());
}


// Test Method: testRemoveLastWithEmptyList
@Test 
void testRemoveLastWithEmptyList(){
 List list = new ArrayList<>();
 assertThrows(ListEmptyException.class, () -> list.removeLast());
}


}