/**
 * According to the problem description, the number of nodes in the linked list can go as high as 100,
 * therefore the value it represents can be way beyond what the Java primitive types can represent
 */

package com.happychristopher.leetcode._2_add_two_numbers;

public class WrongAnswer {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long result = convertListToInteger(l1) + convertListToInteger(l2);

        return convertIntegerToList((int) result);
    }

    public long convertListToInteger(ListNode listNode) {
        long result = 0;
        int exponent = 0;

        ListNode current = listNode;

        while (current != null) {
            result += current.val * Math.pow(10, exponent);
            exponent++;
            current = current.next;
        }

        return result;
    }

    public ListNode convertIntegerToList(long val) {
        ListNode head = new ListNode();
        ListNode pre = head;

        while (val / 10 > 0) {
            pre.next = new ListNode((int) (val % 10));
            val = val / 10;
            pre = pre.next;
        }

        pre.next = new ListNode((int) val);

        return head.next;
    }
}

/**
 * Submission Detail
 * 792 / 1568 test cases passed.
 * Status: Wrong Answer
 * Submitted: 0 minutes ago
 * Input:
 * [9]
 * [1,9,9,9,9,9,9,9,9,9]
 * Output:
 * [-2147483640]
 * Expected:
 * [0,0,0,0,0,0,0,0,0,0,1]
 */
