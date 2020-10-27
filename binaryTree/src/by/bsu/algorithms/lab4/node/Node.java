package by.bsu.algorithms.lab4.node;

public class Node {
    private int key;
    private Node left;
    private Node right;

    public Node() {
    }

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public Node[] intToNodeArr(int[] arr) {
        Node[] arrNode = new Node[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arrNode[i] = new Node(arr[i]);
        }
        return arrNode;
    }

    public int getKey() {
        return key;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node addRecursive(Node current, int key) {
        if (current == null) {
            return new Node(key);
        }
        if (key < current.getKey()) {
            current.left = addRecursive(current.left, key);
        }
        if (key > current.getKey()) {
            current.right = addRecursive(current.right, key);
        }
        return current;
    }

    public static boolean findRecursive(Node current, int key) {
        if (current == null) {
            return false;
        }
        if (current.getKey() == key) {
            return true;
        }
        if (key < current.getKey()) {
            return findRecursive(current.left, key);
        }
        if (key > current.getKey()) {
            return findRecursive(current.right, key);
        }
        return false;
    }
}
