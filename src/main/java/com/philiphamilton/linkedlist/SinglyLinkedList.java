package com.philiphamilton.linkedlist;

public class SinglyLinkedList<T> {

    private SinglyLinkedNode<T> head;
    private SinglyLinkedNode<T> tail;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(T data){
        SinglyLinkedNode<T> tempNode = new SinglyLinkedNode<T>(data);
        this.head = tempNode;
        this.tail = tempNode;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insertAtEnd(SinglyLinkedNode node){
        this.tail.setNext(node);
        this.tail = node;
    }

    public void insertAtBegining(SinglyLinkedNode node){
        node.setNext(head);
        this.head = node;
    }

    public void addNodeAt(int position, T data){

    }

    public T getFirst(){
        return this.head.getData();
    }

    public T getLast(){
        return this.tail.getData();
    }

    public boolean contains(T target){
        return false;
    }

    public void removeFirst(){
        this.head = this.head.getNext();
    }

    public void removeNthNode(){

    }

    public int size(){
        return 0;
    }

    
}
