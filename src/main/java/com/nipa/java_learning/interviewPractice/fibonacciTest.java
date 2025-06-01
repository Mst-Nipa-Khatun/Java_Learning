package com.nipa.java_learning.interviewPractice;

import java.util.Scanner;

public class fibonacciTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fibo, i;
        int first = 0, second = 1;

        System.out.println("enter number:");
        n = input.nextInt();

        System.out.println("fibonacci series of " + n + " is : ");
        System.out.print(first + " " + second);
        for (i = 3; i <= n; i++) {
            fibo = first + second;
            first = second;
            second = fibo;

            System.out.println(" " + fibo);
        }

    }
}
