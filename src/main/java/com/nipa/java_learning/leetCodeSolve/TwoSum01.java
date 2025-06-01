package com.nipa.java_learning.leetCodeSolve;

public class TwoSum01 {
    public TwoSum01() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {

        int[] nums = {3,2,4};
        int target = 6;
        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] + nums[j] == target){
                    System.out.println("[" +i + " " + j+"]");
                }
            }
        }
    }
}
