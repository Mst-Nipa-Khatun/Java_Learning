package com.nipa.java_learning;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateFromArray {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[]{1, 2, 2, 1, 2, 4, 3, 4, 4, 10, 11, 11, 7, 8, 8, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            Integer mapItem = map.get(arr[i]);
            if (mapItem != null && mapItem > 0)
                continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    Integer current = map.get(arr[i]);
                    if (current == null)
                        map.put(arr[i], 1);
                    else
                        map.put(arr[i], ++current);
                }
            }
        }

        map.forEach((t, u) -> {
            if (u > 0) {
                System.out.println(t);
            }
        });
    }

}
