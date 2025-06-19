package com.nipa.java_learning.leetCodeSolve;

import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args) {
      int[] arr ={3, 0, 1,4};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+1!=arr[i+1])
            {
                System.out.println(arr[i]+1);
                break;
            }
        }
        /*int[] nums = {3, 0, 2, 1, 4, 5, 7};

        int n = nums.length;
        int sum = n * (n + 1) / 2;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        //System.out.println(count);
        int result = sum - count;
        System.out.println(result);*/
    }
}
