package com.hackbulgaria.collectionsfun;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class FindFirstNonDublicateValueTestCase {
    Collection<Integer> list;
    
    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Integer>(); 
    }

    @Test
    public void trivialTest() {
        for(int i = 2; i <= 10; i++){
            list.add(i);
            list.add(i - 1);
        }
        list.add(1);
        
        assertEquals(10, FindFirstNonDublicateValue.firstUnique(list));
    }
    
    @Test
    public void testWithNegative(){
        ArrayList<Integer> list = new ArrayList<Integer>(
                Arrays.asList(-5, 100, 200, 300, -5));
        assertEquals(100, FindFirstNonDublicateValue.firstUnique(list));
    }

}
