import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XorTest{


// Test Method: testConvertToHexEmptyString
@Test
void testConvertToHexEmptyString(){
    assertEquals(" ", Xor.convertToHex(""));
}



// Test Method: testConvertToHexSingleCharacter
@Test
void testConvertToHexSingleCharacter(){
    assertEquals(" 0 " , Xor.convertToHex("a"));
}



// Test Method: testConvertToHexMultipleCharacters
@Test
void testConvertToHexMultipleCharacters(){
    assertEquals(" 61 20 6c 61 72 67 65 20 74 65 78 74 " , Xor.convertToHex("large text"));
}



// Test Method: testXorEncryptEmptyMessage
@Test
void testXorEncryptEmptyMessage(){
    List<String> encrypted = Xor.xorEncrypt("", "secret");
    assertEquals(new ArrayList<>(), encrypted);
}



// Test Method: testXorDecryptEmptyMessage
@Test
void testXorDecryptEmptyMessage(){
    List<String> decrypted = Xor.xorDecrypt(new ArrayList<>(), "secret");
    assertEquals("", decrypted.get(0));
}



// Test Method: testXorEncryptSingleCharacter
@Test
void testXorEncryptSingleCharacter(){
    List<String> encrypted = Xor.xorEncrypt("a", "secret");
    assertEquals(new ArrayList<>(Arrays.asList("0f")), encrypted);
}



// Test Method: testXorDecryptSingleCharacter
@Test
void testXorDecryptSingleCharacter(){
    List<String> decrypted = Xor.xorDecrypt(Arrays.asList("0f"), "secret");
    assertEquals("a", decrypted.get(0));
}



}