package com.example.demo.shejimoshi.chuangjianxing;

public class 适配器模式 {
}

interface GPower{
    int output220v();
}

class Power220v implements GPower{

    @Override
    public int output220v() {
        return  220;
    }
}

interface LPower{
    int output5v();
}

class Power5v implements LPower{

    private GPower gPower;

    public Power5v(GPower gPower){
        this.gPower = gPower;
    }

    @Override
    public int output5v() {
       return gPower.output220v()/4;

    }
}
