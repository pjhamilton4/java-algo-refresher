package com.philiphamilton.datastructures.linkedlist;

public class SinglyLinkedList<T> {

    private SinglyLinkedNode<T> head;
    private SinglyLinkedNode<T> tail;
    private long size = 0;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(T data) {
        SinglyLinkedNode<T> tempNode = new SinglyLinkedNode<T>(data);
        this.head = tempNode;
        this.tail = tempNode;
        this.size = 1;
    }

    public SinglyLinkedList(SinglyLinkedNode node) {
        this.head = node;
        this.tail = node;
        this.size = 1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtEnd(SinglyLinkedNode node) {
        this.tail.setNext(node);
        this.tail = node;
        this.size++;
    }

    public void insertAtEnd(T data) {
        SinglyLinkedNode<T> node = new SinglyLinkedNode<T>(data);
        this.tail.setNext(node);
        this.tail = node;
        this.size++;
    }

    public void insertAtBeginning(SinglyLinkedNode node) {
        node.setNext(head);
        if(isEmpty()){
            this.tail = node;
        }
        this.head = node;
        this.size++;
    }

    public void insertAtBeginning(T data) {
        SinglyLinkedNode<T> node = new SinglyLinkedNode<T>(data);
        if(isEmpty()){
            this.tail = node;
        }
        node.setNext(head);
        this.head = node;
        this.size++;
    }

    public void addNodeAt(int position, T data) {
        if (isEmpty()) {
            this.head = new SinglyLinkedNode<T>(data);
            this.tail = this.head;
            this.size++;
        } else {
           SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>(data);
           SinglyLinkedNode<T> currNode = this.head;
           SinglyLinkedNode<T> prevNode = null;
           if(position == 0){
               insertAtBeginning(newNode);
           }else {
               int index = 0;
               while( index <= position) {
                   if (index == position) {
                       newNode.setNext(currNode);
                       prevNode.setNext(newNode);
                       this.size++;
                       break;
                   }
                   if(currNode == null){
                       break;
                   }
                   prevNode = currNode;
                   currNode = currNode.getNext();
                   index++;
               }
           }
        }
    }

    public boolean contains(T target) {
        if(isEmpty()){
            return false;
        }
        SinglyLinkedNode<T> tempNode = this.head;
        while (tempNode.getNext() != null) {
            if (tempNode.getData().equals(target)) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    public void removeFirst() {
        if(isEmpty()){
            return;
        }else {
            this.head = this.head.getNext();
        }
    }

    public void removeNthNode(int position) {
        if (isEmpty()) {
            return;
        }

        if (position == 0) {
            if (this.head.getNext() != null) {
                this.head = this.head.getNext();
            } else {
                this.head = null;
            }
            this.size--;
            return;
        }

        SinglyLinkedNode<T> prevNode = this.head;
        SinglyLinkedNode<T> currNode = this.head;

        int count = 1;

        while (currNode.getNext() != null) {
            if (count == position) {
                prevNode.setNext(currNode.getNext());
                this.size--;
                break;
            } else {
                count++;
                prevNode = currNode;
                currNode = currNode.getNext();
            }
        }
    }

    public T getFirst() {
        if(!isEmpty()){
            return this.head.getData();
        }else{
            return null;
        }
    }

    public SinglyLinkedNode<T> getAt(int position){
        if(isEmpty()){
            return null;
        }

        SinglyLinkedNode<T> tempNode = this.head;
        int count = 0;

        if(position == 0){
            return tempNode;
        }

        while (count < this.size) {
            if (count == position) {
                return tempNode;
            } else {
                tempNode = tempNode.getNext();
                count++;
            }
        }

        return null;
    }

    public T getLast() {
        return this.tail.getData();
    }

    public long getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        SinglyLinkedNode<T> tempNode = this.head;
        if(tempNode != null) {
            int nodeNumber = 1;
            builder.append("[");
            builder.append("<<HEAD>>");
            builder.append(" | Data: ");
            builder.append(this.head.getData());
            builder.append("]");
            builder.append(" -> ");
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
                builder.append("[");
                builder.append("Node Number: ");
                builder.append(nodeNumber);
                builder.append(" | Data: ");
                builder.append(tempNode.getData());
                builder.append("]");
                builder.append(" -> ");
                nodeNumber++;
            }
            builder.append("[ END ]");
        }else{
            return "[ LIST IS EMPTY ]";
        }
        return builder.toString();
    }
}
