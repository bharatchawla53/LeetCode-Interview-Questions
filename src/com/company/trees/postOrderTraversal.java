package com.company.trees;


import java.util.*;

public class postOrderTraversal {
    public static void main(String[] args) {

        /*
                            1
                          / |  \
                        3   2    4
                      /  \
                    5      6
         */

        Node node = new Node(1);

        node.children.add(new Node(3));
        node.children.add(new Node(2));
        node.children.add(new Node(4));

        node.children.get(0).children.add(new Node(5));
        node.children.get(0).children.add(new Node(6));

        postOrder(node);
    }

    private static List<Integer> postOrder(Node root) {
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null) return list;

        Deque<Node> stack = new ArrayDeque<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            list.addFirst(temp.value);
            for (Node child : temp.children) {
                Optional.ofNullable(child).ifPresent(stack::push);
            }
        }

        return list;

    }
}
