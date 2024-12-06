import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLNodeTest{


// Test Method: testGetLeft
@Test 
void testGetLeft(){
 AVLNode<Integer> node = new AVLNode<>(1);
 assertNull(node.getLeft());
}


// Test Method: testSetLeft
@Test 
void testSetLeft(){
 AVLNode<Integer> node = new AVLNode<>(1);
 AVLNode<Integer> left = new AVLNode<>(2);
 node.setLeft(left);
 assertEquals(left, node.getLeft());
}


// Test Method: testGetRight
@Test 
void testGetRight(){
 AVLNode<Integer> node = new AVLNode<>(1);
 assertNull(node.getRight());
}


// Test Method: testSetRight
@Test 
void testSetRight(){
 AVLNode<Integer> node = new AVLNode<>(1);
 AVLNode<Integer> right = new AVLNode<>(2);
 node.setRight(right);
 assertEquals(right, node.getRight());
}


// Test Method: testGetBalance
@Test 
void testGetBalance(){
 AVLNode<Integer> node = new AVLNode<>(1);
 assertEquals(0, node.getBalance());
}


// Test Method: testSetBalance
@Test 
void testSetBalance(){
 AVLNode<Integer> node = new AVLNode<>(1);
 node.setBalance(2);
 assertEquals(2, node.getBalance());
}


// Test Method: testGetHeight
@Test 
void testGetHeight(){
 AVLNode<Integer> node = new AVLNode<>(1);
 assertEquals(0, node.getHeight());
}


// Test Method: testSetHeight
@Test 
void testSetHeight(){
 AVLNode<Integer> node = new AVLNode<>(1);
 node.setHeight(2);
 assertEquals(2, node.getHeight());
}


// Test Method: testGetTotalNumberOfChildren
@Test 
void testGetTotalNumberOfChildren(){
 AVLNode<Integer> node = new AVLNode<>(1);
 assertEquals(1, node.getTotalNumberOfChildren());
}


}