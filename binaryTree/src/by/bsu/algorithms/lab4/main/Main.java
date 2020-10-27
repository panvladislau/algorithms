package by.bsu.algorithms.lab4.main;

import by.bsu.algorithms.lab4.binaryTree.BinaryTree;
import by.bsu.algorithms.lab4.node.Node;

public class Main {
    public static void main(String[] args) {
        Node node = new Node();
        int[] arr = {4,3,7,8,9,5,2,1};
        //int arr = 2;
        BinaryTree binaryTree = new BinaryTree(arr);
        binaryTree.add(10);
        System.out.println(binaryTree.find(10));
        System.out.println(binaryTree.find(11));
        BinaryTree.traverseLevelOrder(binaryTree.getNode());
        System.out.println();
        BinaryTree.travel2(binaryTree.getNode());
        System.out.println();
        BinaryTree.travel3(binaryTree.getNode());
        System.out.println();
        BinaryTree.travelInOrder(binaryTree.getNode());
        System.out.println();
        System.out.println(binaryTree.height(binaryTree.getNode()));;
    }
}
