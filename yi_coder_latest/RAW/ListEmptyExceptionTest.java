import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListEmptyExceptionTest{


// Test Method: testConstructorWithNoArguments
@Test 
void testConstructorWithNoArguments() throws ListEmptyException {
  ListEmptyException ex = new ListEmptyException();
 assertEquals("Liste ist leer", ex.getMessage());
}


}