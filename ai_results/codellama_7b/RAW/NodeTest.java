import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest{


// Test Method: testConstructorWithValueAndNext
@Test 
void testConstructorWithValueAndNext(){
 Node node = new Node(1, null);
 assertEquals(1, node.getValue());
 assertNull(node.getNext());
}


// Test Method: testConstructorWithValue
@Test 
void testConstructorWithValue(){
 Node node = new Node(1);
 assertEquals(1, node.getValue());
 assertNull(node.getNext());
}


// Test Method: testConstructorWithNoArgs
@Test 
void testConstructorWithNoArgs(){
 Node node = new Node();
 assertNull(node.getValue());
 assertNull(node.getNext());
}


// Test Method: testConstructorWithValueAndNextAndPrev
@Test 
void testConstructorWithValueAndNextAndPrev(){
 Node node = new Node(1, null, null);
 assertEquals(1, node.getValue());
 assertNull(node.getNext());
 assertNull(node.getPrev());
}


// Test Method: testAddLast
@Test 
void testAddLast(){
 Node node = new Node();
 node.addLast(1);
 assertEquals(1, node.getValue());
 assertNull(node.getNext());
}


// Test Method: testGetLastElement
@Test 
void testGetLastElement(){
 Node node = new Node();
 node.addLast(1);
 assertEquals(1, node.getLastElement().getValue());
}


// Test Method: testGetLast
@Test 
void testGetLast(){
 Node node = new Node();
 node.addLast(1);
 assertEquals(1, node.getLast().getValue());
}


// Test Method: testRemoveLast
@Test 
void testRemoveLast(){
 Node node = new Node();
 node.addLast(1);
 assertEquals(1, node.removeLast().getValue());
}


// Test Method: testToString
@Test 
void testToString(){
 Node node = new Node();
 node.addLast(1);
 assertEquals("[1]", node.toString());
}


}