package com.example.demo.suanfa.dongtaiguihua;

import java.util.Arrays;

public class 最长递增子序列 {

    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(result(arr));
    }

    static int result(int[] arr){
        int size= arr.length;
        int[] dp = new int[size];
        Arrays.fill(dp, 1);
        for(int i =1; i<size; i++ ){
            for(int j =0; j<i;j++){
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }

            }
        }
        return dp[size-1];
    }
}
