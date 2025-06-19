package com.nipa.java_learning.leetCodeSolve;

import java.util.Arrays;

public class SetMisMatch645 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int missing=0;
        int duplicate=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicate=nums[i];
                    break;
                }
            }
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i]+1!=nums[i+1]){
                missing = nums[i] + 1;
                break;
            }
        }
        if (missing == 0) {
            if (nums[0] != 1) {
                missing = 1;
            } else {
                missing = nums.length;
            }
        }

        System.out.println("Duplicate: " + duplicate + ", Missing: " + missing);
    }
}
