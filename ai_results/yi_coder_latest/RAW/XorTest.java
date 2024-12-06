import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XorTest{


// Test Method: testConvertToHex
@Test 
void testConvertToHex() { 
 String value = "Test"; 
 assertEquals("54 65 73 74", Xor.convertToHex(value)); 
}


// Test Method: testXorEncryptAndDecrypt
@Test 
void testXorEncryptAndDecrypt() { 
 String message = "Geheimnachricht"; 
 String key = "secret"; 
 List<String> encryptedMessage = Xor.xorEncrypt(message, key); 
 String decryptedMessage = Xor.xorDecrypt(encryptedMessage, key); 
 assertEquals(message, decryptedMessage); 
}


// Test Method: testCreateKey
@Test 
void testCreateKey() { 
 List<String> message = Arrays.asList("54", "65", "73", "74"); 
 List<String> key = Arrays.asList("73", "63", "72", "81", "65", "74"); 
 assertEquals(Arrays.asList("73", "63", "72", "81", "65", "73", "73", "63", "72", "81", "65", "73"), Xor.createKey(message, key)); 
}


}