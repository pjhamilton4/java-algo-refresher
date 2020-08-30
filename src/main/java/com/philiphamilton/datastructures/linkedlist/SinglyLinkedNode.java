package com.philiphamilton.datastructures.linkedlist;

public class SinglyLinkedNode<T> implements Node{

    private SinglyLinkedNode next;
    private T data;

    public SinglyLinkedNode(T data) {
        this.data = data;
        this.next = null;
    }

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

    @Override
    public String toString() {
        return "SinglyLinkedNode{" +
                //"next=" + next +
                "data=" + data +
                '}';
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
