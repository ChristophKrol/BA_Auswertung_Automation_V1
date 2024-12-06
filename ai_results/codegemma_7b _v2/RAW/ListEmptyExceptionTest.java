import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListEmptyExceptionTest{


// Test Method: testConstructorWithEmptyMessage
@Test
void testConstructorWithEmptyMessage() {
    ListEmptyException exception = new ListEmptyException();
    assertEquals("Liste ist leer", exception.getMessage());
}


// Test Method: testConstructorWithCustomMessage
@Test
void testConstructorWithCustomMessage() {
    String customMessage = "Custom message";
    ListEmptyException exception = new ListEmptyException(customMessage);
    assertEquals(customMessage, exception.getMessage());
}


}