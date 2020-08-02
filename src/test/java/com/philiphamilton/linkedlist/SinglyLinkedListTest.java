package com.philiphamilton.linkedlist;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    SinglyLinkedList<Integer> linkedList;

    @Before
    public void before(){
        System.out.println("---------------------------------------");
        linkedList = new SinglyLinkedList<Integer>();
    }

    @Test
    public void testIsEmpty(){
        System.out.println("Testing isEmpty()");
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testInsertAtBeginning(){
        System.out.println("Testing insertAtBeginning");
        linkedList.insertAtBeginning(1);

        System.out.println(linkedList.toString());

        assertEquals(Integer.valueOf(1), linkedList.getFirst());
    }

    @Test
    public void testRemoveFirstWhenEmpty(){
        System.out.println("Testing removeFirst() when empty");

        System.out.println("Before: " + linkedList.toString());

        linkedList.removeFirst();

        System.out.println("After: " + linkedList.toString());

        assertNull(linkedList.getFirst());
    }

    @Test
    public void testRemoveFirstWithObjects(){
        System.out.println("Testing removeFirst() with one entry");

        linkedList.insertAtBeginning(1);

        System.out.println("Before: " + linkedList.toString());

        linkedList.removeFirst();

        System.out.println("After: " + linkedList.toString());

        assertNull(linkedList.getFirst());

        System.out.println("Testing removeFirst() with multiple entries");

        linkedList.insertAtBeginning(1);
        linkedList.insertAtBeginning(2);

        System.out.println("Before: " + linkedList.toString());

        linkedList.removeFirst();

        System.out.println("After: " + linkedList.toString());
    }

    @Test
    public void testRemoveNth(){
        System.out.println("Testing testRemoveNth() when empty");

        System.out.println("Before: " + linkedList.toString());

        linkedList.removeNthNode(0);

        System.out.println("After: " + linkedList.toString());

        assertNull(linkedList.getFirst());

        System.out.println("Testing testRemoveNth() with one entry");

        linkedList.insertAtBeginning(1);

        System.out.println("Before: " + linkedList.toString());

        linkedList.removeNthNode(0);

        System.out.println("After: " + linkedList.toString());

        assertNull(linkedList.getFirst());
    }

}
