package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackWithLinkedListTestCase {

    StackWithLinkedList stack;
    @Before
    public void setUp() throws Exception {
        stack = new StackWithLinkedList();
    }

    @Test
    public void testAdd() {
        stack.push(5);
        stack.push(6);
        stack.push(3);
        assertEquals(3, stack.top());
        assertTrue(stack.pop());
        assertEquals(6, stack.top());
        assertTrue(stack.pop());
        assertEquals(5, stack.top());
        assertTrue(stack.pop());
        assertFalse(stack.pop());
    }
    
    @Test
    public void testEmpty(){
        assertTrue(stack.isEmpty());
        stack.push(5);
        stack.pop();
        assertTrue(stack.isEmpty());
        stack.push(14);
        assertFalse(stack.isEmpty());
    }

}
