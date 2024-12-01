import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLNodeTest{


// Test Method: testGetLeft
@Test
void testGetLeft(){
    AVLNode<String> node = new AVLNode<>("value");
    assertNull(node.getLeft());
}


// Test Method: testSetLeft
@Test
void testSetLeft(){
    AVLNode<String> node = new AVLNode<>("value");
    AVLNode<String> leftChild = new AVLNode<>("leftValue");
    node.setLeft(leftChild);
    assertEquals(leftChild, node.getLeft());
}


// Test Method: testGetRight
@Test
void testGetRight(){
    AVLNode<String> node = new AVLNode<>("value");
    assertNull(node.getRight());
}


// Test Method: testSetRight
@Test
void testSetRight(){
    AVLNode<String> node = new AVLNode<>("value");
    AVLNode<String> rightChild = new AVLNode<>("rightValue");
    node.setRight(rightChild);
    assertEquals(rightChild, node.getRight());
}


// Test Method: testGetBalance
@Test
void testGetBalance(){
    AVLNode<String> node = new AVLNode<>("value");
    assertEquals(0, node.getBalance());
}


// Test Method: testSetBalance
@Test
void testSetBalance(){
    AVLNode<String> node = new AVLNode<>("value");
    node.setBalance(1);
    assertEquals(1, node.getBalance());
}


// Test Method: testGetHeight
@Test
void testGetHeight(){
    AVLNode<String> node = new AVLNode<>("value");
    assertEquals(0, node.getHeight());
}


// Test Method: testSetHeight
@Test
void testSetHeight(){
    AVLNode<String> node = new AVLNode<>("value");
    node.setHeight(1);
    assertEquals(1, node.getHeight());
}


// Test Method: testTotalNumberOfChildren
@Test
void testTotalNumberOfChildren(){
    AVLNode<String> node = new AVLNode<>("value");
    assertEquals(0, node.getTotalNumberOfChildren());
}


}