package com.company.trees;

public class mergeTwoBinaryTrees {
    public static void main(String[] args) {
        // Tree 1
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(2);
        Node node4 = new Node(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;

        // Tree 2
        Node node5 = new Node(2);
        Node node6 = new Node(1);
        Node node7 = new Node(3);
        Node node8 = new Node(4);
        Node node9 = new Node(7);

        node5.left = node6;
        node5.right = node7;
        node6.right = node8;
        node7.right = node9;

        Node result = mergeTrees(node1, node5);
    }

    private static Node mergeTrees(Node t1, Node t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;

        if (t1 != null && t2 != null) {
            int sum = (t1.value != 0 ? t1.value : 0) + (t2.value != 0 ? t2.value : 0);
            t1.value = sum;
        }

        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }
}
