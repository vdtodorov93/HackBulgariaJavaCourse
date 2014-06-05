package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateTestCase {

    Pair myPair;
    @Before
    public void setUp() throws Exception {
        myPair = new Pair("IVO", 7.5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPairWithStringAndDouble() {
        
        assertEquals("first:IVO second:7.5", myPair.toString());
    }
    
    @Test
    public void testPairGetter(){
        assertEquals("IVO", myPair.getFirst());
        assertEquals(7.5, myPair.getSecond());
    }
    
    @Test
    public void testPairSetter(){
        Pair pair = new Pair(5,5);
        pair.setFirst("ICO");
        pair.setSecond(56);
        assertEquals("ICO", pair.getFirst());
        assertEquals(56, pair.getSecond());
    }

}
