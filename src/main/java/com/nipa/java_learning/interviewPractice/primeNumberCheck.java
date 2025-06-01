package com.nipa.java_learning.interviewPractice;

import java.util.Scanner;

public class primeNumberCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter any number:");
        n=input.nextInt();
        for (int i =2; i <n; i++) {
            if(n%i==0){
                count++;
                break;
            }

        }if(count==0){
            System.out.println("Prime number");}
        else{
            System.out.println("Not Prime");}
    }
}
