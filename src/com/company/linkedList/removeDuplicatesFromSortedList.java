package com.company.linkedList;

public class removeDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        //ListNode node4 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;

        ListNode result = deleteDuplicates(node1);
    }

    private static ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;
        ListNode currNode = head;

        while (currNode != null && currNode.next != null) {
            if (currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            } else{
                currNode = currNode.next;
            }
        }
        return head;
    }
}
