import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest{


// Test Method: testConstructorWithNullValue
@Test
void testConstructorWithNullValue() {
 assertNull(new BinaryTree<Integer>(null));
}


// Test Method: testInsertWithEmptyTree
@Test
void testInsertWithEmptyTree() {
 BinaryTree<Integer> tree = new BinaryTree<>();
 assertTrue(tree.insert(5));
 assertEquals(5, tree.getRoot().getKey());
}


// Test Method: testFindWithExistingValue
@Test
void testFindWithExistingValue() {
 BinaryTree<Integer> tree = new BinaryTree<>(5);
 assertTrue(tree.find(5));
}


// Test Method: testFindWithNonExistingValue
@Test
void testFindWithNonExistingValue() {
 BinaryTree<Integer> tree = new BinaryTree<>(5);
 assertFalse(tree.find(10));
}


// Test Method: testFindMinRekursivWithEmptyTree
@Test
void testFindMinRekursivWithEmptyTree() {
 BinaryTree<Integer> tree = new BinaryTree<>();
 try {
 tree.findMinRekursiv();
 fail("Expected EmptyTreeException");
 } catch (EmptyTreeException e) {
 // Expected exception
 }
}


// Test Method: testFindMinIterativWithEmptyTree
@Test
void testFindMinIterativWithEmptyTree() {
 BinaryTree<Integer> tree = new BinaryTree<>();
 try {
 tree.findMinIterativ();
 fail("Expected EmptyTreeException");
 } catch (EmptyTreeException e) {
 // Expected exception
 }
}


// Test Method: testFindMaxElementWithEmptyTree
@Test
void testFindMaxElementWithEmptyTree() {
 BinaryTree<Integer> tree = new BinaryTree<>();
 try {
 tree.findMaxElement();
 fail("Expected EmptyTreeException");
 } catch (EmptyTreeException e) {
 // Expected exception
 }
}


// Test Method: testRemoveWithNonExistingValue
@Test
void testRemoveWithNonExistingValue() {
 BinaryTree<Integer> tree = new BinaryTree<>(5);
 assertFalse(tree.remove(10));
}


// Test Method: testTraverseWithInOrderTraversal
@Test
void testTraverseWithInOrderTraversal() {
 BinaryTree<Integer> tree = new BinaryTree<>(5);
 tree.insert(3);
 tree.insert(7);
 assertEquals("3 5 7", tree.traverse(Traversal.IN_ORDER));
}


// Test Method: testToStringWithEmptyTree
@Test
void testToStringWithEmptyTree() {
 BinaryTree<Integer> tree = new BinaryTree<>();
 assertNull(tree.toString());
}


}