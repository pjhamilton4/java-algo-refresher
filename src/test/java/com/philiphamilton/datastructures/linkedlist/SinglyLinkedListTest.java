package com.philiphamilton.datastructures.linkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SinglyLinkedListTest {

    SinglyLinkedList<Integer> linkedList;

    @BeforeEach
    public void initTest() {
        System.out.println("---------------------------------------");
        linkedList = new SinglyLinkedList<Integer>();
    }

    @AfterEach
    public void cleanTeat(){
        System.out.println("---------------------------------------");
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
    public void testInsertAtBeginningNode(){
        System.out.println("Testing testInsertAtBeginningNode");

        SinglyLinkedNode<Integer> node = new SinglyLinkedNode<Integer>(1);

        linkedList.insertAtBeginning(node);

        System.out.println(linkedList.toString());

        assertEquals(Integer.valueOf(1), linkedList.getFirst());
    }

    @Test
    public void testInsertAtEnd(){
        System.out.println("Testing insertAtBeginning");
        linkedList.insertAtBeginning(1);

        System.out.println(linkedList.toString());

        System.out.println("Before: " + linkedList.toString());

        linkedList.insertAtEnd(2);

        System.out.println("After: " + linkedList.toString());

        assertEquals(2, linkedList.getLast());
    }

    @Test
    public void testInsertAtEndNode(){
        System.out.println("Testing testInsertAtEndNode");

        SinglyLinkedNode<Integer> node = new SinglyLinkedNode<Integer>(1);

        linkedList.insertAtBeginning(node);

        System.out.println(linkedList.toString());

        System.out.println("Before: " + linkedList.toString());

        node = new SinglyLinkedNode<Integer>(2);

        linkedList.insertAtEnd(node);

        System.out.println("After: " + linkedList.toString());

        assertEquals(2, linkedList.getLast());
    }

    @Test
    public void testGetAt(){
        System.out.println("Testing testGetAt() when empty");

        assertNull(linkedList.getAt(0));

        System.out.println("Testing testGetAt() with 1 entry");

        linkedList.insertAtBeginning(1);

        assertEquals(1, linkedList.getAt(0).getData());


        SinglyLinkedNode<Integer> temp = linkedList.getAt(10);

        assertNull(temp);

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

        System.out.println("Testing testRemoveNth() with multiple entries");

        linkedList = new SinglyLinkedList<Integer>();

        linkedList.insertAtBeginning(1);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(4);

        System.out.println("Before: " + linkedList.toString());

        linkedList.removeNthNode(2);

        System.out.println("After: " + linkedList.toString());

        assertEquals(3, linkedList.getSize());

        System.out.println("Before: " + linkedList.toString());

        linkedList.removeNthNode(0);

        System.out.println("After: " + linkedList.toString());

        assertEquals(2, linkedList.getSize());



    }

    @Test
    public void testAddNodeAt(){
        System.out.println("Testing testAddNodeAt() when empty");

        System.out.println("Before: " + linkedList.toString());

        linkedList.addNodeAt(0, 1);

        System.out.println("After: " + linkedList.toString());

        assertEquals(1, linkedList.getFirst());

        System.out.println("Testing testAddNodeAt() with head entry");

        linkedList.insertAtBeginning(1);

        System.out.println("Before: " + linkedList.toString());

        linkedList.addNodeAt(0, 2);

        System.out.println("After: " + linkedList.toString());

        assertEquals(2, linkedList.getAt(0).getData());

        System.out.println("Testing testAddNodeAt() with two entries - add to front");

        linkedList = new SinglyLinkedList<Integer>();

        linkedList.insertAtBeginning(2);

        linkedList.insertAtBeginning(1);

        System.out.println("Before: " + linkedList.toString());

        linkedList.addNodeAt(0, 3);

        System.out.println("After: " + linkedList.toString());

        assertEquals(3, linkedList.getAt(0).getData());

        System.out.println("Testing testAddNodeAt() with two entries - add to middle");

        linkedList = new SinglyLinkedList<Integer>();

        linkedList.insertAtBeginning(2);

        linkedList.insertAtBeginning(1);

        System.out.println("Before: " + linkedList.toString());

        linkedList.addNodeAt(1, 3);

        System.out.println("After: " + linkedList.toString());

        assertEquals(3, linkedList.getAt(1).getData());

        System.out.println("Testing testAddNodeAt() with two entries - add to end");

        linkedList = new SinglyLinkedList<Integer>();

        linkedList.insertAtBeginning(2);

        linkedList.insertAtBeginning(1);

        System.out.println("Before: " + linkedList.toString());

        linkedList.addNodeAt(2, 3);

        System.out.println("After: " + linkedList.toString());

        assertEquals(3, linkedList.getAt(2).getData());

    }

    @Test
    public void testContains(){
        System.out.println("Testing testContains() when empty");

        linkedList = new SinglyLinkedList<Integer>();

        boolean result = linkedList.contains(1);

        assertFalse(result);

        System.out.println("Testing testContains() when element is present");

        linkedList = new SinglyLinkedList<Integer>();

        linkedList.insertAtBeginning(1);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(3);

        System.out.println("List to check: " + linkedList.toString());

        result = linkedList.contains(3);

        assertTrue(result);

        result = linkedList.contains(12312);

        assertFalse(result);
    }

    @Test
    public void testGetSize(){
        System.out.println("Testing testGetSize() when empty");

        long totalSize = linkedList.getSize();

        assertEquals(0, totalSize);

        System.out.println("Testing testGetSize() with multiple entries");
        linkedList.insertAtBeginning(1);

        totalSize = linkedList.getSize();

        assertEquals(1, totalSize);

        linkedList.addNodeAt(1, 2);


        totalSize = linkedList.getSize();

        assertEquals(2, totalSize);

    }

    @Test
    public void testConstructors(){
        SinglyLinkedList<String> test = new SinglyLinkedList<String>("Test");

        assertEquals("Test", test.getFirst());

        test = new SinglyLinkedList<String>(new SinglyLinkedNode("Test"));

        assertEquals("Test", test.getFirst());

    }


}
