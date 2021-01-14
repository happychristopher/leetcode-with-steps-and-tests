package com.happychristopher.leetcode._1_two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {
    Solution_2 solution = new Solution_2();

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{3, 3}, 6));

        //
        assertArrayEquals(new int[]{2, 4}, solution.twoSum(new int[]{1, 2, 4, 7, 8}, 12));
        assertArrayEquals(new int[]{1, 4}, solution.twoSum(new int[]{-3, -1, 1, 4, 9, 13}, 8));
        assertNull(solution.twoSum(new int[]{3, 3}, 5));
    }
}