import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmptyTreeExceptionTest{


// Test Method: testEmptyTreeExceptionMessage
@Test 
void testEmptyTreeExceptionMessage() throws Exception {
 try {
 throw new EmptyTreeException();
 } catch (EmptyTreeException e) {
 assertEquals("Baum ist leer.", e.getMessage());
 }
}


}