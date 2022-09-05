package com.example.demo.shejimoshi.chuangjianxing;

public class 外观莫斯 {
}

class RegisterEm{
    public void register(){
        System.out.println("登记");
    }
}

class FeeEm{
    public void fee(){
        System.out.println("收费");
    }
}


class Waiter{
    private RegisterEm registerEm;
    private FeeEm feeEm;
    public Waiter(RegisterEm registerEm, FeeEm feeEm){
        this.registerEm = registerEm;
        this.feeEm = feeEm;
    }

    public void service(){
        registerEm.register();
        feeEm.fee();
    }
}