import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest{


// Test Method: testIsEmptyWithEmptyList
@Test
void testIsEmptyWithEmptyList() {
 assertTrue(myList.isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyList
@Test
void testIsEmptyWithNonEmptyList() {
 myList.addLast(1);
 assertFalse(myList.isEmpty());
}


// Test Method: testAddFirstWithEmptyList
@Test
void testAddFirstWithEmptyList() {
 myList.addFirst(1);
 assertEquals(1, myList.getFirst());
}


// Test Method: testAddFirstWithNonEmptyList
@Test
void testAddFirstWithNonEmptyList() {
 myList.addLast(1);
 myList.addFirst(2);
 assertEquals(2, myList.getFirst());
}


// Test Method: testRemoveFirstWithEmptyList
@Test
void testRemoveFirstWithEmptyList() {
 assertThrows(ListEmptyException.class, () -> myList.removeFirst());
}


// Test Method: testRemoveFirstWithNonEmptyList
@Test
void testRemoveFirstWithNonEmptyList() {
 myList.addLast(1);
 myList.addLast(2);
 assertEquals(1, myList.removeFirst());
}


// Test Method: testAddLastWithEmptyList
@Test
void testAddLastWithEmptyList() {
 myList.addLast(1);
 assertEquals(1, myList.getLast());
}


// Test Method: testAddLastWithNonEmptyList
@Test
void testAddLastWithNonEmptyList() {
 myList.addLast(1);
 myList.addLast(2);
 assertEquals(2, myList.getLast());
}


// Test Method: testRemoveLastWithEmptyList
@Test
void testRemoveLastWithEmptyList() {
 assertThrows(ListEmptyException.class, () -> myList.removeLast());
}


// Test Method: testRemoveLastWithNonEmptyList
@Test
void testRemoveLastWithNonEmptyList() {
 myList.addLast(1);
 myList.addLast(2);
 assertEquals(2, myList.removeLast());
}


// Test Method: testToStringWithEmptyList
@Test
void testToStringWithEmptyList() {
 assertEquals("[" + "HEAD" + "]", myList.toString());
}


// Test Method: testToStringWithNonEmptyList
@Test
void testToStringWithNonEmptyList() {
 myList.addLast(1);
 myList.addLast(2);
 assertEquals("[" + "HEAD" +"


}