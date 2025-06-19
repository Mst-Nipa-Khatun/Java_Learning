package com.nipa.java_learning.leetCodeSolve;

import java.util.Arrays;

public class ArrayPartition561 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 3, 2};

        int sum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
