package com.example.demo.shejimoshi.chuangjianxing;

public class 模板模式 {


}


abstract class CrudOpration{

    void startCrud(){
        initDriver();
        openSession();
        crud();
        closeSession();
    }

    void initDriver(){};
    void openSession(){};
    void closeSession(){}

    abstract void crud();

}

class AcrudOperation extends CrudOpration{

    @Override
    void crud() {
        System.out.println("A类具体的crud操作");
    }
}

class BcrudOperation extends CrudOpration{

    @Override
    void crud() {
        System.out.println("B类具体的crud操作");
    }
}