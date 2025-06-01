package com.nipa.java_learning.celloscope;

import java.util.*;

public class ProgressBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();

        int total = n * k;
        int filled = total * t / 100;

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            if (filled >= k) {
                a[i] = k;
                filled -= k;
            } else {
                a[i] = filled;
                filled = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i != n - 1) System.out.print(" ");
        }
    }
}
