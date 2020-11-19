package com.company.linkedList;

import java.util.HashSet;
import java.util.Set;

public class intersectionOfTwoLists {
    public static void main(String[] args) {
        //linked list 1
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(8);
        ListNode node14 = new ListNode(4);
        ListNode node15= new ListNode(5);
       /* ListNode node16 = new ListNode(9);
        ListNode node17 = new ListNode(9);
        ListNode node18 = new ListNode(9);
        ListNode node19 = new ListNode(9);
        ListNode node20 = new ListNode(9);*/

        node1.next = node2;
        node2.next = node3;
        node3.next = node14;
        node14.next = node15;
        /*node15.next = node16;
        node16.next = node17;
        node17.next = node18;
        node18.next = node19;
        node19.next = node20;*/

        //linked list 2
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(8);
        ListNode node8 = new ListNode(4);
        ListNode node9 = new ListNode(5);
        /*ListNode node10 = new ListNode(9);
        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(9);
        ListNode node13 = new ListNode(9);*/

        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
       /* node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;*/

        ListNode result = getIntersectionNode(node1, node4);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) return null;

        Set<ListNode> hashSet = new HashSet<>();
        while (headA != null) {
            hashSet.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (hashSet.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
