package com.example.demo.javajichu;

import java.util.LinkedHashMap;
import java.util.Map;

public class JAVA实现LRU{

    private LinkedHashMap<String, String>  lru;

    private int capacity;

    JAVA实现LRU(int capacity){
        this.capacity = capacity;
        lru = new LinkedHashMap<String, String>(capacity, 0.75F, true){
            @Override
            protected  boolean removeEldestEntry(Map.Entry<String, String> eldest){
                return size() > capacity;
            }
        };
    }


    //get
    public void get(String a){
        lru.get(a);
    }


    //set
    public void set(String a, String b){
        lru.put(a,b);
    }

    public static void main(String[] args) {
            JAVA实现LRU java实现LRU = new JAVA实现LRU(3);
            java实现LRU.set("a","a");
            java实现LRU.set("b","b");
            java实现LRU.set("c","c");
            java实现LRU.set("d","d");
            java实现LRU.set("e","e");
            java实现LRU.get("c");
            java实现LRU.lru.forEach((k,v) ->{
                System.out.println(k+v);
            });
    }

}
