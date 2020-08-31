package com.philiphamilton.datastructures.tree.binary;

public class BinaryTree {
    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.data) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.data) {
            return true;
        }
        return value < current.data
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.data) {
            // Node to delete found
            // ... code to delete the node will go here
        }
        if (value < current.data) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public void traverseInOrder(Node node) {
        System.out.println("Current node: " + node);
        if (node != null) {
            System.out.println("Left node");
            traverseInOrder(node.left);
            System.out.println("Right node");
            traverseInOrder(node.right);
        }
    }

    public Node getRoot(){
        return this.root;
    }
}
