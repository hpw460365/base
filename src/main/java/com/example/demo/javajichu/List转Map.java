package com.example.demo.javajichu;

import java.util.ArrayList;

public class List转Map {


    void resolve(){
        ArrayList<String> list = new ArrayList<>();
        list.stream().toArray(String[]::new);
        list.stream().map(item->item.toLowerCase());
    }
}
