package com.hackbulgaria.OOPIntro;

public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("bark");        
    }

    @Override
    public void eat() {
        System.out.println("EAT");        
    }

    @Override
    public void sleep() {
        System.out.println("Sleeeping");        
    }
    
}
