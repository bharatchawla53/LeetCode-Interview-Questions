package com.company.trees;

import java.util.Stack;

public class isValidBst {
  public static void main(String[] args) {

        /*
                            1
                          / |  \
                        3   2    4
                      /  \
                    5      6
         */

    Node node = new Node(5);

    Node node2 = new Node(1);
    node.left = node2;

    Node node3 = new Node(4);
    node.right = node3;

    Node node4 = new Node(3);
    node3.left = node4;

    Node node5 = new Node(6);
    node3.right = node5;

    System.out.println(isValidBST(node));
  }

  public static boolean isValidBST(Node root) {
    Stack<Node> stack = new Stack<>();

    stack.push(root);

    while(!stack.isEmpty()) {
      Node node = stack.pop();

      if (node != null) {
        if (node.left != null && node.right != null) {
          if (node.left.value > node.value
                  && node.right.value < node.value) {
            return false;
          } else {
            stack.push(node.left);
            stack.push(node.right);
          }
        }
      }
    }

    return true;
  }
}
