package com.nipa.java_learning.leetCodeSolve;

public class SearchInsert35 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int result = searchInsert(arr, 3);
        System.out.println(result);
    }
    public static int searchInsert(int[] nums, int target) {
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                current = i;
                break;
            }
            if (nums[i] > target) {
                current = i;
                break;
            }
            if (i == nums.length - 1) {
                current = i + 1;
                break;
            }
            int currentNext = nums[i + 1];
            if (currentNext > target) {
                current = i + 1;
                break;
            }
        }
        return current;
    }

}
