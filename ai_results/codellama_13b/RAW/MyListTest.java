import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest{


// Test Method: testIsEmptyWithEmptyList
@Test 
void testIsEmptyWithEmptyList(){
 assertTrue(new MyList().isEmpty());
}


// Test Method: testIsEmptyWithNonEmptyList
@Test 
void testIsEmptyWithNonEmptyList(){
 assertFalse(new MyList(new Node("HEAD")).isEmpty());
}


// Test Method: testAddFirstWithEmptyList
@Test 
void testAddFirstWithEmptyList(){
 MyList list = new MyList();
 list.addFirst(new Node("HEAD"));
 assertEquals(list.getFirst(), new Node("HEAD"));
}


// Test Method: testAddFirstWithNonEmptyList
@Test 
void testAddFirstWithNonEmptyList(){
 MyList list = new MyList(new Node("HEAD"));
 list.addFirst(new Node("HEAD"));
 assertEquals(list.getFirst(), new Node("HEAD"));
}


// Test Method: testGetFirstWithEmptyList
@Test 
void testGetFirstWithEmptyList(){
 MyList list = new MyList();
 assertThrows(ListEmptyException.class, () -> list.getFirst());
}


// Test Method: testGetFirstWithNonEmptyList
@Test 
void testGetFirstWithNonEmptyList(){
 MyList list = new MyList(new Node("HEAD"));
 assertEquals(list.getFirst(), new Node("HEAD"));
}


// Test Method: testRemoveFirstWithEmptyList
@Test 
void testRemoveFirstWithEmptyList(){
 MyList list = new MyList();
 assertThrows(ListEmptyException.class, () -> list.removeFirst());
}


// Test Method: testRemoveFirstWithNonEmptyList
@Test 
void testRemoveFirstWithNonEmptyList(){
 MyList list = new MyList(new Node("HEAD"));
 assertEquals(list.removeFirst(), new Node("HEAD"));
}


// Test Method: testAddLastWithEmptyList
@Test 
void testAddLastWithEmptyList(){
 MyList list = new MyList();
 list.addLast(new Node("HEAD"));
 assertEquals(list.getFirst(), new Node("HEAD"));
}


// Test Method: testAddLastWithNonEmptyList
@Test 
void testAddLastWithNonEmptyList(){
 MyList list = new MyList(new Node("HEAD"));
 list.addLast(new Node("HEAD"));
 assertEquals(list.getFirst(), new Node("HEAD"));
}


// Test Method: testGetLastWithEmptyList
@Test 
void testGetLastWithEmptyList(){
 MyList list = new MyList();
 assertThrows(ListEmptyException.class, () -> list.getLast());
}


// Test Method: testGetLastWithNonEmptyList
@Test 
void testGetLastWithNonEmptyList(){
 MyList list = new MyList(new Node("HEAD"));
 assertEquals(list.getLast(), new Node("HEAD"));
}


// Test Method: testRemoveLastWithEmptyList
@Test 
void testRemoveLastWithEmptyList(){
 MyList list = new MyList();
 assertThrows(ListEmptyException.class, () -> list.removeLast());
}


// Test Method: testRemoveLastWithNonEmptyList
@Test 
void testRemoveLastWithNonEmptyList(){
 MyList list = new MyList(new Node("HEAD"));
 assertEquals(list.removeLast(), new Node("HEAD"));
}


// Test Method: testToStringWithEmptyList
@Test 
void testToStringWithEmptyList(){
 MyList list = new MyList();
 assertEquals(list.toString(), "[" + "HEAD" + "]");
}


// Test Method: testToStringWithNonEmptyList
@Test 
void testToStringWithNonEmptyList(){
 MyList list = new MyList(new Node("HEAD"));
 assertEquals(list.toString(), "[" + "HEAD" + "]");
}


}