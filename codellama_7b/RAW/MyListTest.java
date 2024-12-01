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


// Test Method: testGetFirstWithEmptyList
@Test (expected = ListEmptyException.class) 
void testGetFirstWithEmptyList(){
 new MyList().getFirst();
}


// Test Method: testGetFirstWithNonEmptyList
@Test 
void testGetFirstWithNonEmptyList(){
 assertEquals("HEAD", new MyList(new Node("HEAD")).getFirst());
}


// Test Method: testRemoveFirstWithEmptyList
@Test (expected = ListEmptyException.class) 
void testRemoveFirstWithEmptyList(){
 new MyList().removeFirst();
}


// Test Method: testRemoveFirstWithNonEmptyList
@Test 
void testRemoveFirstWithNonEmptyList(){
 assertEquals("HEAD", new MyList(new Node("HEAD")).removeFirst());
}


// Test Method: testAddFirstWithEmptyList
@Test 
void testAddFirstWithEmptyList(){
 new MyList().addFirst("NEW_NODE");
 assertEquals("NEW_NODE", new MyList().getFirst());
}


// Test Method: testAddFirstWithNonEmptyList
@Test 
void testAddFirstWithNonEmptyList(){
 Node node = new Node("HEAD");
 new MyList(node).addFirst("NEW_NODE");
 assertEquals("NEW_NODE", new MyList(node).getFirst());
}


// Test Method: testGetLastWithEmptyList
@Test (expected = ListEmptyException.class) 
void testGetLastWithEmptyList(){
 new MyList().getLast();
}


// Test Method: testGetLastWithNonEmptyList
@Test 
void testGetLastWithNonEmptyList(){
 assertEquals("HEAD", new MyList(new Node("HEAD")).getLast());
}


// Test Method: testRemoveLastWithEmptyList
@Test (expected = ListEmptyException.class) 
void testRemoveLastWithEmptyList(){
 new MyList().removeLast();
}


// Test Method: testRemoveLastWithNonEmptyList
@Test 
void testRemoveLastWithNonEmptyList(){
 assertEquals("HEAD", new MyList(new Node("HEAD")).removeLast());
}


// Test Method: testAddLastWithEmptyList
@Test 
void testAddLastWithEmptyList(){
 new MyList().addLast("NEW_NODE");
 assertEquals("NEW_NODE", new MyList().getFirst());
}


// Test Method: testAddLastWithNonEmptyList
@Test 
void testAddLastWithNonEmptyList(){
 Node node = new Node("HEAD");
 new MyList(node).addLast("NEW_NODE");
 assertEquals("NEW_NODE", new MyList(node).getLast());
}


// Test Method: testToStringWithEmptyList
@Test 
void testToStringWithEmptyList(){
 assertEquals("[HEAD]", new MyList().toString());
}


// Test Method: testToStringWithNonEmptyList
@Test 
void testToStringWithNonEmptyList(){
 Node node = new Node("HEAD");
 assertEquals("[HEAD]", new MyList(node).toString());
}


}