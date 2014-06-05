package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SmartStackTestCase {
    SmartStack stack;
    @Before
    public void setUp() throws Exception {
        stack = new SmartStack(5);
        for(int i = 0; i < 5; i++){
            stack.push(i);
        }
    }

    @Test
    public void testPopAllElements() {
        assertFalse(stack.isEmpty());
        assertFalse(stack.push(10));
        for(int i = 4; i >= 0; i--){
            try {
                int num = (int)stack.top();
                stack.pop();
                assertEquals(i, num);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }            
        }
        assertTrue(stack.isEmpty());
    }
    
    @Test
    public void testAddAlreadyAddedElement(){
        SmartStack testStack = new SmartStack(5);
        assertTrue(testStack.push(5));
        assertTrue(testStack.push(2));
        assertFalse(testStack.push(5));
        assertEquals(2, testStack.getSize());
        assertTrue(testStack.push(4));
        assertEquals(3, testStack.getSize());
    }

}
