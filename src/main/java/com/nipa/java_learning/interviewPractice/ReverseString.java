package com.nipa.java_learning.interviewPractice;

public class ReverseString {
    public static void main(String[] args) {
        String a = "nipa";

        String[] arr = a.split(""); // ["n", "i", "p", "a"]

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
//        int a=123;
//        String numberStr = String.valueOf(a);
//        String [] numbers = numberStr.split("");
//       for(String number : numbers)
//       {
//           System.out.print(number + " ");
//       }


    }
}
