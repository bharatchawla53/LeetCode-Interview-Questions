package com.company.trees;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public List<Node> children = new ArrayList<>();


    public Node() { }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, List<Node> children) {
        this.value = value;
        this.children = children;
    }
}
