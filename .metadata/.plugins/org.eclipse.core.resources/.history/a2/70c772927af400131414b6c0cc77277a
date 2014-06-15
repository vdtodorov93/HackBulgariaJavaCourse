package com.hackbulgaria.exam1;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class UtilityTestCase {
    List<String> stringList;
    List<Integer> intList;

    @Before
    public void setUp() throws Exception {
        stringList = new ArrayList<>();
        intList = new ArrayList<>();
    }

    @Test
    public void testReverse() {
        stringList.add("AAA");
        stringList.add("BBB");
        stringList.add("CCC");
        stringList = Utility.reverse(stringList);
        assertEquals("CCC", stringList.get(0));
        assertEquals("BBB", stringList.get(1));
        assertEquals("AAA", stringList.get(2));
    }
    
    @Test
    public void testSort(){
        intList.add(4);
        intList.add(1);
        intList.add(7);
        intList.add(3);
        List<Integer> result = Utility.sort(intList);
        assertEquals(1, (int)result.get(0));
        assertEquals(3, (int)result.get(1));
        assertEquals(4, (int)result.get(2));
        assertEquals(7, (int)result.get(3));
        assertEquals(7, (int)intList.get(2));
    }

}
