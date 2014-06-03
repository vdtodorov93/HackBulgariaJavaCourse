package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeTestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTimeToString() {
        Time myBirthDate = new Time(12, 12, 12, 19, 11, 1993);
        assertEquals("12:12:12 19:11:1993", myBirthDate.toString());
    }

}
