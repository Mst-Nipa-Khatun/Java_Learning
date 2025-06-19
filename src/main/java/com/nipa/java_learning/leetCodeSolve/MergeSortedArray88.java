package com.nipa.java_learning.leetCodeSolve;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

        /*Wrong approach
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int temp=0;
        for (int i= 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                    temp=nums1[i]+nums2[j];
            }
        }
        //Arrays.sort(temp);
        System.out.println(temp);*/


    }
}
