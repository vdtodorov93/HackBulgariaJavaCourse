package com.hackbulgaria.oopfun;

public class StackWithLinkedList {
    private DoubleLinkedListImpl data;
    
    public StackWithLinkedList(){
        data = new DoubleLinkedListImpl();
    }
    
    public boolean isEmpty(){
        return data.size() == 0;
    }
    
    public boolean pop(){
        return data.popTail();
    }
    
    public int top(){
        return data.getTail();
    }
    
    public boolean push(int element){
        data.addTail(element);
        return true;
    }
}
