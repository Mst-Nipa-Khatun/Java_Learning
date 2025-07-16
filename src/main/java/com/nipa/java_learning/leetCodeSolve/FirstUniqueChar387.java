package com.nipa.java_learning.leetCodeSolve;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar387 {
    public static void main(String[] args) {
        String s="leetcode";

        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        int result=-1;
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
