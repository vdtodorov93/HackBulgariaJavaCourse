package com.hackbulgaria.collectionsfun;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class BoundedQueue<E> implements Queue<E> {
    private Queue<E> data;
    private int maxSize;
    
    public BoundedQueue(int maxSize) {
        data = new ArrayDeque<E>();
        this.maxSize = maxSize;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return data.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }

    @Override
    public Object[] toArray() {
        return data.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return data.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return data.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return data.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return data.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return data.retainAll(c);
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public boolean add(E e) {
        if(size() >= maxSize){
            data.poll();
        }
        return data.add(e);        
    }

    @Override
    public boolean offer(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E remove() {
        return data.remove();
    }

    @Override
    public E poll() {
        return data.poll();
    }

    @Override
    public E element() {
        return data.element();
    }

    @Override
    public E peek() {
        return data.peek();
    }
}
