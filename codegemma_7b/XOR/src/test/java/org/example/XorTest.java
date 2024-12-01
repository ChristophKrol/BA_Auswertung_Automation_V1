package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class XorTest{


// Test Method: testConvertToHex
@Test 
void testConvertToHex(){
 String value = "Hello"; 
 assertEquals("4E 68 6C 6C 6F", Xor.convertToHex(value));
}


// Test Method: testConvertToHexArray
@Test 
void testConvertToHexArray(){
 String value = "Hello"; 
 assertEquals(Arrays.asList("4E", "68", "6C", "6C", "6F"), Xor.convertToHexArray(value));
}


// Test Method: testXorEncrypt
@Test 
void testXorEncrypt(){
 String message = "Hello"; 
 String key = "World"; 
 assertEquals(Arrays.asList("4E 77", "68 6F", "6C 72", "6C 6F", "6F 64"), Xor.xorEncrypt(message, key));
}


// Test Method: testXorDecrypt
@Test 
void testXorDecrypt(){
 String message = "Hello"; 
 String key = "World"; 
 assertEquals("Hello", Xor.xorDecrypt(Xor.xorEncrypt(message, key), key));
}


// Test Method: testCreateKey
@Test 
void testCreateKey(){
 List<String> messageHex = new ArrayList<>();
 messageHex.add("4E"); 
 messageHex.add("68"); 
 messageHex.add("6C"); 
 messageHex.add("6C"); 
 messageHex.add("6F"); 
 String key = "World"; 
 List<String> keyHex = new ArrayList<>(); 
 for (int i = 0; i < 5; i++) {
 keyHex.add(Integer.toHexString(i));
} 
 assertEquals(keyHex, Xor.createKey(messageHex, keyHex));
}


}