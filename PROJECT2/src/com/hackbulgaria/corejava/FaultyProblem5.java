package com.hackbulgaria.corejava;

public class FaultyProblem5 {
    public static long kthFac(int k, int n) {
        int res = 1;
        int limit = n;
        
//        for (long i = 2; i <= limit; i++) {
//            res *= i;
//            if (i == limit && k > 1) {
//                k--;
//                //limit = res;
//                res = 1;
//            }
//            if(i == limit && k == 1) break;
//        }
        for(long i = 1; i <= k; i++){
            for(long j = 2; j <= n; j++) res *= j;
            n = res;
            res = 1;
        }
        return n;
    }
}
