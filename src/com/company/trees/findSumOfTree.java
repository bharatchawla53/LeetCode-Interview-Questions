package com.company.trees;

public class findSumOfTree {

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

        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        System.out.println("Sum of the tree: " + sumValues(node1));
    }

    private static int sumValues(Node root) {
        if (root == null) {
            return 0;
        }
        return root.value + sumValues(root.left) + sumValues(root.right);
    }
}




