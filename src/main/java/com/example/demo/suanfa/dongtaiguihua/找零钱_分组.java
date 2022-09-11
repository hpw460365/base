package com.example.demo.suanfa.dongtaiguihua;

public class 找零钱_分组 {

    int resolve(int n){
        int m[] = {1,3,5,7};
        int dp[] = new int[n+1];
        for(int i=0; i<m.length; i++){
            for(int j = m[0]; j<= n; j++){
                for(int k =0; k*m[i]<=j; k++){
                    if(j == k*m[i]){
                        dp[j] = 1;
                    }else if(k*m[i]< j){
                        dp[j] = dp[j-k*m[i]];
                    }else {
                        dp[j] = Math.min(dp[j-k*m[i]], dp[j-k*m[i]]+1);
                    }
                }

            }
        }
        return dp[n];
    }
}
