package com.nipa.java_learning.leetCodeSolve;

import java.util.Arrays;

public class MovesZero283 {
    public static void main(String[] args) {

        int[] nums={0,1,3,0,12,4};
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        if(count<nums.length){
            for(int i=count;i<nums.length;i++){
                nums[i]=0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
