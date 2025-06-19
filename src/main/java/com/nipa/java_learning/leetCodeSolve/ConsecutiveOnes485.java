package com.nipa.java_learning.leetCodeSolve;

public class ConsecutiveOnes485 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1,1,1,1,1};

        int current = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 1) {
                current++;
                maxCount = Math.max(maxCount, current);
            } else {
                current = 0;
            }
        }
        System.out.println(maxCount);
    }
}
