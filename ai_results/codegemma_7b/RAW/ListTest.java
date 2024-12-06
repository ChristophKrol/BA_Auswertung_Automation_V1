import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest{


// Test Method: testIsEmptyWithEmptyList
@Test
void testIsEmptyWithEmptyList() {
 assertTrue(list.isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyList
@Test
void testIsEmptyWithNonEmptyList() {
 list.addFirst(new Object());
 assertFalse(list.isEmpty());
}


// Test Method: testAddFirst
@Test
void testAddFirst() {
 list.addFirst(new Object());
 assertEquals(new Object(), list.getFirst());
}


// Test Method: testGetFirstWithEmptyList
@Test
void testGetFirstWithEmptyList() {
 assertThrows(ListEmptyException.class, () -> list.getFirst());
}


// Test Method: testRemoveFirstWithEmptyList
@Test
void testRemoveFirstWithEmptyList() {
 assertThrows(ListEmptyException.class, () -> list.removeFirst());
}


// Test Method: testAddLast
@Test
void testAddLast() {
 list.addLast(new Object());
 assertEquals(new Object(), list.getLast());
}


// Test Method: testGetLastWithEmptyList
@Test
void testGetLastWithEmptyList() {
 assertThrows(ListEmptyException.class, () -> list.getLast());
}


// Test Method: testRemoveLastWithEmptyList
@Test
void testRemoveLastWithEmptyList() {
 assertThrows(ListEmptyException.class, () -> list.removeLast());
}


}