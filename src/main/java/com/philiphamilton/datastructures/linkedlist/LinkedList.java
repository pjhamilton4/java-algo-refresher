package com.philiphamilton.datastructures.linkedlist;

public interface LinkedList<T> {
    public void insert(T newElement);
    public void delete(T key);
    public void display();
    public T search(T key);
}
