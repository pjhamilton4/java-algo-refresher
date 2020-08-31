package com.philiphamilton;

import com.philiphamilton.algorithms.recursion.Basic;
import com.philiphamilton.datastructures.linkedlist.SinglyLinkedList;
import com.philiphamilton.datastructures.tree.binary.BinaryTree;

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

        System.out.println("------------------------------------------------------------");


        //Tree

        // Binary Tree

        BinaryTree bt = new BinaryTree();

        bt.add(8);
        bt.add(500);
        bt.add(502);
        bt.add(2);
        bt.add(499);
        bt.add(1);
        bt.add(1000);
        bt.add(501);

        bt.traverseInOrder(bt.getRoot());

        // Recursion
        int test = Basic.fib(25);
        System.out.println("Recursive fib: " + test);
    }
}
