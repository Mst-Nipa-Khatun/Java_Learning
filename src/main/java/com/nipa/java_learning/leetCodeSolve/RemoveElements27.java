package com.nipa.java_learning.leetCodeSolve;

public class RemoveElements27 {
    public static void main(String[] args) {
        /*nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]*/
        int[] nums={3,2,2,3,1,4,5,6};
        int val=3;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=val){
                nums[count]=nums[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
