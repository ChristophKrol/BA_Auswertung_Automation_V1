import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest{


// Test Method: testEmptyList
@Test 
void testEmptyList(){
    MyList list = new MyList(); 
    assertTrue(list.isEmpty());
}



// Test Method: testAddFirst
@Test 
void testAddFirst(){
    MyList list = new MyList(); 
    list.addFirst("Value1"); 
    assertFalse(list.isEmpty());
}



// Test Method: testGetFirst
@Test 
void testGetFirst() throws ListEmptyException{
    MyList list = new MyList("Value1"); 
    assertEquals("Value1", list.getFirst());
}



// Test Method: testRemoveFirst
@Test 
void testRemoveFirst() throws ListEmptyException{
    MyList list = new MyList("Value1"); 
    list.removeFirst(); 
    assertEquals(null, list.getFirst());
}



// Test Method: testAddLast
@Test 
void testAddLast(){
    MyList list = new MyList(); 
    list.addLast("Value1"); 
    assertFalse(list.isEmpty());
}



// Test Method: testGetLast
@Test 
void testGetLast() throws ListEmptyException{
    MyList list = new MyList("Value1", "Value2"); 
    assertEquals("Value2", list.getLast());
}



// Test Method: testRemoveLast
@Test 
void testRemoveLast() throws ListEmptyException{
    MyList list = new MyList("Value1", "Value2"); 
    list.removeLast(); 
    assertEquals("Value1", list.getLast());
}



// Test Method: testToString
@Test 
void testToString(){
    MyList list = new MyList("Value1", "Value2"); 
    assertEquals("[Value1, Value2]", list.toString());
}



}