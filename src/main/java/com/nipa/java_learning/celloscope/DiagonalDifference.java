package com.nipa.java_learning.celloscope;

import java.util.*;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][n - i - 1];
        }

        int result = Math.abs(primarySum - secondarySum);
        System.out.println(result);
    }
}
