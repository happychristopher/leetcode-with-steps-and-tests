package com.happychristopher.leetcode._2_add_two_numbers;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        ListNode current = this;
        while (current != null) {
            stringBuilder.append(current.val);

            if (current.next != null) {
                stringBuilder.append("->");
            }

            current = current.next;
        }

        return stringBuilder.toString();
    }
}
