import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest{


// Test Method: testIsEmptyTrue
@Test
void testIsEmptyTrue(){
 assertEquals(true, new List().isEmpty());
}



// Test Method: testAddFirst
@Test
void testAddFirst(){
 List list = new List();
 list.addFirst(1);
 assertEquals(1, list.getFirst());
}



// Test Method: testGetFirst
@Test
void testGetFirst() throws ListEmptyException{
 List list = new List();
 list.addLast(2);
 assertEquals(2, list.getFirst());
}



// Test Method: testRemoveFirst
@Test
void testRemoveFirst() throws ListEmptyException{
 List list = new List();
 list.addLast(3);
 assertEquals(3, list.removeFirst());
}



// Test Method: testAddLast
@Test
void testAddLast(){
 List list = new List();
 list.addLast(4);
 assertEquals(4, (int)list.getLast());
}



// Test Method: testRemoveLast
@Test
void testRemoveLast() throws ListEmptyException{
 List list = new List();
 list.addLast(5);
 assertEquals(5, list.removeLast());
}



}