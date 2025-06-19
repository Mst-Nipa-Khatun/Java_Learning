package com.nipa.java_learning.leetCodeSolve;

public class RemoveDuplicate26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            else {
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
