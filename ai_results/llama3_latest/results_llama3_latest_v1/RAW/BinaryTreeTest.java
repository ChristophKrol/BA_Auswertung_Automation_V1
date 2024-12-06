import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest{


// Test Method: testEmptyTree
@Test
void testEmptyTree(){
    BinaryTree<Integer> tree = new BinaryTree<>();
    assertTrue(tree.isEmpty());
}



// Test Method: testInsertAndFind
@Test
void testInsertAndFind(){
    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.insert(5);
    assertTrue(tree.find(5));
}



// Test Method: testRemove
@Test
void testRemove() throws EmptyTreeException{
    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.insert(5);
    assertTrue(tree.remove(5));
}



// Test Method: testFindMinRekursiv
@Test
void testFindMinRekursiv() throws EmptyTreeException{
    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.insert(5);
    assertEquals(5, tree.findMinRekursiv());
}



// Test Method: testFindMaxElement
@Test
void testFindMaxElement() throws EmptyTreeException{
    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.insert(5);
    assertEquals(5, tree.findMaxElement());
}



// Test Method: testTraversal
@Test
void testTraversal(){
    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.insert(5);
    String traversal = tree.traverse(Traversal.INORDER);
    assertNotNull(traversal);
}



// Test Method: testToString
@Test
void testToString(){
    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.insert(5);
    String toString = tree.toString();
    assertNotNull(toString);
}



}