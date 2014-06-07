package com.hackbulgaria.collectionsfun;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class FindDublicatesInSetsTestCase {

    HashSet<Integer> a, b;
    @Before
    public void setUp() throws Exception {
        a = new HashSet<>();
        b = new HashSet<>();
    }

    @Test
    public void testWithTwoSets() {
        a.add(2);
        a.add(3);
        a.add(4);
        
        b.add(3);
        b.add(5);
        
        Set<Integer> result = FindDublicatesInSets.findFublicates(a, b);
        assertFalse(result.contains(2));
        assertTrue(result.contains(3));
        assertFalse(result.contains(4));
        assertFalse(result.contains(5));
    }
    
    @Test
    public void testWithThreeSets(){
        HashSet<Integer> c = new HashSet<>();
        HashSet<Integer> d = new HashSet<>();
        HashSet<Integer> e = new HashSet<>();
        for(int i = 0; i < 5; i++){
            c.add(i);
            d.add(i + 1);
            e.add(i + 2);
        }
        Set<Integer> result = FindDublicatesInSets.findFublicates(c, d, e);
        for(int i = -5; i <= 1; i++){
            assertFalse(result.contains(i));
        }
        for(int i = 2; i <= 4; i++){
            assertTrue(result.contains(i));
        }
        for(int i = 5; i <= 10; i++){
            assertFalse(result.contains(i));
        }
        
    }

}
