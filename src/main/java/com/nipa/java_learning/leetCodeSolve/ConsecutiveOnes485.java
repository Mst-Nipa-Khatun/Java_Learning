package com.nipa.java_learning.leetCodeSolve;

public class ConsecutiveOnes485 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                maxCount = nums[i];
                maxCount++;
                break;
            } else {
                maxCount = 0;
            }
        }
        System.out.println(maxCount);
    }
}
