package com.example.demo.suanfa.tanxinsuanfa;

public class 找零钱_限量 {


    public static void main(String[] args) {
        System.out.println(resolve(520));
    }

    private static int resolve(int k){
        int n = 5;
        int amount[]= {5,2,2,3,5};
        int value[] ={1,5,10,50,100};

        int num= 0;
        for(int i = n-1; i>=0; i--){
            int c =Math.min(k/value[i], amount[i]);
            k = k-c*value[i];
            num = num + c;
        }
        if(k != 0){
            return -1;
        }
        return  num;
    }

}
