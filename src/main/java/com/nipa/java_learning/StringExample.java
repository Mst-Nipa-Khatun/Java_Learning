package com.nipa.java_learning;

public class StringExample {
    public static void main(String[] args) {
        String names  = "kiBria Nipa";
        System.out.println(names);


        String[] nameList = names.split(" ");
        for (String s : nameList) {
            System.out.println(s.charAt(s.length()-1));
        }
    }
}
