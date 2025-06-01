package com.nipa.java_learning;

public class StringBuilderAndStringBufferExample {
    public static void main(String[] args) {
        /**
         * same as [StringBuilder] difference is [StringBuffer] is thread safe and
         * [StringBuilder] is not thread safe that's why this builder is faster than [StringBuffer]
         *
         */
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();
        builder.append("Hello World");
        builder.append("!");
        System.out.println(builder.toString());

        //System.out.println(builder.reverse().toString());//for reverse a string


        builder.delete(0, 6);
        System.out.println(builder.toString());
        int i = builder.indexOf("!");
        System.out.println(i);


        builder.deleteCharAt(5);
        System.out.println(builder.toString());


        builder.insert(5, " wow");
        System.out.println(builder.toString());


        builder.replace(5, 9, " nipa");
        System.out.println(builder.toString());
    }
}

