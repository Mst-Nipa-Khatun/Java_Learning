package com.nipa.java_learning.interviewPractice;

public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append(" Hi Nipa");
        builder.append(".");
        System.out.println(builder.toString());

        builder.insert(0, "Hey Nipa,");
        System.out.println(builder.toString());

        builder.delete(5, 8);
        System.out.println(builder.toString());

        builder.deleteCharAt(8);
        System.out.println(builder.toString());

        builder.replace(5, 8, " Hlw");
        System.out.println(builder.toString());

        int a = builder.indexOf(".");
        System.out.println(a);

        String bb = "Hey N Hlw Nipa.";
        boolean b = builder.toString().equalsIgnoreCase(bb);
        System.out.println(b);

        System.out.println(builder.toString());
        StringBuilder b1 = new StringBuilder(builder.toString());

        //@info CONTENT SAME BUT RESULT IS FALSE BECAUSE OF THE DIFFERENT OBJECT (DIFFERENT MEMORY)
        System.out.println("builder object equal check result is : "+builder.equals(b1));

        boolean c = builder.isEmpty();
        System.out.println(c);

        builder.reverse();
        System.out.println(builder.toString());

        String a1 = "    nipa ";
        String a2 = "nipa";
        System.out.println(a1.trim().equals(a2));// to check trim method functionality

    }
}
