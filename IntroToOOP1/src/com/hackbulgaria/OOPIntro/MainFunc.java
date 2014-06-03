package com.hackbulgaria.OOPIntro;

public class MainFunc {
    public static void main(String[] args){
        Dog doggy = new Dog();
        interactWithAnimal(doggy);
        Cat cat = new Cat();
        interactWithAnimal(cat);
    }

    private static void interactWithAnimal(Animal animal) {
        animal.eat();
        animal.sleep();
        animal.makeSound();
    }

}
