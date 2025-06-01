package com.nipa.java_learning.interviewPractice;

import java.util.Scanner;

public class primeTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, sum=0,count = 0;
        int totalPrime = 0;

        System.out.println("Enter Number:");
        m = input.nextInt();

        System.out.println("Enter Number:");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    sum+=i;
                    break;
                }

            }
            if (count == 0) {
                System.out.println(i);
                totalPrime++;
            }
            count = 0;
        }
        System.out.println("Total sum of prime number between :"+m+" to "+n+ " = " +sum);
        System.out.println("Total = " + totalPrime);
    }
}
