package com.company.linkedList;

public class middleOfTheLinkedList {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.println(findMiddleOfLinkedList(node1));
    }

    private static ListNode findMiddleOfLinkedList(ListNode head) {
        ListNode[] A = new ListNode[100]; //creating an array so we can get index of listnode
        int lengthOfList = 0;
        while(head != null) {
            A[lengthOfList++] = head;
            head = head.next;
        }
        return A[lengthOfList / 2];
    }

}
