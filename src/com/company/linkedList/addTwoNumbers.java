package com.company.linkedList;

import java.math.BigInteger;

public class addTwoNumbers {
    public static void main(String[] args) {
        //linked list 1
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node14 = new ListNode(9);
        ListNode node15= new ListNode(9);
        ListNode node16 = new ListNode(9);
        ListNode node17 = new ListNode(9);
        ListNode node18 = new ListNode(9);
        ListNode node19 = new ListNode(9);
        ListNode node20 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node14;
        node14.next = node15;
        node15.next = node16;
        node16.next = node17;
        node17.next = node18;
        node18.next = node19;
        node19.next = node20;

        //linked list 2
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(9);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(9);
        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(9);
        ListNode node13 = new ListNode(9);

        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;

        ListNode result = addNumbers(node1, node4);
        addNumbersWithIntConversion(node1, node4);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode addNumbersWithIntConversion(ListNode l1, ListNode l2) {
        BigInteger num1 = new BigInteger("0");
        BigInteger num2 = new BigInteger("0");
        BigInteger sum;

        ListNode resultNode = new ListNode(0);
        ListNode p = resultNode;

        String num1String = "", num2String = "";

        while (l1 != null) {
            num1String += l1.val;
            l1 = l1.next;
        }


        while (l2 != null) {
            num2String += l2.val;
            l2 = l2.next;
        }

        for (int i = num1String.length()-1; i >= 0 ; i--) {
            BigInteger multiply = num1.multiply(new BigInteger("10"));
            BigInteger intValue = BigInteger.valueOf(Long.parseLong(String.valueOf(num1String.charAt(i))));
            num1 = multiply.add(intValue);
        }

        for (int i = num2String.length()-1; i >= 0 ; i--) {
            BigInteger multiply = num2.multiply(new BigInteger("10"));
            BigInteger intValue = BigInteger.valueOf(Long.parseLong(String.valueOf(num2String.charAt(i))));
            num2 = multiply.add(intValue);
        }

        System.out.println(num1.intValue());
        System.out.println(num2.intValue());
        sum = num1.add(num2);
        System.out.println(sum);

        while (sum.compareTo(BigInteger.ZERO) > 0) {
            BigInteger temp = sum.mod(new BigInteger("10"));
            sum = sum.divide(new BigInteger("10"));
            ListNode tempNode = new ListNode(temp.intValue()); //temp node to hold sum value of each node
            p.next = tempNode;
            p = p.next;
        }

        return resultNode.next != null ? resultNode.next : resultNode;
    }

    private static ListNode addNumbers(ListNode l1, ListNode l2) {
        // 2 4 3
        // 5 6 4
        // 342 + 465 = 807
        // [7 0 8]
        int carry = 0, sum = 0;
        ListNode result = new ListNode(0);
        ListNode p = result;

        while (l1 != null || l2 != null) {
            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;

            if (sum > 9) { // number not a single digit
                carry = sum / 10;
                sum = sum % 10;
            } else {
                carry = 0; //setting it back to zero for next calculation
            }

            ListNode tempNode = new ListNode(sum); //temp node to hold sum value of each node
            p.next = tempNode;
            p = p.next;

            //move to the next node for both lists
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        //if carry > 0 has to be added to the next node
        if (carry > 0) {
            p.next = new ListNode(carry);
        }
        return result.next;
    }

}
