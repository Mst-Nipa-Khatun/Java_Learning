package com.nipa.java_learning.leetCodeSolve;

public class PivotIndex724 {
    public static void main(String[] args) {
        int[] nums={1,7,3,5,5,6};

        int leftSum=0;
        int rightSum=0;
        for(int num:nums){
            rightSum+=num; //sob sum korlam
        }
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i]; //rightsum akhon 28 ase ota theeke - korteci

            if(leftSum==rightSum){ //rifht theke minus kore jokhon rifht and left same hobe then return index hobe
                System.out.println(i);
            }
            leftSum+=nums[i]; //niche left sum e add hocche
        }
    }
}
