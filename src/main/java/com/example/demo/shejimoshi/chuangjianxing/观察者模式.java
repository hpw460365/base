package com.example.demo.shejimoshi.chuangjianxing;

import java.util.List;

public class 观察者模式 {
}

class Subject{
    List<Observer> observers;

    String content;

    void addObserver(){

    }

    void deleteObserver(){

    }

    void notifyObservers(String content){
        this.content = content;

        for(Observer observer: observers){
            observer.update();
        }
    }
}

interface Observer{

    void update();
}

class  Aobserver implements Observer{

    private Subject subject;

    public Aobserver(Subject subject){
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("收到 subject,内容为");
        System.out.println(subject.content);
    }
}
