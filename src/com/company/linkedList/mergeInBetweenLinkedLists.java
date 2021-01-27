package com.company.linkedList;

//1669
public class mergeInBetweenLinkedLists {
    public static void main(String[] args) {
        //linked list 1
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5= new ListNode(4);
        ListNode node6 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;


        //linked list 2
        ListNode node7 = new ListNode(10000);
        ListNode node8 = new ListNode(10001);
        ListNode node9 = new ListNode(10002);

        node7.next = node8;
        node8.next = node9;

        ListNode result = mergeInBetween(node1, 3, 4, node7);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;

        while (list1 != null && list1.next.val != a) {
            list1 = list1.next;
        }

        ListNode currA = list1;

        while (currA.val != b) {
            currA = currA.next;
        }

        list1.next = list2;

        while (list2.next != null) {
            list2 = list2.next;
        }

        list2.next = currA.next;
        return curr;
    }
}
