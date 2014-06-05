package com.hackbulgaria.oopfun;

public interface DoubleLinkedList {
    int getHead();
    int getTail();
    void addHead(int element);
    void addTail(int element);
    int size();
    int get(int elementIndex);
    boolean popHead();
    boolean popTail();
}
