package com.example.demo.shejimoshi.chuangjianxing;

public class 装饰器模式 {
}

interface Shape{
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("画了圈");
    }
}

class CircleDecorator implements  Shape{

    private  Shape shape;

    public CircleDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        tool();
        shape.draw();
    }

    private void tool(){
        System.out.println("拿起红色铅笔");
    }
}