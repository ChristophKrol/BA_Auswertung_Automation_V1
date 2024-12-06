import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest{


// Test Method: testAddLastWithEmptyList
@Test 
void testAddLastWithEmptyList(){
 Node node = new Node();
 node.addLast(10);
 assertEquals("[HEAD]->[10]", node.toString());
}


// Test Method: testAddLastWithNonEmptyList
@Test 
void testAddLastWithNonEmptyList(){
 Node node = new Node(10);
 node.addLast(20);
 assertEquals("[HEAD]->[10]=>[20]", node.toString());
}


// Test Method: testGetLastElementWithEmptyList
@Test 
void testGetLastElementWithEmptyList(){
 Node node = new Node();
 assertNull(node.getLastElement());
}


// Test Method: testGetLastElementWithNonEmptyList
@Test 
void testGetLastElementWithNonEmptyList(){
 Node node = new Node(10);
 node.addLast(20);
 assertEquals(20, node.getLastElement().getValue());
}


// Test Method: testRemoveLastWithEmptyList
@Test 
void testRemoveLastWithEmptyList(){
 Node node = new Node();
 assertNull(node.removeLast());
}


// Test Method: testRemoveLastWithNonEmptyList
@Test 
void testRemoveLastWithNonEmptyList(){
 Node node = new Node(10);
 node.addLast(20);
 assertEquals(20, node.removeLast());
}


}