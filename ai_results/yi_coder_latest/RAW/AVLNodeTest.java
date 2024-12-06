import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLNodeTest{


// Test Method: testGetLeftWithNullValue
@Test 
void testGetLeftWithNullValue() throws Exception {
 AVLNode<Integer> node = new AVLNode<>(null);
 assertNull(node.getLeft());
}


// Test Method: testSetLeftWithNonNullValue
@Test 
void testSetLeftWithNonNullValue() throws Exception {
 AVLNode<Integer> node = new AVLNode<>(10);
 AVLNode<Integer> leftChild = new AVLNode<>(5);
 node.setLeft(leftChild);
 assertEquals(leftChild, node.getLeft());
}


// Test Method: testGetRightWithNullValue
@Test 
void testGetRightWithNullValue() throws Exception {
 AVLNode<Integer> node = new AVLNode<>(null);
 assertNull(node.getRight());
}


// Test Method: testSetRightWithNonNullValue
@Test 
void testSetRightWithNonNullValue() throws Exception {
 AVLNode<Integer> node = new AVLNode<>(10);
 AVLNode<Integer> rightChild = new AVLNode<>(20);
 node.setRight(rightChild);
 assertEquals(rightChild, node.getRight());
}


// Test Method: testGetBalanceWithZeroValue
@Test 
void testGetBalanceWithZeroValue() throws Exception {
 AVLNode<Integer> node = new AVLNode<>(10);
 assertEquals(0, node.getBalance());
}


// Test Method: testSetBalanceWithNonZeroValue
@Test 
void testSetBalanceWithNonZeroValue() throws Exception {
 AVLNode<Integer> node = new AVLNode<>(10);
 int balance = 2;
 node.setBalance(balance);
 assertEquals(balance, node.getBalance());
}


// Test Method: testGetHeightWithZeroValue
@Test 
void testGetHeightWithZeroValue() throws Exception {
 AVLNode<Integer> node = new AVLNode<>(10);
 assertEquals(0, node.getHeight());
}


// Test Method: testSetHeightWithNonZeroValue
@Test 
void testSetHeightWithNonZeroValue() throws Exception {
 AVLNode<Integer> node = new AVLNode<>(10);
 int height = 2;
 node.setHeight(height);
 assertEquals(height, node.getHeight());
}


// Test Method: testGetTotalNumberOfChildrenWithNullChildren
@Test 
void testGetTotalNumberOfChildrenWithNullChildren() throws Exception {
 AVLNode<Integer> node = new AVLNode<>(10);
 assertEquals(1, node.getTotalNumberOfChildren());
}


// Test Method: testGetTotalNumberOfChildrenWithNonNullChildren
@Test 
void testGetTotalNumberOfChildrenWithNonNullChildren() throws Exception {
 AVLNode<Integer> node = new AVLNode<>(10);
 AVLNode<Integer> leftChild = new AVLNode<>(5);
 AVLNode<Integer> rightChild = new AVLNode<>(20);
 node.setLeft(leftChild);
 node.setRight(rightChild);
 assertEquals(3, node.getTotalNumberOfChildren());
}


}