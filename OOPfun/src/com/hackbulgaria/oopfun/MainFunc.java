package com.hackbulgaria.oopfun;

public class MainFunc {
    public static void main(String[] args){
        Time alongTimeAgo = new Time(23, 30, 55, 21, 1, 1993);
        System.out.println(alongTimeAgo);
        System.out.println(Time.now());
        
        Pair newPair = new Pair(5, "ICO");
        System.out.println(newPair);        
    }
}