package com.philiphamilton;

import com.philiphamilton.algorithms.recursion.Basic;
import com.philiphamilton.algorithms.sort.bubble.BubbleSort;
import com.philiphamilton.datastructures.linkedlist.simple.LinkedListSimpleImpl;
import com.philiphamilton.datastructures.linkedlist.singly.SinglyLinkedList;
import com.philiphamilton.datastructures.tree.binary.BinaryTree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        System.out.println("------------------- LINKED LIST - SIMPLE -------------------");

        LinkedListSimpleImpl<Integer> simple = new LinkedListSimpleImpl<Integer>();
        simple.insert(1);
        simple.insert(2);
        simple.insert(3);
        simple.display();

        System.out.println("------------------- LINKED LIST - SIMPLE END -------------------");

        System.out.println("------------------- LINKED LIST - ADV -------------------");

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

        System.out.println("------------------- LINKED LIST - ADV END -------------------");


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

        System.out.println("-------------------  RECURSION - SIMPLE -------------------");
        int test = Basic.fib(25);
        System.out.println("Recursive fib: " + test);

        System.out.println("-------------------  RECURSION - SIMPLE END -------------------");


        System.out.println("-------------------  SORTING - BUBBLE SORT SIMPLE -------------------");
        BubbleSort<?> bubs = new BubbleSort<Integer>(new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        System.out.println(bubs.toString());
        bubs.sort();
        System.out.println(bubs.toString());
        bubs = new BubbleSort<Integer>(new Integer[]{9, 8, 5, 5, 5, 4, 3, 2, 1});
        System.out.println(bubs.toString());
        bubs.sort();
        System.out.println(bubs.toString());

        bubs = new BubbleSort<Double>(new Double[]{1.0,1.2,1.22,1.3,4.0,5.0,20.1111111111111,3.222222222,33422.32423});
        System.out.println(bubs.toString());
        bubs.sort();
        System.out.println(bubs.toString());

        bubs = new BubbleSort<Character>("zyxwvutsrqponmlkjihgfedcba".chars().mapToObj(c -> (char)c).toArray(Character[]::new));
        System.out.println(bubs.toString());
        bubs.sort();
        System.out.println(bubs.toString());
        System.out.println("-------------------  SORTING - BUBBLE SORT SIMPLE END -------------------");
    }
}
