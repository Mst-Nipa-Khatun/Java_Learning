package com.nipa.java_learning.interviewPractice;

import java.util.Scanner;

public class palindromeTwoInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n,r,sum=0 ,temp;
        System.out.print("first number:");
        m=input.nextInt();
        System.out.print("end number:");
        n=input.nextInt();
        int totalpalindrome=0;
        for (int i = m; i <= n; i++) {
            temp = i;
            while(temp!=0){
                r=temp%10;
                sum=sum*10+r;
                temp=temp/10;
            }
            if( sum==i){
                totalpalindrome++;
            }
            sum=0;
        }
        System.out.println("total palindrome number="+totalpalindrome);

    }
}
