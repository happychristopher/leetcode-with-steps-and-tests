/**
 * hash table, O(n)
 */

package com.happychristopher.leetcode._1_two_sum;

import com.happychristopher.leetcode.utility.Output;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_2 {
    private final Logger logger = LoggerFactory.getLogger(Solution_2.class);

    public int[] twoSum(int[] nums, int target) {
        if (logger.isDebugEnabled()) {
            System.out.println();
            logger.debug("\nnums: {}, target: {}\n", nums, target);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (logger.isDebugEnabled()) {
                logger.debug("{}", nums);
                logger.debug("{}", new Output<>().printArrayMark(Arrays.stream(nums).mapToObj(num -> Integer.valueOf(num)).toArray(), "^", i));
            }

            int complement = target - nums[i];

            if (logger.isDebugEnabled()) {
                logger.debug("complement of nums[{}] is {}", i, complement);
            }

            if (map.containsKey(complement)) {
                if (logger.isDebugEnabled()) {
                    logger.debug("map {} contains key {}\nreturn map({}) and {}: {}", map, complement, complement, i, new int[]{map.get(complement), i});
                }

                return new int[]{map.get(complement), i};
            } else {
                if (logger.isDebugEnabled()) {
                    logger.debug("map {} doesn't contain key {}, put (nums[{}], {}) to map", map, complement, i, i);
                }

                map.put(nums[i], i);

                if (logger.isDebugEnabled()) {
                    logger.debug("map: {}\n", map);
                }
            }
        }

        return null;
    }
}
