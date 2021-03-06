package com.ahckbulgaria.corejaba.tddintro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.corejava.tddintro.NumberOfDigitsInNumber;

public class NumberOfDigitsInNumberTestCase {

    NumberOfDigitsInNumber digitsCounter = new NumberOfDigitsInNumber(); 
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testWithOneDigitNumber() {
        assertEquals(1, digitsCounter.GetNumberOfDigits(5));
    }
    
    @Test
    public void testWithLargeNumber() {
        assertEquals(8, digitsCounter.GetNumberOfDigits(51928524));
    }
    
    @Test
    public void testWithNegativeNumber() {
        assertEquals(3, digitsCounter.GetNumberOfDigits(-325));
    }
    
    @Test
    public void testWithZero() {
        assertEquals(1, digitsCounter.GetNumberOfDigits(0));
    }

}
