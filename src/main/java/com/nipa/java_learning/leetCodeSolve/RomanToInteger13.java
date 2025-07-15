package com.nipa.java_learning.leetCodeSolve;

import java.util.HashMap;

public class RomanToInteger13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2;i>=0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result = result - map.get(s.charAt(i));

            } else {
                result = result + map.get(s.charAt(i));

            }
        }
        System.out.println(result);
    }
}
