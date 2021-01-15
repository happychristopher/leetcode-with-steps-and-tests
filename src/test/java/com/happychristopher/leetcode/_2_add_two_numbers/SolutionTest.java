package com.happychristopher.leetcode._2_add_two_numbers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {
    Solution_2 solution = new Solution_2();

    private static List<Integer> convertArrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        return list;
    }

    private static ListNode convertArrayToListNode(int[] arr) {
        ListNode head = new ListNode();
        ListNode prev = head;

        for (int i = 0; i < arr.length; i++) {
            prev.next = new ListNode(arr[i]);
            prev = prev.next;
        }

        return head.next;
    }

    private static List<Integer> convertListNodeToArray(ListNode listNode) {
        List<Integer> list = new ArrayList<>();
        ListNode current = listNode;

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        return list;
    }

    @Test
    void addTwoNumbers() {
        assertIterableEquals(convertArrayToList(new int[]{7, 0, 8}),
                convertListNodeToArray(
                        solution.addTwoNumbers(convertArrayToListNode(new int[]{2, 4, 3}), convertArrayToListNode(new int[]{5, 6, 4}))
                ));

        assertIterableEquals(convertArrayToList(new int[]{0}),
                convertListNodeToArray(
                        solution.addTwoNumbers(convertArrayToListNode(new int[]{0}), convertArrayToListNode(new int[]{0}))
                ));

        assertIterableEquals(convertArrayToList(new int[]{8, 9, 9, 9, 0, 0, 0, 1}),
                convertListNodeToArray(
                        solution.addTwoNumbers(convertArrayToListNode(new int[]{9, 9, 9, 9, 9, 9, 9}), convertArrayToListNode(new int[]{9, 9, 9, 9}))
                ));

        assertIterableEquals(convertArrayToList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}),
                convertListNodeToArray(
                        solution.addTwoNumbers(convertArrayToListNode(new int[]{9}), convertArrayToListNode(new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9}))
                ));
    }
}