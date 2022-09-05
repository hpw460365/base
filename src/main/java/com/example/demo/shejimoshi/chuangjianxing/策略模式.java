package com.example.demo.shejimoshi.chuangjianxing;

public class 策略模式 {
}

interface Strategy{
    int licai(int money);
}

class Aplan implements Strategy{

    @Override
    public int licai(int money) {
        return money*2;
    }
}
class Bplan implements Strategy{

    @Override
    public int licai(int money) {
        return money*3;
    }
}

class Licai{
    private Strategy strategy;

    public Licai(Strategy strategy){
        this.strategy = strategy;
    }

    public int getResult(int money){
        return strategy.licai(money);
    }
}