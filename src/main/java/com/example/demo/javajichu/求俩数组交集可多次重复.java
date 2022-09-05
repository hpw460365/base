package com.example.demo.javajichu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 求俩数组交集可多次重复 {

    List<String> resolve(String[] s1, String[] s2){
        List<String> result = new ArrayList<>();
        if(s1 == null || s2 == null || s1.length == 0 || s2.length ==0){
            return result;
        }
        for(String i : s1){
            for(int j= 0; j<s2.length; j++){
                if(i !=null && i.equals(s2[j])){
                    result.add(s2[j]);
                    s2[j] = null;
                    break;
                }
            }
        }
    }
}
