package com.philiphamilton.datastructures.linkedlist.simple;

import com.philiphamilton.datastructures.linkedlist.LinkedList;

public class LinkedListSimpleImpl<T> implements LinkedList<T> {

    Node head;

    public LinkedListSimpleImpl(){
        this.head = null;
    }

    @Override
    public void insert(T newElement) {
        Node newNode = new Node(newElement);
        if(this.head == null){
            this.head = newNode;
            return;
        }
        Node n = this.head;
        while(n.next != null){
            n = n.next;
        }
        n.next = newNode;
    }

    @Override
    public void delete(T key) {
        if(this.head == null){
            return;
        }
        if(head.data == key){
            if(this.head.next != null){
                this.head = this.head.next;
            }else{
                this.head = null;
            }
            return;
        }
        Node n = this.head;
        while(n.next != null){
            if(n.next.data == key){
                n.next = n.next.next;
                return;
            }
            n = n.next;
        }
    }

    @Override
    public void display() {
        Node n = this.head;
        if(n == null){
            System.out.println("LinkedList is empty!");
            return;
        }
        System.out.print("<<HEAD>> Node: " + n.data + " --> ");
        while(n.next != null){
            System.out.print("Node: " + n.next.data + " --> ");
            n = n.next;
        }
        System.out.print("<<END>>\n");
    }

    @Override
    public T search(T key) {
        if(this.head == null){
            return null;
        }
        if(this.head.data == key){
            return (T) this.head.data;
        }
        Node n = this.head;
        while(n.next != null ){
            if(n.next.data == key){
                return (T) n.next.data;
            }
            n = n.next;
        }
        return null;
    }
}
