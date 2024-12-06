package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLNodeTest{


// Test Method: testGetLeft
@Test
void testGetLeft(){
    AVLNode node = new AVLNode(null);
    assertNull(node.getLeft());
}



// Test Method: testSetLeft
@Test
void testSetLeft(){
    AVLNode node = new AVLNode(null);
    AVLNode left = new AVLNode(null);
    node.setLeft(left);
    assertEquals(left, node.getLeft());
}



// Test Method: testGetRight
@Test
void testGetRight(){
    AVLNode node = new AVLNode(null);
    assertNull(node.getRight());
}



// Test Method: testSetRight
@Test
void testSetRight(){
    AVLNode node = new AVLNode(null);
    AVLNode right = new AVLNode(null);
    node.setRight(right);
    assertEquals(right, node.getRight());
}



// Test Method: testGetBalance
@Test
void testGetBalance(){
    AVLNode node = new AVLNode(null);
    assertEquals(0, node.getBalance());
}



// Test Method: testSetBalance
@Test
void testSetBalance(){
    AVLNode node = new AVLNode(null);
    node.setBalance(1);
    assertEquals(1, node.getBalance());
}



// Test Method: testGetHeight
@Test
void testGetHeight(){
    AVLNode node = new AVLNode(null);
    assertEquals(0, node.getHeight());
}



// Test Method: testSetHeight
@Test
void testSetHeight(){
    AVLNode node = new AVLNode(null);
    node.setHeight(1);
    assertEquals(1, node.getHeight());
}



// Test Method: testGetTotalNumberOfChildren
@Test
void testGetTotalNumberOfChildren(){
    AVLNode node = new AVLNode(null);
    assertEquals(1, node.getTotalNumberOfChildren());
}



}