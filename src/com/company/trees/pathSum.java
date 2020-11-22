package com.company.trees;

public class pathSum {
    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(4);
        Node node3 = new Node(8);
        Node node4 = new Node(11);
        Node node5 = new Node(13);
        Node node6 = new Node(4);
        Node node7 = new Node(7);
        Node node8 = new Node(2);
        Node node9 = new Node(1);


        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node4.left = node7;
        node4.right = node8;
        node3.left = node5;
        node3.right = node6;
        node6.right = node9;

        System.out.println(hasPathSum(node1, 22));
    }

    private static boolean hasPathSum(Node root, int sum) {
        if (root == null) return false;

        if (root.value == sum && root.left == null && root.right == null) {
            return true;
        }

        return hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value);
    }
}
