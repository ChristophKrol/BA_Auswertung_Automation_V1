import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmptyTreeExceptionTest{


// Test Method: testConstructor
@Test
void testConstructor() {
    try {
        EmptyTreeException exception = new EmptyTreeException();
        assertEquals("Baum ist leer.", exception.getMessage());
    } catch (Exception e) {
        fail("Unexpected exception thrown: " + e.getMessage());
    }
}


}