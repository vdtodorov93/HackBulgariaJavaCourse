package com.hackbulgaria.corejava;

public class FaultyProblem4 {
    public static boolean areEqual(Integer e, Integer k) {
//        k++;
//        k--;        
        return e.equals(k);
    }

    public static boolean areEqual(float a, float b) {
        float delta = 0.00001f;
        return a + delta >= b && a <= delta + b;
    }
    
    

    public static boolean haveEqualSubstrings(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            String substringA = a.substring(i, a.length() );
            String substringB = b.substring(i, b.length() );
            if (substringA.equals(substringB)){
                return true;
            }
        }
        return false;
    }
}
