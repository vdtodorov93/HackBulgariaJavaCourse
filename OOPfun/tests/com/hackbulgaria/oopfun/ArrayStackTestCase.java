package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayStackTestCase {

    ArrayStack stack;
    @Before
    public void setUp() throws Exception {
        stack = new ArrayStack(20);
        for(int i = 0; i < 10; i++){
            stack.push(i * 2);
        }
    }

    @Test
    public void test() {
        for(int i = 18; i >= 0; i-=2){
            int element = stack.top();
            stack.pop();
            assertEquals(i,  element);
        }
        boolean nextPop = stack.pop();
        assertEquals(false, nextPop);
    }

}
