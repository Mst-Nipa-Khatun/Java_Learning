package com.nipa.java_learning.leetCodeSolve;

import java.util.*;

public class IntersectionTwoArray349 {
    public static void main(String[] args) {
        int[] nums1 = {9,4,9,8,4};
        int[] nums2 = {4,9,4};

       /* Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], i);
        }
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            if (map1.containsKey(num) ) {
                map2.put(num, map1.get(num));
            }
        }
        //System.out.println(map1);*/

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums1) {
            countMap.put(num, 1);
        }

        Set<Integer> knownNumbers = new HashSet<>(); //if i use arraylist then no. of known shows,bt i i use set then just distinct value

        for (int num : nums2) {
            if (countMap.containsKey(num)) {
                knownNumbers.add(num);
            }
        }
        System.out.println(knownNumbers);
        /*int[] result = new int[knownNumbers.size()];
        int i = 0;
        for (int num : knownNumbers) {
            result[i++] = num;
        }

        return result;*/
    }
}
