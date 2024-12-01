import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmptyTreeExceptionTest{


// Test Method: testConstructorWithNoArguments
@Test
void testConstructorWithNoArguments(){
 assertEquals("Baum ist leer.", new EmptyTreeException().getMessage());
}


// Test Method: testConstructorWithMessageArgument
@Test
void testConstructorWithMessageArgument(){
 assertEquals("Baum ist leer.", new EmptyTreeException("Baum ist leer.").getMessage());
}


// Test Method: testConstructorWithCauseArgument
@Test
void testConstructorWithCauseArgument(){
 assertEquals(new Throwable(), new EmptyTreeException(new Throwable()).getCause());
}


// Test Method: testConstructorWithMessageAndCauseArguments
@Test
void testConstructorWithMessageAndCauseArguments(){
 assertEquals("Baum ist leer.", new EmptyTreeException("Baum ist leer.", new Throwable()).getMessage());
}


}