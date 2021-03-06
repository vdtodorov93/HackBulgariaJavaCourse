package com.hackbulgaria.collectionsfun;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class OnOffCollectionTestCase {

    OnOffCollection<Integer> myOnOff;
    
    @Before
    public void setUp() throws Exception {
        myOnOff = new OnOffCollection<>();
        for(int i = 2; i <= 10; i++){
            myOnOff.add(i);
        }
    }

    @Test
    public void testAddAllreadyAddedElement() {
        assertTrue(myOnOff.contains(2));
        assertFalse(myOnOff.add(2));
        assertFalse(myOnOff.contains(2));
    }
    
    @Test
    public void testAddElement(){
        myOnOff.add(11);
        myOnOff.add(12);
        myOnOff.add(13);
        for(int i = 2; i <= 10; i++){
            myOnOff.remove(i);
        }
        Iterator<Integer> it = myOnOff.iterator();
        assertTrue(it.hasNext());
        assertEquals(11,  (int)it.next());
        assertTrue(it.hasNext());
        assertEquals(12,  (int)it.next());
        assertTrue(it.hasNext());
        assertEquals(13,  (int)it.next());
        assertFalse(it.hasNext());
    }

}
