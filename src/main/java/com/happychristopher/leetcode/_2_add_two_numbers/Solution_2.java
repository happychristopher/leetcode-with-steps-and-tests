/**
 * optimized solution
 * while (carry > 0) is only necessary when both the linked lists are empty
 * carry can either be 0 or 1
 */

package com.happychristopher.leetcode._2_add_two_numbers;

import com.happychristopher.leetcode.utility.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Solution_2 {
    private final Logger logger = LoggerFactory.getLogger(Solution_2.class);

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (logger.isDebugEnabled()) {
            logger.debug(Constant.LONG_SEPARATOR);
        }

        ListNode head = new ListNode();
        ListNode pre = head;

        ListNode current1 = l1;
        ListNode current2 = l2;
        int carry = 0;

        // debug
        int count = 0;

        while (current1 != null || current2 != null) {
            if (logger.isDebugEnabled()) {
                logger.debug(l1.toString());
                logger.debug("{}+", new String(new char[count]));
                logger.debug(l2.toString());
                logger.debug("{}=", new String(new char[count]));
            }

            int val1 = 0;
            int val2 = 0;

            if (current1 != null) {
                val1 = current1.val;
                current1 = current1.next;
            }

            if (current2 != null) {
                val2 = current2.val;
                current2 = current2.next;
            }

            int sum = val1 + val2 + carry;
            pre.next = new ListNode((sum) % 10);
            pre = pre.next;

            if (logger.isDebugEnabled()) {
                logger.debug("{}, ({} + {} + {})", head.next.toString(), val1, val2, carry);
            }

            carry = sum / 10;

            if (logger.isDebugEnabled()) {
                logger.debug("carry {}\n", carry);
                count += 3;
            }
        }

        if (carry > 0) {
            pre.next = new ListNode(carry);
        }

        if (logger.isDebugEnabled()) {
            logger.debug(head.next.toString());
        }

        return head.next;
    }
}
