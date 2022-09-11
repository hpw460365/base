package com.example.demo.suanfa.dongtaiguihua;

public class 找零钱_完全 {

    int resolve(int n){
        int m[] = {1,3,5,7};
        int dp[] = new int[n+1];
        for(int i=0; i<m.length; i++){
            for(int j = m[0]; j<= n; j++){
                if(j == m[i]){
                    dp[j] = 1;
                }else if(m[i]< j){
                    dp[j] = dp[j-m[i]];
                }else {
                    dp[j] = Math.min(dp[j-m[i]], dp[j-m[i]]+1);
                }
            }
        }
        return dp[n];
    }
}
