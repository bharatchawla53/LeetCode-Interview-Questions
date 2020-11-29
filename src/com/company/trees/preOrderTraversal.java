package com.company.trees;

import java.util.*;

public class preOrderTraversal {
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

        preOrder(node);
    }

    private static List<Integer> preOrder(Node root) {
        //linked list to store result elements
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) return result;

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            Node temp = stack.pop();
            result.addLast(temp.value); //root element of each node
            for (int i = temp.children.size() - 1; i >= 0; i--) {
                stack.push(temp.children.get(i));
            }
        }
        return result;
    }
}
