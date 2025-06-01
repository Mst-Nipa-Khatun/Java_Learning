package com.nipa.java_learning.interviewPractice;

import java.util.Scanner;

public class sumOfFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i, fact=0;
        System.out.println("enter a number:");
        n=input.nextInt();

        for(i=1; i<=n;i++)
        {
            fact= n*(n-1);
            System.out.println( i+  " sum of factorial value:" +fact);
        }
    }
}
