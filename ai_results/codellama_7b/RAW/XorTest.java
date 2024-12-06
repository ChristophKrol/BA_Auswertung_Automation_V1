import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XorTest{


// Test Method: testConvertToHexWithEmptyString
@Test 
void testConvertToHexWithEmptyString(){
 assertEquals("", Xor.convertToHex(""));
}


// Test Method: testConvertToHexWithOneCharacterString
@Test 
void testConvertToHexWithOneCharacterString(){
 assertEquals("30", Xor.convertToHex("0"));
}


// Test Method: testConvertToHexWithMultipleCharacterString
@Test 
void testConvertToHexWithMultipleCharacterString(){
 assertEquals("30 31 32", Xor.convertToHex("012"));
}


// Test Method: testConvertToHexArrayWithEmptyString
@Test 
void testConvertToHexArrayWithEmptyString(){
 assertEquals(new ArrayList<String>(), Xor.convertToHexArray(""));
}


// Test Method: testConvertToHexArrayWithOneCharacterString
@Test 
void testConvertToHexArrayWithOneCharacterString(){
 assertEquals(new ArrayList<String>(Arrays.asList("30")), Xor.convertToHexArray("0"));
}


// Test Method: testConvertToHexArrayWithMultipleCharacterString
@Test 
void testConvertToHexArrayWithMultipleCharacterString(){
 assertEquals(new ArrayList<String>(Arrays.asList("30 31 32")), Xor.convertToHexArray("012"));
}


// Test Method: testXorEncryptWithEmptyMessageAndKey
@Test 
void testXorEncryptWithEmptyMessageAndKey(){
 assertEquals(new ArrayList<String>(), Xor.xorEncrypt(""), ""));
}


// Test Method: testXorEncryptWithOneCharacterMessageAndEmptyKey
@Test 
void testXorEncryptWithOneCharacterMessageAndEmptyKey(){
 assertEquals(new ArrayList<String>(Arrays.asList("30")), Xor.xorEncrypt("0", ""));
}


// Test Method: testXorEncryptWithMultipleCharacterMessageAndEmptyKey
@Test 
void testXorEncryptWithMultipleCharacterMessageAndEmptyKey(){
 assertEquals(new ArrayList<String>(Arrays.asList("30 31 32")), Xor.xorEncrypt("012", ""));
}


// Test Method: testXorDecryptWithEmptyCipherAndKey
@Test 
void testXorDecryptWithEmptyCipherAndKey(){
 assertEquals("", Xor.xorDecrypt(new ArrayList<String>(), ""));
}


// Test Method: testXorDecryptWithOneCharacterCipherAndEmptyKey
@Test 
void testXorDecryptWithOneCharacterCipherAndEmptyKey(){
 assertEquals("0", Xor.xorDecrypt(new ArrayList<String>(Arrays.asList("30")), ""));
}


// Test Method: testXorDecryptWithMultipleCharacterCipherAndEmptyKey
@Test 
void testXorDecryptWithMultipleCharacterCipherAndEmptyKey(){
 assertEquals("012", Xor.xorDecrypt(new ArrayList<String>(Arrays.asList("30 31 32")), ""));
}


// Test Method: testXorEncryptAndDecryptWithEmptyMessageAndKey
@Test 
void testXorEncryptAndDecryptWithEmptyMessageAndKey(){
 assertEquals("", Xor.xorDecrypt(Xor.xorEncrypt(""), ""));
}


// Test Method: testXorEncryptAndDecryptWithOneCharacterMessageAndEmptyKey
@Test 
void testXorEncryptAndDecryptWithOneCharacterMessageAndEmptyKey(){
 assertEquals("0", Xor.xorDecrypt(Xor.xorEncrypt("0", ""), ""));
}


// Test Method: testXorEncryptAndDecryptWithMultipleCharacterMessageAndEmptyKey
@Test 
void testXorEncryptAndDecryptWithMultipleCharacterMessageAndEmptyKey(){
 assertEquals("012", Xor.xorDecrypt(Xor.xorEncrypt("012", ""), ""));
}


// Test Method: testXorEncryptAndDecryptWithEmptyMessageAndOneCharacterKey
@Test 
void testXorEncryptAndDecryptWithEmptyMessageAndOneCharacterKey(){
 assertEquals("", Xor.xorDecrypt(Xor.xorEncrypt(""), "0"));
}


// Test Method: testXorEncryptAndDecryptWithOneCharacterMessageAndOneCharacterKey
@Test 
void testXorEncryptAndDecryptWithOneCharacterMessageAndOneCharacterKey(){
 assertEquals("0", Xor.xorDecrypt(Xor.xorEncrypt("0", "0"), "0"));
}


// Test Method: testXorEncryptAndDecryptWithMultipleCharacterMessageAndOneCharacterKey
@Test 
void testXorEncryptAndDecryptWithMultipleCharacterMessageAndOneCharacterKey(){
 assertEquals("012", Xor.xorDecrypt(Xor.xorEncrypt("012", "0"), "0"));
}


// Test Method: testXorEncryptAndDecryptWithEmptyMessageAndMultipleCharacterKey
@Test 
void testXorEncryptAndDecryptWithEmptyMessageAndMultipleCharacterKey(){
 assertEquals("", Xor.xorDecrypt(Xor.xorEncrypt(""), "012"));
}


// Test Method: testXorEncryptAndDecryptWithOneCharacterMessageAndMultipleCharacterKey
@Test 
void testXorEncryptAndDecryptWithOneCharacterMessageAndMultipleCharacterKey(){
 assertEquals("0", Xor.xorDecrypt(Xor.xorEncrypt("0", "012"), "012"));
}


// Test Method: testXorEncryptAndDecryptWithMultipleCharacterMessageAndMultipleCharacterKey
@Test 
void testXorEncryptAndDecryptWithMultipleCharacterMessageAndMultipleCharacterKey(){
 assertEquals("012", Xor.xorDecrypt(Xor.xorEncrypt("012", "012"), "012"));
}


}