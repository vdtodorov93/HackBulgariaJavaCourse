package com.hackbulgaria.exceptions1;

import java.util.ArrayList;
import java.util.List;

import javax.management.ServiceNotFoundException;

public class MainFunc {
    public static void main(String[] args) {
//        try{
//            foo();
//        }catch(Exception e){
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        try {
//            tryService();
//        } catch (ServiceNotAvailableAtTheMoment e) {
//            e.printStackTrace();
//        }
//        NotRetardedHashMap<Integer, String> smart = new NotRetardedHashMap<>(); 
//        smart.put(2, "Ivan");
//        smart.put(3, "Vasko");
//        smart.put(4, "Go6o");
//        try
//        {
//            smart.put(null, "Ivo");
//        }catch(NullValueAsKeyInHashException e){
//            System.out.println("lo6ooo");
//        }
//        List<Integer> numbers = new ArrayList<>();
//        for(int i = 0; i < 5; i++)numbers.add(i);
//        Immutable<Integer> az = new Immutable<Integer>(numbers);
//        //System.out.println(az.get(2));
//        
//        List<Integer> useFactory = Immutable.asList(5, 4, 8, 2);
//        for(Integer number: useFactory){
//            System.out.println(number);
//        }
    }
    
    public static void foo(){
        if(1 < 2){
            throw new DatabaseCorruptedException();
        }
    }
    
    public static void tryService() throws ServiceNotAvailableAtTheMoment{
        for(int i = 0; i < 10; i++);
        throw new ServiceNotAvailableAtTheMoment("4upi se servera ebasi");
    }

}
