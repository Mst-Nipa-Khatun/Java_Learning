package com.nipa.java_learning.leetCodeSolve;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4,5,6,7,8,9};
        Map<Integer, Integer> map = new HashMap<>();
        boolean containsDuplicate = false;

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])!=null) {
                containsDuplicate = true;
                break;            }
            map.put(nums[i], i);
        }
        System.out.println(containsDuplicate);
    }
}
