package com.company.linkedList;

public class mergeTwoSortedLists {
    public static void main(String[] args) {
        //linked list 1
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
       /* ListNode node14 = new ListNode(9);
        ListNode node15= new ListNode(9);
        ListNode node16 = new ListNode(9);
        ListNode node17 = new ListNode(9);
        ListNode node18 = new ListNode(9);
        ListNode node19 = new ListNode(9);
        ListNode node20 = new ListNode(9);*/

        node1.next = node2;
        node2.next = node3;
       /* node3.next = node14;
        node14.next = node15;
        node15.next = node16;
        node16.next = node17;
        node17.next = node18;
        node18.next = node19;
        node19.next = node20;*/

        //linked list 2
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        /*ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(9);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(9);
        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(9);
        ListNode node13 = new ListNode(9);*/

        node4.next = node5;
        node5.next = node6;
        /*node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;*/

        ListNode result = mergeTwoLists(new ListNode(5), node4);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return  l1;

        ListNode result = new ListNode(0);
        ListNode temp = result;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val > l2.val) {
                    temp.next = new ListNode(l2.val);
                    temp = temp.next;
                    if (l2 != null) {
                        l2 = l2.next;
                    }
                } else {
                    temp.next = new ListNode(l1.val);
                    temp = temp.next;
                    if (l1 != null) {
                        l1 = l1.next;
                    }
                }
            } else if (l1 == null && l2 != null){
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                if (l2 != null) {
                    l2 = l2.next;
                }
            } else if (l2 == null && l1 != null){
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
            }
        }
        return result.next;
    }
}

