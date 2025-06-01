package com.nipa.java_learning.interviewPractice;

public class array2D {
    public static void main(String[] args) {
        int[][]num=new int[2][3];
        num[0][0]=1;
        num[0][1]=1;
        num[0][2]=1;
        num[1][0]=1;
        num[1][1]=1;
        num[1][2]=1;

        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {
                System.out.print(" "+num[row][col]);
            }
            System.out.println();

        }
    }
}
