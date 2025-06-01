package com.nipa.java_learning.leetCodeSolve;

public class FindAllNumber448 {
    public static void main(String[] args) {
        int[] nums ={4,3,2,7,8,2,3,1};

        int n = nums.length;
        int sum = n * (n + 1) / 2;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        int result= sum - count;
        System.out.println(result);
    }
}
