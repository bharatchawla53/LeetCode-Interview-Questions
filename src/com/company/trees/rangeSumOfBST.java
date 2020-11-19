package com.company.trees;

public class rangeSumOfBST {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(5);
        Node node3 = new Node(15);
        Node node4 = new Node(3);
        Node node5 = new Node(7);
        Node node6 = new Node(18);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        int low = 7, high = 15;
        System.out.println("Sum of the tree: " + sumValues(node1, low, high));
    }

    private static int sumValues(Node root, int low, int high) {
        if (root == null){
            return 0;
        }

        int sum = 0;

        if (root.value >= low && root.value <= high) {
            sum += root.value;
        }

        sum += sumValues(root.left, low, high);
        sum += sumValues(root.right, low, high);

        return sum;
    }

}
