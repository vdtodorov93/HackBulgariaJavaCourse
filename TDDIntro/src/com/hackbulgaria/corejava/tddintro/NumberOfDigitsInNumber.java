package com.hackbulgaria.corejava.tddintro;

public class NumberOfDigitsInNumber {
    public static int GetNumberOfDigits(int number){
        if(number == 0){
            return 1;
        }
        int numDigits = 0;
        while(number != 0){
            numDigits++;
            number /= 10;
        }
        
        return numDigits;
    }
}
