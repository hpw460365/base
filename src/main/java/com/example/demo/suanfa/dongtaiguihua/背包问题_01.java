package com.example.demo.suanfa.dongtaiguihua;

public class 背包问题_01 {
    void resolve(){
        int items = 10;
        int capacity = 10;
        int[] weight = new int[items +1];
        int[] value = new int[items +1];
        int[][] dp = new int[items+1][capacity+1];
        for (int i = 0; i< items; i++){
            dp[i][0] = 0;
        }
        for (int j=0; j< capacity; j++ ){
            dp[0][j] =0 ;
        }

        for(int i =1; i< items; i++){
            for(int j =1; j<capacity; j++){
                if(j < weight[i]){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]]+value[i]);
                }
            }
        }
    }
}
