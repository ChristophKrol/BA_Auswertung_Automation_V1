package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListEmptyExceptionTest{


// Test Method: testDefaultConstructor
@Test 
void testDefaultConstructor(){
 assertEquals("Liste ist leer", new ListEmptyException().getMessage());
}


}