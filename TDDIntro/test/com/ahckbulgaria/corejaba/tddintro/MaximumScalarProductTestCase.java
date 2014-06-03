package com.ahckbulgaria.corejaba.tddintro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.corejava.tddintro.MaximumScalar;

public class MaximumScalarProductTestCase {

    private MaximumScalar maximumScalarProduct;

    @Before
    public void setUp() throws Exception {
        this.maximumScalarProduct = new MaximumScalar();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void tstandartTest() {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{4, 3, 2, 1};
        assertEquals(30, maximumScalarProduct.maxScalarSumProduct(a, b));
    }
    
    @Test
    public void testWithNegatives(){
        int[]a = new int[] {-4, -3};
        int[]b = new int[] {-5, -3};
        assertEquals(29, maximumScalarProduct.maxScalarSumProduct(a, b));
    }
    
    @Test
    public void testWithZeros(){
        int[] a = new int[]{0, 4, -1, 3};
        int [] b = new int[]{2, -9, 0, 4};
        
        assertEquals(31, maximumScalarProduct.maxScalarSumProduct(a, b));
    }
  

}
