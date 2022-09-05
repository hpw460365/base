package com.example.demo.javajichu;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;

public class JAVA实现带过期时间的缓存 {
    //定义缓存hashMap
    private ConcurrentHashMap<String, Node> cache = new ConcurrentHashMap<>(128);
    //定义数据Node
    //定义操作，查增删
    Node get(String key){
        return cache.get(key);
    }
    void add(String key, Node node){
        cache.put(key, node);
    }
    void remove(String key){
        cache.remove(key);
    }

    Runnable r = ()->{
        while (true){
            cache.forEach((k,v)->{
                if(v.getExpiredTime().compareTo(LocalDateTime.now())<0){
                    cache.remove(k);
                }
            });
        }
    };

    public JAVA实现带过期时间的缓存() {
        new Thread(r).start();
    }
    //定义内存清理策略（30分钟清理一次）
}


class Node{
    private String value;
    private LocalDateTime expiredTime;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(LocalDateTime expiredTime) {
        this.expiredTime = expiredTime;
    }
}