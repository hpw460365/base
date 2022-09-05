package com.example.demo.shejimoshi.chuangjianxing;

public class 简单工厂类 {

    public Car produce(String name){
        if("Tesal".equals(name)){
            return new Tesla();
        }
        if("Baoma".equals(name)){
            return new Baoma();
        }
        return null;
    }



    interface Car {
        String name();
    }


    class Tesla implements Car {
        public String name(){
            return "Tesla";
        }
    }

    class Baoma implements Car {
        public String name(){
            return "Baoma";
        }
    }
}


