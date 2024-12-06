import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest{


// Test Method: testAddFirstWithEmptyList
@Test
void testAddFirstWithEmptyList() {
 MyList list = new MyList();
 Object value = new Object(); 
 list.addFirst(value);
 assertEquals(value, list.getFirst());
}


// Test Method: testAddFirstWithNonEmptyList
@Test
void testAddFirstWithNonEmptyList() {
 MyList list = new MyList(new Object());
 Object value = new Object(); 
 list.addFirst(value);
 assertEquals(value, list.getFirst());
}


// Test Method: testGetFirstWithEmptyList
@Test
void testGetFirstWithEmptyList() {
 MyList list = new MyList();
 assertThrows(ListEmptyException.class, () -> list.getFirst());
}


// Test Method: testRemoveFirstWithEmptyList
@Test
void testRemoveFirstWithEmptyList() {
 MyList list = new MyList();
 assertThrows(ListEmptyException.class, () -> list.removeFirst());
}


// Test Method: testAddLastWithEmptyList
@Test
void testAddLastWithEmptyList() {
 MyList list = new MyList();
 Object value = new Object(); 
 list.addLast(value);
 assertEquals(value, list.getLast());
}


// Test Method: testGetLastWithEmptyList
@Test
void testGetLastWithEmptyList() {
 MyList list = new MyList();
 assertThrows(ListEmptyException.class, () -> list.getLast());
}


// Test Method: testRemoveLastWithEmptyList
@Test
void testRemoveLastWithEmptyList() {
 MyList list = new MyList();
 assertThrows(ListEmptyException.class, () -> list.removeLast());
}


}