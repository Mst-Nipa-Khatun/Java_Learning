package com.nipa.java_learning.leetCodeSolve;

import java.util.Arrays;
import java.util.Collections;

public class ThirdMaximum414 {
    public static void main(String[] args) {
        Integer nums[] = {3, 2, 1, 4, 5, 6,7,8,10,11,13,14};
        //Arrays.sort(nums);
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));
        int thirdMax = 0;

        /*for (int i = nums.length - 1; i >= 0; i--) {
           System.out.print(nums[i]+" ");
        }*/

        for (int i = 0; i < nums.length; i++) {
            //System.out.print(nums[i]+" ");
            if(nums[i] !=null){
                thirdMax=nums[2];
                System.out.print(thirdMax);
                break;
            }
        }
    }
}
