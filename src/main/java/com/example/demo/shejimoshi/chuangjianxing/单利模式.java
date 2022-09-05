package com.example.demo.shejimoshi.chuangjianxing;

public class 单利模式 {
}

class 饿汉{
    public static Object oj = new Object();

    public Object createSingTon(){
        return oj;
    }

}


class 懒汉{

    private 懒汉(){};
    public volatile Object oj;

    public Object createSingleTon(){
        if(oj !=null){
            synchronized (懒汉.class){
                if(oj !=null){
                    oj = new Object();
                }
            }
        }
        return oj;
    }
}
