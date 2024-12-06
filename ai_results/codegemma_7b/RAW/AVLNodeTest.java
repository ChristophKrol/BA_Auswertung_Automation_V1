import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLNodeTest{


// Test Method: testConstructor
@Test
void testConstructor() {
    AVLNode<Integer> node = new AVLNode<>(10);
    assertEquals(10, node.getValue());
}


// Test Method: testGetLeft
@Test
void testGetLeft() {
    AVLNode<Integer> node = new AVLNode<>(10);
    assertNull(node.getLeft());
}


// Test Method: testSetLeft
@Test
void testSetLeft() {
    AVLNode<Integer> node = new AVLNode<>(10);
    AVLNode<Integer> leftNode = new AVLNode<>(5);
    node.setLeft(leftNode);
    assertEquals(leftNode, node.getLeft());
}


// Test Method: testGetRight
@Test
void testGetRight() {
    AVLNode<Integer> node = new AVLNode<>(10);
    assertNull(node.getRight());
}


// Test Method: testSetRight
@Test
void testSetRight() {
    AVLNode<Integer> node = new AVLNode<>(10);
    AVLNode<Integer> rightNode = new AVLNode<>(15);
    node.setRight(rightNode);
    assertEquals(rightNode, node.getRight());
}


// Test Method: testGetBalance
@Test
void testGetBalance() {
    AVLNode<Integer> node = new AVLNode<>(10);
    assertEquals(0, node.getBalance());
}


// Test Method: testSetBalance
@Test
void testSetBalance() {
    AVLNode<Integer> node = new AVLNode<>(10);
    node.setBalance(5);
    assertEquals(5, node.getBalance());
}


// Test Method: testGetHeight
@Test
void testGetHeight() {
    AVLNode<Integer> node = new AVLNode<>(10);
    assertEquals(1, node.getHeight());
}


// Test Method: testSetHeight
@Test
void testSetHeight() {
    AVLNode<Integer> node = new AVLNode<>(10);
    node.setHeight(5);
    assertEquals(5, node.getHeight());
}


// Test Method: testGetTotalNumberOfChildren
@Test
void testGetTotalNumberOfChildren() {
    AVLNode<Integer> node = new AVLNode<>(10);
    assertEquals(1, node.getTotalNumberOfChildren());
}


// Test Method: testGetTotalNumberOfChildrenWithLeftChild
@Test
void testGetTotalNumberOfChildrenWithLeftChild() {
    AVLNode<Integer> node = new AVLNode<>(10);
    AVLNode<Integer> leftNode = new AVLNode<>(5);
    node.setLeft(leftNode);
    assertEquals(2, node.getTotalNumberOfChildren());
}


// Test Method: testGetTotalNumberOfChildrenWithRightChild
@Test
void testGetTotalNumberOfChildrenWithRightChild() {
    AVLNode<Integer> node = new AVLNode<>(10);
    AVLNode<Integer> rightNode = new AVLNode<>(15);
    node.setRight(rightNode);
    assertEquals(2, node.getTotalNumberOfChildren());
}


// Test Method: testGetTotalNumberOfChildrenWithBothChildren
@Test
void testGetTotalNumberOfChildrenWithBothChildren() {
    AVLNode<Integer> node = new AVLNode<>(10);
    AVLNode<Integer> leftNode = new AVLNode<>(5);
    AVLNode<Integer> rightNode = new AVLNode<>(15);
    node.setLeft(leftNode);
    node.setRight(rightNode);
    assertEquals(4, node.getTotalNumberOfChildren());
}


}