package com.example.demo.shejimoshi.chuangjianxing;

public class 代理模式 {

}

interface Bird{

    void fly();

    void eat();
}

class Penguin implements  Bird{

    @Override
    public void fly() {
        System.out.println("小鸟fly");
    }

    @Override
    public void eat() {
        System.out.println("小鸟eat");
    }
}

class PenguinProxy implements Bird{

    private Bird bird;

    public PenguinProxy(Bird bird){
        this.bird =bird;
    }

    @Override
    public void fly() {
        System.out.println("小鸟跳了一下");
        bird.fly();
    }

    @Override
    public void eat() {
        System.out.println("小鸟跳了一下");
        bird.eat();
    }
}