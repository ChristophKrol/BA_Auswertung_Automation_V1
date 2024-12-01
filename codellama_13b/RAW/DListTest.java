import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DListTest{


// Test Method: testIsEmptyWithEmptyList
@Test
void testIsEmptyWithEmptyList(){
 assertTrue(new DList().isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyList
@Test
void testIsEmptyWithNonEmptyList(){
 assertFalse(new DList().addFirst("value1").isEmpty());
}


// Test Method: testAddFirstWithEmptyList
@Test
void testAddFirstWithEmptyList(){
 DList list = new DList();
 list.addFirst("value1");
 assertEquals(list.head.getValue(), "value1");
}


// Test Method: testAddFirstWithNonEmptyList
@Test
void testAddFirstWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1").addFirst("value2");
 assertEquals(list.head.getValue(), "value2");
}


// Test Method: testRemoveFirstWithEmptyList
@Test
void testRemoveFirstWithEmptyList(){
 DList list = new DList();
 assertThrows(ListEmptyException.class, () -> list.removeFirst());
}


// Test Method: testRemoveFirstWithNonEmptyList
@Test
void testRemoveFirstWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1");
 assertEquals(list.removeFirst(), "value1");
}


// Test Method: testGetLastWithEmptyList
@Test
void testGetLastWithEmptyList(){
 DList list = new DList();
 assertThrows(ListEmptyException.class, () -> list.getLast());
}


// Test Method: testGetLastWithNonEmptyList
@Test
void testGetLastWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1");
 assertEquals(list.getLast(), "value1");
}


// Test Method: testAddLastWithEmptyList
@Test
void testAddLastWithEmptyList(){
 DList list = new DList();
 list.addLast("value1");
 assertEquals(list.tail.getValue(), "value1");
}


// Test Method: testAddLastWithNonEmptyList
@Test
void testAddLastWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1").addLast("value2");
 assertEquals(list.tail.getValue(), "value2");
}


// Test Method: testRemoveLastWithEmptyList
@Test
void testRemoveLastWithEmptyList(){
 DList list = new DList();
 assertThrows(ListEmptyException.class, () -> list.removeLast());
}


// Test Method: testRemoveLastWithNonEmptyList
@Test
void testRemoveLastWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1");
 assertEquals(list.removeLast(), "value1");
}


// Test Method: testToStringWithEmptyList
@Test
void testToStringWithEmptyList(){
 DList list = new DList();
 assertEquals(list.toString(), "[HEAD]<->[TAIL]");
}


// Test Method: testToStringWithNonEmptyList
@Test
void testToStringWithNonEmptyList(){
 DList list = new DList();
 list.addFirst("value1").addLast("value2");
 assertEquals(list.toString(), "[HEAD]<->[TAIL]");
}


}