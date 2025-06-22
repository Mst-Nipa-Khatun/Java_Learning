package com.nipa.java_learning.leetCodeSolve;

import java.util.*;

public class IntersectionTwoArraySecond350 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,1,2,4};
        int[] nums2 = {2,2,4};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        /*int[] result = new int[list.size()];
        int i = 0;
        for (int num : list) {
            result[i++] = num;
        }*/
        System.out.println(list);
    }
}
