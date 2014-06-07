package com.hackbulgaria.collectionsfun;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class ReverseCollectionTestCase {

    @Test
    public void testReverseTrivial() {
        Collection<Integer> myCol = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            myCol.add(i);
        }
        ReverseCollection.reverseInPlace(myCol);
        Integer currentEl = 4;
        for(Integer element: myCol){
            assertEquals(currentEl, element);
            currentEl--;
        }
        assertEquals(-1, (int)currentEl);
    }
    
    @Test
    public void testReverseStrings(){
        Collection<String> myCol = new ArrayList<>();
        myCol.add("AAA");
        myCol.add("BBB");
        myCol.add("CCC");
        ReverseCollection.reverseInPlace(myCol);
        Iterator<String> it = myCol.iterator();
        assertTrue(it.hasNext());
        assertEquals("CCC", it.next());
        assertTrue(it.hasNext());
        assertEquals("BBB", it.next());
        assertTrue(it.hasNext());
        assertEquals("AAA", it.next());
        assertFalse(it.hasNext());
    }

}
