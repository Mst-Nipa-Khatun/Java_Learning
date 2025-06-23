package com.nipa.java_learning.leetCodeSolve;

import java.util.HashMap;
import java.util.Map;

public class FindTheDiff389 {
    public static void main(String[] args) {
        // s = "abcd", t = "abcde"
        String s = "";
        String t = "a";

        Map<Character,Integer> map=new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                System.out.println(ch);
            break;
            }
            else {
                map.put(ch, map.get(ch) - 1);
            }
        }

    }
}
