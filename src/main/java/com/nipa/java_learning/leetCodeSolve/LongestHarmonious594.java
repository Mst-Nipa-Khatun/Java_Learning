package com.nipa.java_learning.leetCodeSolve;

import java.util.Arrays;

public class LongestHarmonious594 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 4,4, 6, 7, 8, 9 };

        Arrays.sort(nums);
        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - nums[sum] > 1)
            {
                sum++;
            }
            if (nums[i] - nums[sum] == 1)
            {
                maxLen = Math.max(maxLen, i - sum + 1);
            }
        }
        System.out.println(maxLen);
    }
}
