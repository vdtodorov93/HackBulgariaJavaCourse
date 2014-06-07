package com.hackbulgaria.collectionsfun;

import java.util.Collection;
import java.util.Iterator;

public class FindFirstNonDublicateValue {
    public static int firstUnique(Collection<Integer> coll){
        Iterator<Integer> it = coll.iterator();
        while(it.hasNext()){
            int element = (int)it.next();
            if(isUnique(coll, element)){
                return element;
            }
        }
        return 0;
    }
    
    private static boolean isUnique(Collection<Integer> coll, int element){
        Iterator<Integer> it = coll.iterator();
        int counter = 0;
        while(it.hasNext()){
            if((int)it.next() == element){
                counter++;
            }
        }
        
        return counter == 1;
    }

}
