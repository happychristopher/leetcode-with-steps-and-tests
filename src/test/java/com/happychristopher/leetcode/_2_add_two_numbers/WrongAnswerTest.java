package com.happychristopher.leetcode._2_add_two_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WrongAnswerTest {
    WrongAnswer solution = new WrongAnswer();

    @Test
    void addTwoNumbers() {
        assertEquals(807, solution.convertListToInteger(
                solution.addTwoNumbers(solution.convertIntegerToList(342), solution.convertIntegerToList(465))));

        assertEquals(0, solution.convertListToInteger(
                solution.addTwoNumbers(solution.convertIntegerToList(0), solution.convertIntegerToList(0))));

        assertEquals(10009998, solution.convertListToInteger(
                solution.addTwoNumbers(solution.convertIntegerToList(9999999), solution.convertIntegerToList(9999))));

        assertEquals(10_000_000_000l, solution.convertListToInteger(
                solution.addTwoNumbers(solution.convertIntegerToList(9), solution.convertIntegerToList(99_999_999_91l))));
    }
}