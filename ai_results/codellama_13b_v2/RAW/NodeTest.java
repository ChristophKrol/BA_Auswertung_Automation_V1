import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest{


// Test Method: testConstructorWithValueAndNext
@Test
void testConstructorWithValueAndNext() {
 assertEquals(value, node.getValue());
 assertEquals(next, node.getNext());
}


// Test Method: testConstructorWithValue
@Test
void testConstructorWithValue() {
 assertEquals(value, node.getValue());
 assertNull(node.getNext());
}


// Test Method: testConstructorWithoutArguments
@Test
void testConstructorWithoutArguments() {
 assertNull(node.getValue());
 assertNull(node.getNext());
}


// Test Method: testConstructorWithValueAndNextAndPrev
@Test
void testConstructorWithValueAndNextAndPrev() {
 assertEquals(value, node.getValue());
 assertEquals(next, node.getNext());
 assertEquals(prev, node.getPrev());
}


// Test Method: testGetLastElement
@Test
void testGetLastElement() {
 assertEquals(lastElement, node.getLastElement().getValue());
}


// Test Method: testGetLast
@Test
void testGetLast() {
 assertEquals(lastValue, node.getLast().getValue());
}


// Test Method: testRemoveLast
@Test
void testRemoveLast() {
 assertEquals(removedValue, node.removeLast().getValue());
}


}