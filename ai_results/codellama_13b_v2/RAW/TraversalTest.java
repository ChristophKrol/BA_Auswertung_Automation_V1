import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraversalTest{


// Test Method: testPostorder
@Test 
void testPostorder(){
 assertEquals(Traversal.POSTORDER, Traversal.valueOf("POSTORDER"));
}


// Test Method: testInorder
@Test 
void testInorder(){
 assertEquals(Traversal.INORDER, Traversal.valueOf("INORDER"));
}


// Test Method: testPreorder
@Test 
void testPreorder(){
 assertEquals(Traversal.PREORDER, Traversal.valueOf("PREORDER"));
}


}