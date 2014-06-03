package com.hackbulgaria.OOPIntro;

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Mew mew");

    }

    @Override
    public void eat() {
        System.out.println("Eaaaat meow");

    }

    @Override
    public void sleep() {
        System.out.println("Cat meow sleeping");

    }

}
