package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DListTest {

    @Test
    void testIsEmpty() throws ListEmptyException {
        DList list = new DList();
        assertTrue(list.isEmpty());
        list.addFirst("test");
        assertFalse(list.isEmpty());
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    void testAddFirst() throws ListEmptyException {
        DList list = new DList();
        list.addFirst("test1");
        assertEquals("test1", list.getFirst());
        list.addFirst("test2");
        assertEquals("test2", list.getFirst());
    }

    @Test
    void testRemoveFirst() throws ListEmptyException {
        DList list = new DList();
        list.addFirst("test1");
        assertEquals("test1", list.removeFirst());
        assertTrue(list.isEmpty());
        list.addFirst("test2");
        assertEquals("test2", list.removeFirst());
    }

    @Test
    void testGetLast() throws ListEmptyException {
        DList list = new DList();
        list.addFirst("test1");
        assertEquals("test1", list.getLast());
        list.addFirst("test2");
        assertEquals("test1", list.getLast());
    }

    @Test
    void testAddLast() throws ListEmptyException {
        DList list = new DList();
        list.addLast("test1");
        assertEquals("test1", list.getLast());
        list.addLast("test2");
        assertEquals("test2", list.getLast());
    }

    @Test
    void testRemoveLast() throws ListEmptyException {
        DList list = new DList();
        list.addFirst("test1");
        list.addFirst("test2");
        assertEquals("test1", list.removeLast());
    }

    @Test
    void testToString() {
        DList list = new DList();
        assertEquals("[HEAD]<->[TAIL]", list.toString());
        list.addFirst("test");
        assertEquals("[HEAD]<->[test]<->[TAIL]", list.toString());
    }


}