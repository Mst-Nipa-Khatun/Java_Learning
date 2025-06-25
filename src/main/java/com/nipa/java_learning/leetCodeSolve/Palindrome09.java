package com.nipa.java_learning.leetCodeSolve;

public class Palindrome09 {
    public static void main(String[] args) {
        int x = 121;
        int sum = 0, r, temp;
        temp = x;
        while (temp> 0) {
            r = temp % 10;
            sum=sum*10+r;
            temp /= 10;
        }
        if(sum==x){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
