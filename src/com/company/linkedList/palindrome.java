package com.company.linkedList;

public class palindrome {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(isPalindrome(node1));
    }

    /*private static boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        LinkedList<Integer> linkedList = new LinkedList<>();

        while (head != null) {
            linkedList.addLast(head.val);
            head = head.next;
        }
        int start = 0;
        int end = linkedList.size() - 1;
        while (start <= end) {
            if (!linkedList.get(start).equals(linkedList.get(end))) {
               return false;
            }
            start++;
            end--;
        }

        return true;
    }*/

    private static boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null && slow.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;

        ListNode reverseList = reverse(slow);

        while (reverseList != null) {
            if (reverseList.val != fast.val) return false;
            reverseList = reverseList.next;
            fast = fast.next;
        }

        return true;
    }

    private static ListNode reverse(ListNode slow) {
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
