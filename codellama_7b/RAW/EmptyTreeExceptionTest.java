import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmptyTreeExceptionTest{


// Test Method: testConstructorWithMessage
@Test 
void testConstructorWithMessage(){
 assertEquals("Baum ist leer.", new EmptyTreeException().getMessage());
}


// Test Method: testConstructorWithoutMessage
@Test 
void testConstructorWithoutMessage(){
 assertNull(new EmptyTreeException().getMessage());
}


}