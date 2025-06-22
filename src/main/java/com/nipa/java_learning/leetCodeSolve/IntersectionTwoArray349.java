package com.nipa.java_learning.leetCodeSolve;

import java.util.*;

public class IntersectionTwoArray349 {
    public static void main(String[] args) {
        int[] nums1 = {9,4,9,8,4};
        int[] nums2 = {4,9,4};

        Map<Integer, Integer> countMap = new HashMap<>();
        Set<Integer> set = new HashSet<>(); //if i use arraylist then no. of known shows,bt i i use set then just distinct value

        for (int num : nums1) {
            countMap.put(num, 1); //set one
        }

        for (int num : nums2) {
            if (countMap.containsKey(num)) {
                set.add(num);
            }
        }
        System.out.println(set);
        /*int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;*/
    }
}
