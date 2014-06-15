package com.hackbulgaria.exceptions1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Immutable<E> extends ArrayList<E> {
    public Immutable(Collection<? extends E> coll){
        for(E element: coll){
            super.add(element);
        }
    }
    
    @Override
    public boolean add(E e) {
        throw new AddInImmutableCollectionException();
    }
        
    @Override
    public void add(int index, E element) {
        throw new AddInImmutableCollectionException();
    }
    
    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new AddInImmutableCollectionException();
    }
    
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new AddInImmutableCollectionException();
    }
    
    @SafeVarargs
    public static <E> List<E> asList (E... arguments){
        return new Immutable<E>(Arrays.asList(arguments));       
    }

}
