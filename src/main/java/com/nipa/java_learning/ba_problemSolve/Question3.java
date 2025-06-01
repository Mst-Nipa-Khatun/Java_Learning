package com.nipa.java_learning.ba_problemSolve;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 4, 5, 8, 9, 12};
        //int n=15;
        //int missingEqu = [0] * (n + 1);

        System.out.println("Repeated Nuumbers: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
