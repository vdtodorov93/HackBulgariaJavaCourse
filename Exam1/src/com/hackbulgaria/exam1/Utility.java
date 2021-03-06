package com.hackbulgaria.exam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class Utility {
    public static <T> List<T> reverse(List<T> list){
        List<T> result = new ArrayList<T>();
        for(T el: list){
            result.add(el);
        }
        Collections.reverse(result);
        return result;        
    }
    
    public static<T extends Comparable<T>> List<T> sort(List<T> list){
        List<T> result = new ArrayList<T>();
        for(T el: list){
            result.add(el);
        }
        Collections.sort(result);
        return result;
    }
    
    public static <T extends Comparable<T>> boolean checkForMonotonic(List<T> list){
        return list.equals(sort(list)) || list.equals(reverse(sort(list)));
    }

}
