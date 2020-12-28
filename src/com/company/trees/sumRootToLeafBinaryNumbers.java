package com.company.trees;


public class sumRootToLeafBinaryNumbers {
    private static int sum = 0;

    public static void main(String[] args) {

        /*
            node in a tree looks like this:
                           2
                          /   \
                        3       4
                      /  \
                    5      6

                in this case the root is 2
        */

        Node node1 = new Node(1);
        Node node2 = new Node(0);
        Node node3 = new Node(1);
        Node node4 = new Node(0);
        Node node5 = new Node(1);
        Node node6 = new Node(0);
        Node node7 = new Node(1);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        System.out.println("Sum of the tree: " + sumRootToLeaf(node1));
    }

    private static int sumRootToLeaf(Node root) {
        preOrder(root, 0);
        return sum;

    }

    private static void preOrder(Node root, int i) {
        if (root != null) {
            i = (i << 1) | root.value;
            if (root.left == null && root.right == null) {
                sum += i;
            }
            preOrder(root.left, i);
            preOrder(root.right, i);
        }

    }
}
