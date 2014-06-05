package com.hackbulgaria.oopfun;

import javax.lang.model.type.NullType;

public class SmartStack {
    private Object[] data;
    private int size;
    private int capacity;
    
    public SmartStack(int capacity){
        this.capacity = capacity;
        data = new Object[capacity];
        size = 0;        
    }
    
    public boolean push(Object element){
        if(capacity <= size) return false;
        for(int i = 0; i < size; i++){
            if(element.getClass().isInstance(data[i])){
                if(element.equals(data[i])){
                    return false;
                }
            }
        }
        data[size++] = element;
        return true;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public boolean pop(){
        if(isEmpty()){
            return false;
        }
        size--;
        data[size] = null;
        return true;
    }
    
    public Object top() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        
        return data[size - 1];
    }
    
    public int getSize(){
        return size;
    }
}
