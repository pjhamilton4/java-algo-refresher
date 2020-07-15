package com.philiphamilton.linkedlist;

public class SinglyLinkedNode<T> {

    SinglyLinkedNode next;
    T data;

    public SinglyLinkedNode(SinglyLinkedNode next, T data) {
        this.next = next;
        this.data = data;
    }

    public SinglyLinkedNode getNext() {
        return next;
    }

    public void setNext(SinglyLinkedNode next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
