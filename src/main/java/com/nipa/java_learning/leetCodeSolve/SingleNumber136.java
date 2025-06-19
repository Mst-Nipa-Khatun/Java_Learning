package com.nipa.java_learning.leetCodeSolve;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber136 {
    public static void main(String[] args) {

        /*int[] nums={4,12,12,1,2,1,2};

        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    System.out.println(nums[i]);
                }
            }
        }*/

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] nums={4,12,12,1,2,1,2,3};
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.get(current) == null) {
                map.put(current, current);
            } else {
                map.remove(current);
            }
        }
        //Integer singleNumber = map.keySet().iterator().next();
        //System.out.println(singleNumber);
        map.keySet().forEach(System.out::println);
    }
}
