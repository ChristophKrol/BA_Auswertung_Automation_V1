import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest{


// Test Method: testInsert
@Test 
void testInsert(){
 BinaryTree<Integer> tree = new BinaryTree<>();
 assertTrue(tree.insert(1));
}


// Test Method: testFind
@Test 
void testFind(){
 BinaryTree<Integer> tree = new BinaryTree<>();
 assertFalse(tree.find(2));
}


// Test Method: testFindMinRekursiv
@Test 
void testFindMinRekursiv(){
 BinaryTree<Integer> tree = new BinaryTree<>();
 assertThrows(EmptyTreeException.class, () -> tree.findMinRekursiv());
}


// Test Method: testFindMinIterativ
@Test 
void testFindMinIterativ(){
 BinaryTree<Integer> tree = new BinaryTree<>();
 assertThrows(EmptyTreeException.class, () -> tree.findMinIterativ());
}


// Test Method: testFindMaxElement
@Test 
void testFindMaxElement(){
 BinaryTree<Integer> tree = new BinaryTree<>();
 assertThrows(EmptyTreeException.class, () -> tree.findMaxElement());
}


// Test Method: testRemove
@Test 
void testRemove(){
 BinaryTree<Integer> tree = new BinaryTree<>();
 assertThrows(EmptyTreeException.class, () -> tree.remove(1));
}


// Test Method: testTraverse
@Test 
void testTraverse(){
 BinaryTree<Integer> tree = new BinaryTree<>();
 assertNull(tree.traverse(Traversal.PRE_ORDER));
}


// Test Method: testToString
@Test 
void testToString(){
 BinaryTree<Integer> tree = new BinaryTree<>();
 assertNull(tree.toString());
}


}