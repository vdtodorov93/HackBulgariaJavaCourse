package com.hackbulgaria.oopfun;

public class ArrayStack {
    private int[] data;
    private int currentSize;
    private int capacity;
    
    public ArrayStack(int startCapacity)
    {
       capacity = startCapacity;
       data = new int[capacity];
    }
    
    public boolean push(int element){
        if(capacity <= currentSize){
            return false;
        }
        data[currentSize++] = element;
        return true;
    }
    
    public boolean isEmpty(){
        return currentSize == 0;
    }
    
    public boolean pop(){
        if(isEmpty()){
            return false;
        }
        currentSize--;
        return true;
    }
    
    public int top(){
        if(currentSize > 0){
            return data[currentSize-1];
        }
        return -1;
    }
};
