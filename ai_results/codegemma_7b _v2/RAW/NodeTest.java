import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest{


// Test Method: testConstructorWithNullValueAndNext
@Test
void testConstructorWithNullValueAndNext() {
    Node node = new Node(null, null);
    assertNull(node.getValue());
    assertNull(node.getNext());
}


// Test Method: testConstructorWithNonNullValueAndNext
@Test
void testConstructorWithNonNullValueAndNext() {
    Object value = new Object();
    Node next = new Node(null, null);
    Node node = new Node(value, next);
    assertEquals(value, node.getValue());
    assertEquals(next, node.getNext());
}


// Test Method: testConstructorWithNonNullValue
@Test
void testConstructorWithNonNullValue() {
    Object value = new Object();
    Node node = new Node(value);
    assertEquals(value, node.getValue());
    assertNull(node.getNext());
}


// Test Method: testConstructorWithNonNullValueAndPrev
@Test
void testConstructorWithNonNullValueAndPrev() {
    Object value = new Object();
    Node prev = new Node(null, null);
    Node node = new Node(value, null, prev);
    assertEquals(value, node.getValue());
    assertNull(node.getNext());
    assertEquals(prev, node.getPrev());
}


// Test Method: testGetPrevWithNonNullPrev
@Test
void testGetPrevWithNonNullPrev() {
    Node prev = new Node(null, null);
    Node node = new Node(null, null, prev);
    assertEquals(prev, node.getPrev());
}


// Test Method: testSetPrevWithNonNullPrev
@Test
void testSetPrevWithNonNullPrev() {
    Node prev = new Node(null, null);
    Node node = new Node(null, null);
    node.setPrev(prev);
    assertEquals(prev, node.getPrev());
}


// Test Method: testGetValue
@Test
void testGetValue() {
    Object value = new Object();
    Node node = new Node(value);
    assertEquals(value, node.getValue());
}


// Test Method: testSetValue
@Test
void testSetValue() {
    Object value = new Object();
    Node node = new Node(null);
    node.setValue(value);
    assertEquals(value, node.getValue());
}


// Test Method: testGetNextWithNonNullNext
@Test
void testGetNextWithNonNullNext() {
    Node next = new Node(null, null);
    Node node = new Node(null, next);
    assertEquals(next, node.getNext());
}


// Test Method: testToStringWithNullNext
@Test
void testToStringWithNullNext() {
    Node node = new Node("HEAD", null);
    assertEquals("["HEAD"]", node.toString());
}


// Test Method: testToStringWithNonNullNextAndDoubleLinkedList
@Test
void testToStringWithNonNullNextAndDoubleLinkedList() {
    Node next = new Node("TAIL", null);
    Node node = new Node("HEAD", next, null);
    assertEquals("["HEAD"]<->["TAIL"]", node.toString());
}


// Test Method: testToStringWithNonNullNextAndSingleLinkedList
@Test
void testToStringWithNonNullNextAndSingleLinkedList() {
    Node next = new Node("TAIL", null);
    Node node = new Node("HEAD", next);
    assertEquals("["HEAD"]->["TAIL"]", node.toString());
}


// Test Method: testRemoveLastWithNonNullNext
@Test
void testRemoveLastWithNonNullNext() {
    Node next = new Node("TAIL", null);
    Node node = new Node("HEAD", next);
    assertEquals("TAIL", node.removeLast());
    assertEquals("HEAD", node.toString());
}


// Test Method: testRemoveLastWithNullNext
@Test
void testRemoveLastWithNullNext() {
    Node node = new Node("HEAD", null);
    assertNull(node.removeLast());
    assertEquals("HEAD", node.toString());
}


// Test Method: testLastWithNonNullNext
@Test
void testLastWithNonNullNext() {
    Node next = new Node("TAIL", null);
    Node node = new Node("HEAD", next);
    assertEquals("TAIL", node.getLast());
}


// Test Method: testLastWithNullNext
@Test
void testLastWithNullNext() {
    Node node = new Node("HEAD", null);
    assertEquals("HEAD", node.getLast());
}


// Test Method: testAddLastWithNonNullNext
@Test
void testAddLastWithNonNullNext() {
    Node next = new Node("TAIL", null);
    Node node = new Node("HEAD", next);
    node.addLast("NEW_TAIL");
    assertEquals("["HEAD"]<->["TAIL"]<->["NEW_TAIL"]", node.toString());
}


// Test Method: testAddLastWithNullNext
@Test
void testAddLastWithNullNext() {
    Node node = new Node("HEAD", null);
    node.addLast("NEW_TAIL");
    assertEquals("["HEAD"]<->["NEW_TAIL"]", node.toString());
}


}