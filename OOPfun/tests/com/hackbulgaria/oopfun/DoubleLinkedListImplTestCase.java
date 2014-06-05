package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoubleLinkedListImplTestCase {
    DoubleLinkedListImpl list;
    @Before
    public void setUp() throws Exception {
        list = new DoubleLinkedListImpl();
    }

    @Test
    public void testAddThreeElements() {
        list.addHead(2);
        list.addHead(3);
        list.addTail(4);
        assertEquals(3, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(4, list.get(2));
        assertEquals(4, list.getTail());
        assertEquals(3, list.getHead());
    }
    
    @Test
    public void testAddAndRemove() {
        list.addHead(5);
        list.addHead(6);
        list.addTail(4);
        assertEquals(6, list.getHead());
        assertTrue(list.popHead());
        assertEquals(5, list.getHead());
        assertTrue(list.popTail());
        assertEquals(5, list.getHead());
        assertEquals(5, list.getTail());
    }
    
    @Test
    public void testPopEmpty(){
        list.addHead(5);
        list.addHead(6);
        assertTrue(list.popHead());
        assertEquals(1, list.size());
        assertTrue(list.popTail());
        assertFalse(list.popHead());
        assertFalse(list.popTail());
        assertEquals(0, list.size());
    }

}
