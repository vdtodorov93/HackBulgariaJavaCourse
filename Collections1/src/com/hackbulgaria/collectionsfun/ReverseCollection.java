package com.hackbulgaria.collectionsfun;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class ReverseCollection {
    public static <T> void reverseInPlace(Collection<T> col){
        Stack<T> st = new Stack<>();
        for (Iterator<T> iterator = col.iterator(); iterator.hasNext();) {
            st.push(iterator.next());            
        }
        col.clear();
        while(!st.isEmpty()){
            col.add(st.peek());
            st.pop();
        }
    }
}
