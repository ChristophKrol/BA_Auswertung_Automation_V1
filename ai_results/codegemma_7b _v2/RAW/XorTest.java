import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XorTest{


// Test Method: testConvertToHexWithEmptyInput
@Test
void testConvertToHexWithEmptyInput() {
 assertEquals(" ", Xor.convertToHex(""));
}


// Test Method: testConvertToHexWithSingleCharacterInput
@Test
void testConvertToHexWithSingleCharacterInput() {
 assertEquals("65", Xor.convertToHex("A"));
}


// Test Method: testConvertToHexWithMultipleCharactersInput
@Test
void testConvertToHexWithMultipleCharactersInput() {
 assertEquals("47 65 69 74 65 6D 65 74", Xor.convertToHex("Secret"));
}


// Test Method: testConvertToHexStringArrayWithEmptyInput
@Test
void testConvertToHexStringArrayWithEmptyInput() {
 assertEquals(new ArrayList<>(), Xor.convertToHexArray(""));
}


// Test Method: testConvertToHexStringArrayWithSingleCharacterInput
@Test
void testConvertToHexStringArrayWithSingleCharacterInput() {
 assertEquals(Arrays.asList("41"), Xor.convertToHexArray("A"));
}


// Test Method: testConvertToHexStringArrayWithMultipleCharactersInput
@Test
void testConvertToHexStringArrayWithMultipleCharactersInput() {
 assertEquals(Arrays.asList("47", "65", "69", "74", "65", "6D", "65", "74"), Xor.convertToHexArray("Secret"));
}


// Test Method: testXorEncryptWithEmptyMessageAndKey
@Test
void testXorEncryptWithEmptyMessageAndKey() {
 assertEquals(new ArrayList<>(), Xor.xorEncrypt("", ""));
}


// Test Method: testXorEncryptWithSingleCharacterMessageAndKey
@Test
void testXorEncryptWithSingleCharacterMessageAndKey() {
 assertEquals(Arrays.asList("24"), Xor.xorEncrypt("A", "B"));
}


// Test Method: testXorEncryptWithMultipleCharactersMessageAndKey
@Test
void testXorEncryptWithMultipleCharactersMessageAndKey() {
 assertEquals(Arrays.asList("47", "65", "69", "74", "65", "6D", "65", "74"), Xor.xorEncrypt("Secret", "Secret"));
}


// Test Method: testXorDecryptWithEmptyEncryptedMessageAndKey
@Test
void testXorDecryptWithEmptyEncryptedMessageAndKey() {
 assertEquals("", Xor.xorDecrypt(new ArrayList<>(), new ArrayList<>()));
}


// Test Method: testXorDecryptWithSingleCharacterEncryptedMessageAndKey
@Test
void testXorDecryptWithSingleCharacterEncryptedMessageAndKey() {
 assertEquals("B", Xor.xorDecrypt(Arrays.asList("24"), Arrays.asList("B", "A")));
}


// Test Method: testXorDecryptWithMultipleCharactersEncryptedMessageAndKey
@Test
void testXorDecryptWithMultipleCharactersEncryptedMessageAndKey() {
 assertEquals("Secret", Xor.xorDecrypt(Arrays.asList("47", "65", "69", "74", "65", "6D", "65", "74"), Arrays.asList("Secret", "Secret")));
}


// Test Method: testCreateKeyWithEmptyMessageAndKey
@Test
void testCreateKeyWithEmptyMessageAndKey() {
 assertEquals(new ArrayList<>(), Xor.createKey(new ArrayList<>(), new ArrayList<>()));
}


// Test Method: testCreateKeyWithSingleCharacterMessageAndKey
@Test
void testCreateKeyWithSingleCharacterMessageAndKey() {
 assertEquals(Arrays.asList("secret"), Xor.createKey(Arrays.asList("A"), Arrays.asList("secret")));
}


// Test Method: testCreateKeyWithMultipleCharactersMessageAndKey
@Test
void testCreateKeyWithMultipleCharactersMessageAndKey() {
 assertEquals(Arrays.asList("secret", "secret", "secret", "secret", "secret", "secret", "secret", "secret"), Xor.createKey(Arrays.asList("Secret", "Secret", "Secret", "Secret", "Secret", "Secret", "Secret", "Secret"), Arrays.asList("secret", "secret", "secret", "secret", "secret", "secret", "secret", "secret")));
}


}