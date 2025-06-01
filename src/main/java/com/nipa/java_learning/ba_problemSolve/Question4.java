package com.nipa.java_learning.ba_problemSolve;

public class Question4 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=15;
        if((a>b && a<c) || (a>c && a<b)){
            System.out.println(a);
        }else if((a<b && a>c) || (a<c && a>b)){
            System.out.println(b );
        }
        else {
            System.out.println(c);
        }

    }
}
