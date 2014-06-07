package com.hackbulgaria.collectionsfun;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class RotateElementsOfCollection {
    public static <T> void rotate(Collection<T> coll, int rotateTimes){
        for(int i = 0; i < rotateTimes; i++){
            rotate(coll);
        }
    }
    private static <T> void rotate(Collection<T> coll){
        ArrayList<T> elements = new ArrayList<T>(coll);
        T last = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        elements.add(0, last);
        coll.clear();
        for(T element: elements){
            coll.add(element);
        }
    }
}