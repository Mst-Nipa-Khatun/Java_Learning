package com.nipa.java_learning.leetCodeSolve;

import java.util.Arrays;

public class OnePlus66 {
    public static void main(String[] args) {
        int[] digits = {9,1,2,3,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));

    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int current = digits[i];
            if (current < 9) {
                digits[i] = current + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
   /*
   public static void main(String[] args) {
        int[] digits = {4, 3, 2,  9};
        int[] digits2 = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            digits2[i] = digits[i];
            digits2[digits.length - 1] = digits[i] + 1;
        }
        System.out.println(Arrays.toString(digits2));
   }
 */
}
