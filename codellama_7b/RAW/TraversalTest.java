import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraversalTest{


// Test Method: testPostorderTraversal
@Test 
void testPostorderTraversal(){
 assertEquals("[1, 2, 3]", traversal(new Node(1), Traversal.POSTORDER));
}


// Test Method: testInorderTraversal
@Test 
void testInorderTraversal(){
 assertEquals("[2, 1, 3]", traversal(new Node(1), Traversal.INORDER));
}


// Test Method: testPreorderTraversal
@Test 
void testPreorderTraversal(){
 assertEquals("[1, 2, 3]", traversal(new Node(1), Traversal.PREORDER));
}


}