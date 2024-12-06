import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListEmptyExceptionTest{


// Test Method: testConstructorWithNoArguments
@Test 
void testConstructorWithNoArguments() {
 assertEquals("Liste ist leer", new ListEmptyException().getMessage());
}


// Test Method: testConstructorWithMessageArgument
@Test 
void testConstructorWithMessageArgument() {
 assertEquals("Liste ist leer", new ListEmptyException("Liste ist leer").getMessage());
}


// Test Method: testConstructorWithCauseArgument
@Test 
void testConstructorWithCauseArgument() {
 assertEquals(new RuntimeException(), new ListEmptyException(new RuntimeException()).getCause());
}


}