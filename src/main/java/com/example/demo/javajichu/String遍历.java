package com.example.demo.javajichu;

public class String遍历 {
    void resolve(String s){
        char[] c = s.toCharArray();
        for(char item: c){
            System.out.println(c.toString());
        }
    }
}
