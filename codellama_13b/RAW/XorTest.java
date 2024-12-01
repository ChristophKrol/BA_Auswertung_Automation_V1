import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XorTest{


// Test Method: convertToHex_withNullValue_returnsEmptyString
@Test
void convertToHex_withNullValue_returnsEmptyString(){
 assertEquals("", Xor.convertToHex(null));
}


// Test Method: convertToHex_withEmptyString_returnsEmptyString
@Test
void convertToHex_withEmptyString_returnsEmptyString(){
 assertEquals("", Xor.convertToHex(""));
}


// Test Method: convertToHex_withSingleCharacter_returnsCorrectHexValue
@Test
void convertToHex_withSingleCharacter_returnsCorrectHexValue(){
 assertEquals("67", Xor.convertToHex("g"));
}


// Test Method: convertToHex_withMultipleCharacters_returnsCorrectHexValues
@Test
void convertToHex_withMultipleCharacters_returnsCorrectHexValues(){
 assertEquals("67 68", Xor.convertToHex("gh"));
}


// Test Method: convertToHexArray_withNullValue_returnsEmptyList
@Test
void convertToHexArray_withNullValue_returnsEmptyList(){
 assertEquals(0, Xor.convertToHexArray(null).size());
}


// Test Method: convertToHexArray_withEmptyString_returnsEmptyList
@Test
void convertToHexArray_withEmptyString_returnsEmptyList(){
 assertEquals(0, Xor.convertToHexArray("").size());
}


// Test Method: convertToHexArray_withSingleCharacter_returnsCorrectHexValue
@Test
void convertToHexArray_withSingleCharacter_returnsCorrectHexValue(){
 assertEquals("67", Xor.convertToHexArray("g")[0]);
}


// Test Method: convertToHexArray_withMultipleCharacters_returnsCorrectHexValues
@Test
void convertToHexArray_withMultipleCharacters_returnsCorrectHexValues(){
 assertEquals("67 68", Xor.convertToHexArray("gh")[0]);
}


// Test Method: xorEncrypt_withNullMessageAndKey_throwsException
@Test(expected = NullPointerException.class)
void xorEncrypt_withNullMessageAndKey_throwsException(){
 Xor.xorEncrypt(null, null);
}


// Test Method: xorEncrypt_withEmptyMessageAndKey_returnsEmptyList
@Test
void xorEncrypt_withEmptyMessageAndKey_returnsEmptyList(){
 assertEquals(0, Xor.xorEncrypt("", "").size());
}


// Test Method: xorEncrypt_withSingleCharacterMessageAndKey_returnsCorrectHexValue
@Test
void xorEncrypt_withSingleCharacterMessageAndKey_returnsCorrectHexValue(){
 assertEquals("67", Xor.xorEncrypt("g", "s")[0]);
}


// Test Method: xorEncrypt_withMultipleCharactersMessageAndKey_returnsCorrectHexValues
@Test
void xorEncrypt_withMultipleCharactersMessageAndKey_returnsCorrectHexValues(){
 assertEquals("67 68", Xor.xorEncrypt("gh", "ss")[0]);
}


// Test Method: xorDecrypt_withNullCipherAndKey_throwsException
@Test(expected = NullPointerException.class)
void xorDecrypt_withNullCipherAndKey_throwsException(){
 Xor.xorDecrypt(null, null);
}


// Test Method: xorDecrypt_withEmptyCipherAndKey_returnsEmptyString
@Test
void xorDecrypt_withEmptyCipherAndKey_returnsEmptyString(){
 assertEquals("", Xor.xorDecrypt(new ArrayList<>(), ""));
}


// Test Method: xorDecrypt_withSingleCharacterCipherAndKey_returnsCorrectHexValue
@Test
void xorDecrypt_withSingleCharacterCipherAndKey_returnsCorrectHexValue(){
 assertEquals("67", Xor.xorDecrypt(new ArrayList<>(), "s")[0]);
}


// Test Method: xorDecrypt_withMultipleCharactersCipherAndKey_returnsCorrectHexValues
@Test
void xorDecrypt_withMultipleCharactersCipherAndKey_returnsCorrectHexValues(){
 assertEquals("67 68", Xor.xorDecrypt(new ArrayList<>(), "ss")[0]);
}


// Test Method: createKey_withNullMessageAndKey_throwsException
@Test(expected = NullPointerException.class)
void createKey_withNullMessageAndKey_throwsException(){
 Xor.createKey(null, null);
}


// Test Method: createKey_withEmptyMessageAndKey_returnsEmptyList
@Test
void createKey_withEmptyMessageAndKey_returnsEmptyList(){
 assertEquals(0, Xor.createKey("", "").size());
}


// Test Method: createKey_withSingleCharacterMessageAndKey_returnsCorrectHexValue
@Test
void createKey_withSingleCharacterMessageAndKey_returnsCorrectHexValue(){
 assertEquals("67", Xor.createKey("g", "s")[0]);
}


// Test Method: createKey_withMultipleCharactersMessageAndKey_returnsCorrectHexValues
@Test
void createKey_withMultipleCharactersMessageAndKey_returnsCorrectHexValues(){
 assertEquals("67 68", Xor.createKey("gh", "ss")[0]);
}


}