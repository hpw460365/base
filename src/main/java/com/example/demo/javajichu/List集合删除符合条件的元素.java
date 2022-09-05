package com.example.demo.javajichu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class List集合删除符合条件的元素 {

    List<String> list = new ArrayList<>();
    void resolve(){
        List<String> collect = list.stream().filter(item->!"a".equals(item)).collect(Collectors.toList());
    }

}
