package com.hackbulgaria.OOPIntro;

public class MainFunc {
    public static void main(String[] args){
//        Dog doggy = new Dog();
//        interactWithAnimal(doggy);
//        Cat cat = new Cat();
//        interactWithAnimal(cat);
        for(int i = 1; i <= 20000; i++){
            if(isDone(i)){
                System.out.println(i);
                //break;
            }
        }
    }
    
    private static boolean isDone(int number){
        boolean[] used = new boolean[10];
        used[0] = true;
        int usedDigs = 0;
        int copyN = number;
        int digits[] = new int[10];
        int digitsCounter = 0;
        while(copyN > 0){
            int dig = copyN % 10;
            digits[digitsCounter] = dig;
            digitsCounter++;
            if(used[dig] == false){
                used[dig] = true;
                usedDigs++;
            }
            copyN /= 10;
        }
        
        for(int i = 0; i < digitsCounter-1; i++){
            for(int j = i + 1; j < digitsCounter; j++){
                int sum = 0;
                for(int c = i; c<= j; c++){
                    sum += digits[c];
                }
                if(sum < 10 && used[sum] == false){
                    used[sum] = true;
                    usedDigs++;
                }
            }
        }
        
        return usedDigs == 9;
    }

    private static void interactWithAnimal(Animal animal) {
        animal.eat();
        animal.sleep();
        animal.makeSound();
    }

}
