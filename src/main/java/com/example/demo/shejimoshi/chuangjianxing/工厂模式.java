package com.example.demo.shejimoshi.chuangjianxing;

public class 工厂模式 {

    public Car getBaoma(){
        return new BaomaFactory().produce();
    }


    interface Factory{
        Car produce();
    }

    class BaomaFactory implements Factory{

        @Override
        public Car produce() {
            return new Baoma();
        }
    }

    interface Car {
        String name();
    }

    class Baoma implements Car{
        public String name(){
            return "Baoma";
        }
    }

}




