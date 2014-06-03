package com.ahckbulgaria.corejaba.tddintro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.corejava.tddintro.StringShimMethods;

public class StringShimMethodsTestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTrivialWithSpaces() {
        assertEquals("baba ti", StringShimMethods.stichMeUp(" ", "baba", "ti"));
    }
    
    @Test
    public void testWithCommaAndSpaceSeparator() {
        assertEquals("cola, chocolate, chips, so, unhealthy!", StringShimMethods.stichMeUp(", ", "cola", "chocolate", "chips", "so", "unhealthy!"));
    }
    
    @Test
    public void testWithIntegersAndDoubles() {
        assertEquals("5 + 6 + 7.0", StringShimMethods.stichMeUp(" + ", 5, 6, 7.0));
    }

}
