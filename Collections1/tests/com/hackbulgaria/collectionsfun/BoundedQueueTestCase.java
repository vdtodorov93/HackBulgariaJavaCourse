package com.hackbulgaria.collectionsfun;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class BoundedQueueTestCase {
    BoundedQueue<Integer> q;
    
    @Before
    public void setUp() throws Exception {
        q = new BoundedQueue<>(4);
        for(int i = 0; i < 4; i++){
            q.add(i);
        }
    }

    @Test
    public void testAdd() {
        assertEquals(0, (int)q.peek());
        q.add(4);
        assertEquals(4, q.size());
        assertEquals(1, (int)q.peek());
        assertEquals(4, q.size());
    }
    
    @Test
    public void testIterator(){
        q.add(4);
        Iterator<Integer> it = q.iterator();
        int value = 1;
        while(it.hasNext()){
            assertEquals(value, (int)it.next());
            value++;
        }
        assertEquals(5, value);
    }

}
