package com.nipa.java_learning.leetCodeSolve;

public class RemoveDuplicate26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = 1;
        int[] nums2 = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums2[k] = nums[i];
                k++;
            }
        }
        System.out.println("output: " + k);
    }
}
