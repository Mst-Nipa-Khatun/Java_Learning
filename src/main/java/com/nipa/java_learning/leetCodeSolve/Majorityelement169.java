package com.nipa.java_learning.leetCodeSolve;

import java.util.HashMap;
import java.util.Map;

public class Majorityelement169 {
    public static void main(String[] args) {
       /* int[] nums={2,2,3,3,3,2,2,2};
        int count=0;
        int temp=0;

        for (int num : nums) {
            if (count == 0) {
                temp = num;
            }
            if (num == temp) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(temp);*/

        int[] nums = {2, 2, 3, 3, 3, 2, 2, 2};

        Map<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2; ///  8/2=4 theke beshi hobe

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > majorityCount) {
                System.out.println(num);
                return;
            }
        }

    }
}
