package com.company.recursion;

import com.company.trees.Node;

public class increasingOrderSearchTree {
    static Node curr;
    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(1);
        Node node3 = new Node(7);

        node1.left = node2;
        node1.right = node3;

        increasingBST(node1);
    }

    private static Node increasingBST(Node root) {

        Node dummy = new Node(0);
        curr = dummy;
        inOrder(root);

        return dummy.right;
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        root.left = null;
        curr.right = root;
        curr = root;
        inOrder(root.right);
    }

}