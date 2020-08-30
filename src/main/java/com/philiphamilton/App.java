package com.philiphamilton;

import com.philiphamilton.algorithms.recursion.Basic;
import com.philiphamilton.datastructures.linkedlist.SinglyLinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        System.out.println("Creating linked list!");
        SinglyLinkedList<Integer> linked = new SinglyLinkedList<Integer>(1);
        System.out.println(linked.toString());
        System.out.println(linked.getSize());
        System.out.println("Insert at beginning!");
        linked.insertAtBeginning(5);
        System.out.println(linked.toString());
        System.out.println(linked.getSize());
        System.out.println("Insert at beginning!");
        linked.insertAtBeginning(6);
        System.out.println(linked.toString());
        System.out.println(linked.getSize());
        System.out.println("Insert at end!");
        linked.insertAtEnd(4);
        System.out.println(linked.toString());
        System.out.println(linked.getSize());


        // Recursion
        int test = Basic.fib(25);
        System.out.println("Recursive fib: " + test);
    }
}
