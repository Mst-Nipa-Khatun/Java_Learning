package com.nipa.java_learning.interviewPractice;

import java.util.Arrays;

public class arrayAsenDesen {
    public static void main(String[] args) {
        int[] number={10,-2,3,8,5};
        Arrays.sort(number);
        System.out.println("Ascending:");
        for(int i=0;i<5;i++)
        {
            System.out.print(" "+number[i]);
        }
        System.out.println();
        System.out.println("Descending:");
        for(int i=4;i>=0;i--)
        {
            System.out.print(" "+number[i]);
        }
    }
}
