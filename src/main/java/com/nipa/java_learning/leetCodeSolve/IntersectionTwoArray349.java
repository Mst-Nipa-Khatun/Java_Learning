package com.nipa.java_learning.leetCodeSolve;

public class IntersectionTwoArray349 {
    public static void main(String[] args) {
        int[] nums1 = {9,4,9,8,4};
        int[] nums2 = {4,9,4};

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    System.out.print(nums1[i]+" ");
                    break;
                }
            }
        }
    }
}
