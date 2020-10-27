package by.bsu.algorithms.lab4.binaryTree;

import by.bsu.algorithms.lab4.node.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node node;;

    public BinaryTree() {
    }

    public BinaryTree(int num) {
        this.node = new Node(num);
    }

    public BinaryTree(int[] arr) {
        Node nodeMethod = new Node();
        Node current = new Node(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            nodeMethod.addRecursive(current, arr[i]);
        }
        this.node = current;
    }

    public Node getNode() {
        return node;
    }

    public boolean find( int key) {
        return Node.findRecursive(this.node, key);
    }

    public void add(int key){
        Node node1 = new Node();
        node1.addRecursive(this.node, key);
    }

    public static void travelInOrder(Node node) {
        if (node != null) {
            travelInOrder(node.getLeft());
            System.out.print(node.getKey() + " ");
            travelInOrder(node.getRight());
        }
    }

    public static void travel2(Node node) {
        if (node != null) {
            travel2(node.getLeft());
            travel2(node.getRight());
            System.out.print(node.getKey() + " ");
        }
    }

    public static void travel3(Node node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            travel3(node.getLeft());
            travel3(node.getRight());
        }
    }

    public static void traverseLevelOrder(Node node) {
        if (node == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(node);

        while (!nodes.isEmpty()) {

            Node node1 = nodes.remove();

            System.out.print(" " + node1.getKey());

            if (node1.getLeft() != null) {
                nodes.add(node1.getLeft());
            }

            if (node1.getRight()!= null) {
                nodes.add(node1.getRight());
            }
        }
    }

    public int height(Node node)
    {
        if(node == null){
            return 0;
        }
        else{
            int left = height(node.getLeft());
            int right = height(node.getRight());
            if(left > right){
                return 1 + left;
            }
            else{
                return 1 + right;
            }
        }
    }


}
