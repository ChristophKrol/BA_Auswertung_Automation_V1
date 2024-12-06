import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraversalTest{


// Test Method: testValueOfWithValidInput
@Test
void testValueOfWithValidInput() {
 assertEquals(Traversal.POSTORDER, Traversal.valueOf("POSTORDER"));
}


// Test Method: testValueOfWithInvalidInput
@Test
void testValueOfWithInvalidInput() {
 assertThrows(IllegalArgumentException.class, () -> Traversal.valueOf("INVALID_VALUE"));
}


// Test Method: testValueOfWithNullInput
@Test
void testValueOfWithNullInput() {
 assertThrows(IllegalArgumentException.class, () -> Traversal.valueOf(null));
}


// Test Method: testValueOfWithEmptyInput
@Test
void testValueOfWithEmptyInput() {
 assertThrows(IllegalArgumentException.class, () -> Traversal.valueOf(" "));
}


// Test Method: testValueOfWithWhitespaceInput
@Test
void testValueOfWithWhitespaceInput() {
 assertThrows(IllegalArgumentException.class, () -> Traversal.valueOf("  "));
}


// Test Method: testValueOfWithUpperCaseInput
@Test
void testValueOfWithUpperCaseInput() {
 assertEquals(Traversal.POSTORDER, Traversal.valueOf("POSTORDER".toUpperCase()));
}


// Test Method: testValueOfWithLowerCaseInput
@Test
void testValueOfWithLowerCaseInput() {
 assertEquals(Traversal.POSTORDER, Traversal.valueOf("postorder".toLowerCase()));
}


// Test Method: testValueOfWithTitleCaseInput
@Test
void testValueOfWithTitleCaseInput() {
 assertEquals(Traversal.POSTORDER, Traversal.valueOf("Postorder".toTitleCase()));
}


// Test Method: testValueOfWithMultipleWordsInput
@Test
void testValueOfWithMultipleWordsInput() {
 assertThrows(IllegalArgumentException.class, () -> Traversal.valueOf("POSTORDER INORDER"));
}


// Test Method: testValueOfWithNonExistentInput
@Test
void testValueOfWithNonExistentInput() {
 assertThrows(IllegalArgumentException.class, () -> Traversal.valueOf("NON_EXISTENT_VALUE"));
}


}