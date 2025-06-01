package com.nipa.java_learning.interviewPractice;

public class stringBuffer {
    public static void main(String[] args) {
//WrongCOde
        String s1 = "123";
        StringBuffer sb = new StringBuffer(s1);

        sb.reverse().toString();
        if (s1.equals(sb)) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }
}
