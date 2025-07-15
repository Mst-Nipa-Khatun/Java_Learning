package com.nipa.java_learning.leetCodeSolve;

import java.util.Arrays;

public class ValidAnargam242 {
    public static void main(String[] args) {
        String s="nagaram";
        String t="atagram";

        if(s.length()!=t.length()){
            System.out.println("Length of string does not match");
        }
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));

    }
}
