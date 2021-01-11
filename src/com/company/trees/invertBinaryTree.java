package com.company.trees;

public class invertBinaryTree {
    public static void main(String[] args) {
        Node node1 = new Node(4);
        Node node2 = new Node(2);
        Node node3 = new Node(7);
        Node node4 = new Node(1);
        Node node5 = new Node(3);
        Node node6 = new Node(6);
        Node node7 = new Node(9);


        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node7;
        node3.left = node6;

        invertTree(node1);
    }

    private static Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;

        return root;
    }
}
