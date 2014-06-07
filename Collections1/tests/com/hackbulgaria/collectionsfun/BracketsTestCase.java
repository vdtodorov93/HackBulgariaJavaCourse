package com.hackbulgaria.collectionsfun;

import static org.junit.Assert.*;

import org.junit.Test;

public class BracketsTestCase {

    @Test
    public void test() {
        String case1 = "(()(()))";
        String case2 = "()(()))";
        String case3 = "((()(()))";
        String case4 = "()()()()()";
        assertTrue(Brackets.checkExpression(case1));
        assertFalse(Brackets.checkExpression(case2));
        assertFalse(Brackets.checkExpression(case3));
        assertTrue(Brackets.checkExpression(case4));
        
    }

}
