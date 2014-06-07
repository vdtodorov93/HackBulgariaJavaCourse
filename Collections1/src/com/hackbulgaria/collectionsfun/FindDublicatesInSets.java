package com.hackbulgaria.collectionsfun;

import java.util.HashSet;
import java.util.Set;

public class FindDublicatesInSets {
    public static <T> Set<T> findFublicates(Set<T>... sets){
        Set<T> result = new HashSet<T>();
        for(T element: sets[0]){
            boolean containedInAll = true;
            for(int i = 1; i < sets.length; i++){
                if(!sets[i].contains(element)){
                    containedInAll = false;
                }
            }
            
            if(containedInAll){
                result.add(element);
            }
        }
        return result;
    }

}
