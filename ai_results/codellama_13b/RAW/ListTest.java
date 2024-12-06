import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest{


// Test Method: testIsEmptyWithEmptyList
@Test
void testIsEmptyWithEmptyList() {
 assertTrue(list.isEmpty());
}


// Test Method: testAddFirstWithNonEmptyList
@Test
void testAddFirstWithNonEmptyList() {
 list.addFirst(1);
 assertFalse(list.isEmpty());
}


// Test Method: testGetFirstWithNonEmptyList
@Test
void testGetFirstWithNonEmptyList() {
 list.addFirst(1);
 assertEquals(1, list.getFirst());
}


// Test Method: testRemoveFirstWithNonEmptyList
@Test
void testRemoveFirstWithNonEmptyList() {
 list.addFirst(1);
 assertEquals(1, list.removeFirst());
}


// Test Method: testAddLastWithNonEmptyList
@Test
void testAddLastWithNonEmptyList() {
 list.addLast(1);
 assertFalse(list.isEmpty());
}


// Test Method: testGetLastWithNonEmptyList
@Test
void testGetLastWithNonEmptyList() {
 list.addLast(1);
 assertEquals(1, list.getLast());
}


// Test Method: testRemoveLastWithNonEmptyList
@Test
void testRemoveLastWithNonEmptyList() {
 list.addLast(1);
 assertEquals(1, list.removeLast());
}


}