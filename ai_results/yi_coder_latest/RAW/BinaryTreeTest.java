import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest{


// Test Method: testInsertAndFind
@Test 
void testInsertAndFind() { 
T value = (T) "value"; 
 BinaryTree<T> tree = new BinaryTree<>(); 
tree.insert(value); 
 assertTrue(tree.find(value)); 
}


// Test Method: testIsEmpty
@Test 
void testIsEmpty() { 
 BinaryTree<T> tree = new BinaryTree<>(); 
 assertTrue(tree.isEmpty()); 
}


// Test Method: testFindMinRekursivAndMaxElement
@Test 
void testFindMinRekursivAndMaxElement() throws EmptyTreeException { 
T value1 = (T) "value1"; 
 T value2 = (T) "value2"; 
 BinaryTree<T> tree = new BinaryTree<>(); 
tree.insert(value1); 
 tree.insert(value2); 
 assertEquals(value1, tree.findMinRekursiv()); 
 assertEquals(value2, tree.findMaxElement()); 
}


// Test Method: testRemove
@Test 
void testRemove() throws EmptyTreeException { 
T value = (T) "value"; 
 BinaryTree<T> tree = new BinaryTree<>(); 
tree.insert(value); 
 assertTrue(tree.remove(value)); 
 assertFalse(tree.find(value)); 
}


// Test Method: testTraverse
@Test 
void testTraverse() { 
T value = (T) "value"; 
 BinaryTree<T> tree = new BinaryTree<>(); 
tree.insert(value); 
 assertNotNull(tree.traverse(Traversal.INORDER)); 
}


}