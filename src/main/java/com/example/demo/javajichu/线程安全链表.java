package com.example.demo.javajichu;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class 线程安全链表 {

    private LinkedList<String> list;

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    //get
    public String get(Integer index){
        lock.readLock().lock();
        try{
            return   list.get(index);
        }finally {
            lock.readLock().unlock();
        }
    }

    //add_delete_update
    public void delete(Integer index){
        lock.writeLock().lock();
        try{
            list.remove(index);
        }finally {
            lock.writeLock().unlock();
        }
    }


}
