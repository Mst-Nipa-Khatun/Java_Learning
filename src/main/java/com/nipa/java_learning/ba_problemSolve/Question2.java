package com.nipa.java_learning.ba_problemSolve;

import static java.util.EnumSet.range;

public class Question2 {
    public static void main(String[] args) {
       int total = 0;

       for (int i = 5; i <= 105; i++) {
           total += i;
           System.out.println("Total is " + total);
       }
    }
}
