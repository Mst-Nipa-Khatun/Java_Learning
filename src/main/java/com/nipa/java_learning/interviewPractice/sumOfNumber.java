package com.nipa.java_learning.interviewPractice;

import java.util.Scanner;

public class sumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0,num,temp,r;
        System.out.print("Enter any Number :  ");
        num = input.nextInt();
        temp = num ;
        while(temp!= 0){
            r = temp % 10 ;
            sum = sum + r ;
            temp = temp / 10 ;
        }
        System.out.println("Sum of the Didits is :  "+sum);
    }
}
