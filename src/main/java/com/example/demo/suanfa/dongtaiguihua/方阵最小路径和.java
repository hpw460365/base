package com.example.demo.suanfa.dongtaiguihua;

public class 方阵最小路径和 {

    public static void main(String[] args) {
//        int score[2][3]={{10,20,30},{60,70,80}};
        int[][] arr={{1,3,1}, {1,5,1},{4,2,1}};
        System.out.println(resolv(arr));

    }

    private static int resolv(int[][] arr){
        if(arr.length <= 0) return -1;
        int m = arr.length;
        int n = arr[0].length;

        int i, j;

        int[][] dp = new int[m][n];

        dp[0][0] = arr[0][0];

        for(j = 1; j< n; j++){
            dp[0][j] = dp[0][j-1] + arr[0][j];
        }
        for(i = 1; i< m; i++){
            dp[i][0] = dp[i][0] + arr[i][0];
        }

//        dp[0][0] = arr[0][0];
        for(i = 1; i<m; i++){
            for(j = 1; j<n; j++){
                dp[i][j] = arr[i][j] +Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];

    }

}
