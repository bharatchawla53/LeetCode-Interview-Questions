package com.company.trees;

public class searchInBST {
    public static void main(String[] args) {
        // Tree 1
        Node node1 = new Node(4);
        Node node2 = new Node(2);
        Node node3 = new Node(7);
        Node node4 = new Node(1);
        Node node5 = new Node(3);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        Node result = searchBST(node1, 2);
    }

    private static Node searchBST(Node root, int val) {
        if (root == null) return null;

        if (root.value == val) {
            return root;
        } else if (root.value > val) {
            if (root.left != null) {
                return searchBST(root.left, val);
            } else {
                return null;
            }
        } else {
            if (root.right != null) {
                return searchBST(root.right, val);
            } else {
                 return null;
            }
        }
    }
}
