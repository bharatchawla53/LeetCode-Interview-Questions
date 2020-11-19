package com.company.linkedList;

public class deleteNode {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        deleteNodeFromList(node2);
    }

    //node is the given node to be deleted from the linked list
    private static void deleteNodeFromList(ListNode node) {
        // 4 5 1 9 ---> delete node 5 ---> 4 1 9
        //change the pointer to remove a node from linked list
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
