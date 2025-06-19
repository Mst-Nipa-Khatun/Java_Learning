package com.nipa.java_learning.leetCodeSolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndex599 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[]  list2 = {"Piatti","KFC","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        /*for (int i=0;i<list1.length;i++){
           for (int j=0;j<list2.length;j++){
               if (list1[i].equals(list2[j])){
                   System.out.println(list1[i]);
               }
           }
       }*/

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int sum = i + j;

                    if (sum < minSum) {
                        result.clear();
                        result.add(list1[i]);
                        minSum = sum;
                    }
                    else if (sum == minSum) {
                        result.add(list1[i]);
                    }
                }
            }
        }

        String[] output = result.toArray(new String[0]);
        System.out.println(Arrays.toString(output));    }
}
