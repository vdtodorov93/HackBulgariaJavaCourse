package com.hackbulgaria.corejava;

public class FaultyProblem6 {
    public static long pow(int a, int b) {
        if (b == 1){
            return a;
        }
        if(b == 0){
            return 1;
        }
        long power = pow(a, b / 2);
        if (b % 2 == 1) {
            return a * power * power;
        } else {
            return power * power;
        }
    }
}
