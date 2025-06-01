package com.nipa.java_learning.interviewPractice;

import java.util.Scanner;

public class arrayDiogonalCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] A = new int [3][3];
        int sumOfDiagonal = 0;
        int sumOfUpper = 0;
        int sumOfLower = 0;

        System.out.println("Input A matrix element : ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }
        //diagonal,upper,lower
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sumOfDiagonal = sumOfDiagonal + A[row][col];
                }
                if (row<col) {
                    sumOfUpper = sumOfUpper + A[row][col];
                }
                if (row>col) {
                    sumOfLower = sumOfLower  + A[row][col];
                }
            }
        }

        System.out.println("Sum of Diagonal elements: "+sumOfDiagonal);
        System.out.println("Sum of upper elements : "+sumOfUpper);
        System.out.println("Sum of lower Elements: "+sumOfLower);

    }
}
