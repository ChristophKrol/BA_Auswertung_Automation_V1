import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DListTest{


// Test Method: testIsEmptyWithEmptyList
@Test
void testIsEmptyWithEmptyList() {
 assertTrue(dList.isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyList
@Test
void testIsEmptyWithNonEmptyList() {
 dList.addLast("a");
 assertFalse(dList.isEmpty());
}


// Test Method: testAddFirstWithEmptyList
@Test
void testAddFirstWithEmptyList() {
 dList.addLast("a");
 assertEquals("a", dList.getFirst());
}


// Test Method: testAddFirstWithNonEmptyList
@Test
void testAddFirstWithNonEmptyList() {
 dList.addLast("a");
 dList.addLast("b");
 assertEquals("b", dList.getFirst());
}


// Test Method: testRemoveFirstWithEmptyList
@Test
void testRemoveFirstWithEmptyList() {
 assertThrows(ListEmptyException.class, () -> dList.removeFirst());
}


// Test Method: testRemoveFirstWithNonEmptyList
@Test
void testRemoveFirstWithNonEmptyList() {
 dList.addLast("a");
 dList.addLast("b");
 assertEquals("a", dList.removeFirst());
}


// Test Method: testGetLastWithEmptyList
@Test
void testGetLastWithEmptyList() {
 assertThrows(ListEmptyException.class, () -> dList.getLast());
}


// Test Method: testGetLastWithNonEmptyList
@Test
void testGetLastWithNonEmptyList() {
 dList.addLast("a");
 dList.addLast("b");
 assertEquals("b", dList.getLast());
}


// Test Method: testAddLastWithNonEmptyList
@Test
void testAddLastWithNonEmptyList() {
 dList.addLast("a");
 dList.addLast("b");
 assertEquals("b", dList.getLast());
}


// Test Method: testRemoveLastWithEmptyList
@Test
void testRemoveLastWithEmptyList() {
 assertThrows(ListEmptyException.class, () -> dList.removeLast());
}


// Test Method: testRemoveLastWithNonEmptyList
@Test
void testRemoveLastWithNonEmptyList() {
 dList.addLast("a");
 dList.addLast("b");
 assertEquals("b", dList.removeLast());
}


// Test Method: testToStringWithEmptyList
@Test
void testToStringWithEmptyList() {
 assertEquals("[" + "HEAD" + "]" + "<->" + "[" + "TAIL" + "]", dList.toString());
}


// Test Method: testToStringWithNonEmptyList
@Test
void testToStringWithNonEmptyList() {
 dList.addLast("a");
 assertEquals("[" + "HEAD" + "]" + "<->" + "[" + "a" + "]" + "<->" + "[" + "TAIL" + "]", dList.toString());
}


}