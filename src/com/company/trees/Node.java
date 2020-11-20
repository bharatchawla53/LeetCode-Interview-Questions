package com.company.trees;

import java.util.ArrayList;
import java.util.List;

class Node {
    int value;
    Node left;
    Node right;

    List<Node> children = new ArrayList<>();


    public Node(int value) {
        this.value = value;
    }

    public Node(int value, List<Node> children) {
        this.value = value;
        this.children = children;
    }
}
