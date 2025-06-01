package com.nipa.java_learning.interviewPractice;

public class swappingNumber {
    public static void main(String[] args) {
        int a, b, temp;
        a = 5;
        b = 10;
        System.out.println("Before Swap: " + a + " and " + b);
        temp = a; //temp=5
        a = b; //a=10
        b = temp;  //b=5 from temp

        System.out.println("Swap values: = " + a + ", " + b);
    }
}
