package com.nipa.java_learning.leetCodeSolve;

import java.util.Scanner;

public class Palidrome09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum =0,num,temp,r;
        System.out.print("Enter any Number:");

        num = input.nextInt();
        temp = num ;
        while(temp!= 0){
            r = temp % 10 ;
            sum = sum*10 + r ;
            temp = temp / 10 ;
        }
        if(sum == num){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
