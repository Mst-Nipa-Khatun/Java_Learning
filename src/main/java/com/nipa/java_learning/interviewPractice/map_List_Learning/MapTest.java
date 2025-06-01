package com.nipa.java_learning.interviewPractice.map_List_Learning;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //not maintain insert order like: you insert key a,b,c  = output c,b,a
        //This is not thread safe.
        Map map = new HashMap();

        //maintain insert order like: you insert key a,b,c  = output a,b,c
        //This is also not thread safe
        Map mapT = new TreeMap();
        //Map map2 = new ConcurrentHashMap();
        for (int i = 0; i < 50; i++) {
            mapT.put(i+"_a"+System.nanoTime(),i);
        }
        mapT.keySet().forEach(System.out::println);


    }
    public synchronized void aaa(){
        //Example to write a thread safe method
        //Using synchronized java keyword we can make a method thread safe.
    }
}
